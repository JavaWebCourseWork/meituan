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
		//把Request强转成多部件请求对象
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		//根据文件名称获取文件对象
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		//获取文件上传流
		byte[] fbytes = cm.getBytes();
		
		//文件名称在服务器有可能重复？
		String newFileName="";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sdf.format(new Date());
		
		Random r = new Random();
		
		for(int i =0 ;i<3;i++){
			newFileName=newFileName+r.nextInt(10);
		}
		
		//获取文件扩展名
		String originalFilename = cm.getOriginalFilename();
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		
		// 创建一个文件存盘的目录
		String directoryRealPath = request.getServletContext().getRealPath("/upload/licences");
		File storeDirectory = new File(directoryRealPath);// 即代表文件又代表目录
		if (!storeDirectory.exists()) {
			storeDirectory.mkdirs();// 创建一个指定的目录
		}
		File file = new File(directoryRealPath,newFileName+suffix);
		file.createNewFile();
		FileOutputStream  fos = new FileOutputStream(file);  
		BufferedOutputStream  bos = new BufferedOutputStream(fos);  
		bos.write(fbytes);  
		
		//ajax回调函数需要会写回什么东西？
		//图片需要回显：需要图片完整路径
		//数据库保存图片的相对路径.
		String fullPath = "/meituan/upload/licences/"+newFileName+suffix;
		String relativePath="/upload/licences/"+newFileName+suffix;
		//{"":"","":""}
		String result="{\"fullPath\":\""+fullPath+"\",\"relativePath\":\""+relativePath+"\"}";
		
		out.print(result);		
	}
}
