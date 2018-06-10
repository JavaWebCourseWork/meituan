package com.zhku.ccl.controller;
/**
 * �û�����Ŀ�����
 */


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.ccl.domain.Users;
import com.zhku.ccl.service.UsersService;

@Controller
@RequestMapping("/user")
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	
	/**
	 * ���뵽��¼����
	 * @return
	 */
	@RequestMapping("account")
	public String account(){
		return "account/login";
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
	public String register(Users user){
		int flag = usersServiceImpl.register(user);
		if(flag == 1){
			return "success";
		}
		return "error";
	}
	
	/**
	 * ���ձ����ݲ����е�¼
	 * @return
	 */
	@RequestMapping("login")
	public String login(Users user){
		int flag = usersServiceImpl.login(user);
		if(flag == 1){
			return "success";
		}
		return "error";
	}
	@RequestMapping("success")
	public String success(){
		System.out.println("hahaha");
		return "success";
		
	}
}
