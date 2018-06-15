package com.zhku.ccl.controller;
/**
 * �û�����Ŀ�����
 */


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.ccl.domain.Dictionary;
import com.zhku.ccl.domain.Store;
import com.zhku.ccl.domain.Users;
import com.zhku.ccl.service.UsersService;

@Controller
@RequestMapping("/user")
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
//	/**
//	 * �ڶ��ֽ�����ҳ�ķ��� 
//	 * @return
//	 */
//	@RequestMapping("index")
//	public String index(){
//		return "index";
//	}
	
	/**
	 * ���뵽��¼����
	 * @return
	 */
	@RequestMapping("account")
	public String account(HttpSession session){
		Object attribute = session.getAttribute("uid");
		if(attribute == null){
			return "account/login";
		}else{
			return "forward:/user/regStore.do";
		}
		
	}
	
	/**
	 *���뵽ע�����
	 * @return
	 */
	@RequestMapping("reg")
	public String showRegister(){
		return "account/register";
	}
	
	/**
	 * ���ձ����ݲ�����ע��
	 * @param user
	 * @return
	 */
	@RequestMapping("register")
	public String register(Users user,Model model){
		int flag = usersServiceImpl.register(user);
		if(flag == 1){
			model.addAttribute("refleshUrl", "/user/account.do");
			model.addAttribute("promptMsg", "ע��ɹ�������");
			model.addAttribute("pageName", "��¼");
			return "success";
		}
		return "error";
	}
	
	/**
	 * ���ձ����ݲ����е�¼
	 * @return
	 */
	@RequestMapping("login")
	public String login(HttpSession session,Users user){
		Users dbUser = usersServiceImpl.login(user);
		if(dbUser == null){
			return "error";
		}else{
			session.setAttribute("uid", dbUser.getUid());
			return "index";
		}
	}
	
	/**
	 * ���ݵ�¼״̬����ת����Ӧ�ĵ���ע��Ľ���
	 * @return
	 */
	@RequestMapping("regStore")
	public String regStore(HttpSession session,Model model){
		model.addAttribute("slicence", session.getAttribute("slicence"));
		model.addAttribute("smaster", session.getAttribute("smaster"));
		System.out.println(session.getAttribute("slicence")+"---"+session.getAttribute("smaster"));
		return "account/regMasterInfo";
		
	}
	
	/**
	 * ����Ӫҵִ�ա��������ݣ�����ת��������ϸ��Ϣҳ��
	 * @return
	 */
	@RequestMapping("regMasterInfo")
	public String regMasterInfo(HttpSession session,Store store,Model model){
		System.out.println(session.getAttribute("uid")+""+(Integer)session.getAttribute("uid"));
		List<Dictionary> list = usersServiceImpl.getDictionary("���̱�ǩ");
		session.setAttribute("slicence", store.getSlicence());
		session.setAttribute("smaster", store.getSmaster());
		model.addAttribute("storeSort", list);
		return "account/regStoreInfo";
	}
	
	/**
	 * ���յ�����ϸ��Ϣ�������פ
	 * @return
	 */
	@RequestMapping("regStoreInfo")
	public String regStoreInfo(HttpSession session,Store store,Model model){
		store.setSid((Integer)session.getAttribute("uid"));
		store.setSlicence((String)session.getAttribute("slicence"));
		store.setSmaster((String)session.getAttribute("smaster"));
		//������Ҫ��������
		usersServiceImpl.insertStore(store);
		usersServiceImpl.updateUroleByUid(store.getSid(),"����");
		System.out.println(store);		
		return "success";
	}
}
