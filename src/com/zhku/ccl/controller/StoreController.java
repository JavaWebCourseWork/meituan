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
	 * ���ִ���
	 * org.apache.ibatis.binding.BindingException: 
	 * Invalid bound statement (not found): 
	 * com.zhku.ccl.service.StoreService.getStoreInfo
	 * ��һ��ԭ��Resourceע���������ע�룬Ҫд�ű�����
	 * �ڶ���ԭ��Controller��Serviceע��Ҫд
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