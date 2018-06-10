package com.zhku.ccl.controller;
/**
 * 用户服务的控制器
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
	 * 进入到登录界面
	 * @return
	 */
	@RequestMapping("account")
	public String account(){
		return "account/login";
	}
	
	/**
	 *进入到注册界面
	 * @return
	 */
	@RequestMapping("reg")
	public String showRegister(){
		return "account/register";
	}
	
	/**
	 * 接收表单数据并进行注册
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
	 * 接收表单数据并进行登录
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
