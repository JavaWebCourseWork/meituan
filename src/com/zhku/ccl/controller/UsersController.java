package com.zhku.ccl.controller;
/**
 * 用户服务的控制器
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
//	 * 第二种进入首页的方法 
//	 * @return
//	 */
//	@RequestMapping("index")
//	public String index(){
//		return "index";
//	}
	
	/**
	 * 进入到登录界面
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
	public String register(Users user,Model model){
		int flag = usersServiceImpl.register(user);
		if(flag == 1){
			model.addAttribute("refleshUrl", "/user/account.do");
			model.addAttribute("promptMsg", "注册成功！！！");
			model.addAttribute("pageName", "登录");
			return "success";
		}
		return "error";
	}
	
	/**
	 * 接收表单数据并进行登录
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
	 * 根据登录状态，跳转到对应的店铺注册的界面
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
	 * 接收营业执照、法人数据，并跳转到店铺详细信息页面
	 * @return
	 */
	@RequestMapping("regMasterInfo")
	public String regMasterInfo(HttpSession session,Store store,Model model){
		System.out.println(session.getAttribute("uid")+""+(Integer)session.getAttribute("uid"));
		List<Dictionary> list = usersServiceImpl.getDictionary("店铺标签");
		session.setAttribute("slicence", store.getSlicence());
		session.setAttribute("smaster", store.getSmaster());
		model.addAttribute("storeSort", list);
		return "account/regStoreInfo";
	}
	
	/**
	 * 接收店铺详细信息，完成入驻
	 * @return
	 */
	@RequestMapping("regStoreInfo")
	public String regStoreInfo(HttpSession session,Store store,Model model){
		store.setSid((Integer)session.getAttribute("uid"));
		store.setSlicence((String)session.getAttribute("slicence"));
		store.setSmaster((String)session.getAttribute("smaster"));
		//接下来要用事务处理
		usersServiceImpl.insertStore(store);
		usersServiceImpl.updateUroleByUid(store.getSid(),"店铺");
		System.out.println(store);		
		return "success";
	}
}
