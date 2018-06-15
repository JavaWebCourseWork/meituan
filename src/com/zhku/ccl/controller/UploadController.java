package com.zhku.ccl.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping("uploadPic")
	public void uploadPic(HttpServletRequest request,String fileName,PrintWriter out)throws IOException{
		//��Requestǿת�ɶಿ���������
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		//�����ļ����ƻ�ȡ�ļ�����
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		//��ȡ�ļ��ϴ���
		byte[] fbytes = cm.getBytes();
		
		//�ļ������ڷ������п����ظ���
		String newFileName="";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sdf.format(new Date());
		
		Random r = new Random();
		
		for(int i =0 ;i<3;i++){
			newFileName=newFileName+r.nextInt(10);
		}
		
		//��ȡ�ļ���չ��
		String originalFilename = cm.getOriginalFilename();
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		
		// ����һ���ļ����̵�Ŀ¼
		String directoryRealPath = request.getServletContext().getRealPath("/upload/licences");
		File storeDirectory = new File(directoryRealPath);// �������ļ��ִ���Ŀ¼
		if (!storeDirectory.exists()) {
			storeDirectory.mkdirs();// ����һ��ָ����Ŀ¼
		}
		File file = new File(directoryRealPath,newFileName+suffix);
		file.createNewFile();
		FileOutputStream  fos = new FileOutputStream(file);  
		BufferedOutputStream  bos = new BufferedOutputStream(fos);  
		bos.write(fbytes);  
		
		//ajax�ص�������Ҫ��д��ʲô������
		//ͼƬ��Ҫ���ԣ���ҪͼƬ����·��
		//���ݿⱣ��ͼƬ�����·��.
		String fullPath = "/meituan/upload/licences/"+newFileName+suffix;
		String relativePath="/upload/licences/"+newFileName+suffix;
		//{"":"","":""}
		String result="{\"fullPath\":\""+fullPath+"\",\"relativePath\":\""+relativePath+"\"}";
		
		out.print(result);		
	}
}
