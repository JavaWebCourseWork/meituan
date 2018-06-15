package com.zhku.ccl.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.ccl.domain.Store;
import com.zhku.ccl.service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreController {
	@Resource(name="storeServiceImpl")
	private StoreService storeServiceImpl;
	/**
	 * 出现错误
	 * org.apache.ibatis.binding.BindingException: 
	 * Invalid bound statement (not found): 
	 * com.zhku.ccl.service.StoreService.getStoreInfo
	 * 第一种原因：Resource注解根据名称注入，要写号变量名
	 * 第二种原因：Controller，Service注解要写
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping("showStore")
	public String getStoreInfo(HttpSession session,Model model){
		HashMap map = new HashMap();
		Store store = storeServiceImpl.getStoreInfo((Integer)session.getAttribute("uid"));
		map.put("store", store);
		model.addAttribute("storeData", map);
		return "seller/storeAll";
	}
}