package com.zhku.ccl.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhku.ccl.domain.Food;
import com.zhku.ccl.domain.Foodtag;
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
		List<Foodtag> foodTag = storeServiceImpl.getStoreMune((Integer)session.getAttribute("uid"));
		List<Food> foodList = storeServiceImpl.getStoreFoods((Integer)session.getAttribute("uid"));
		System.out.println(foodList);
		map.put("store", store);
		map.put("menu", foodTag);
		map.put("items", foodList);
		model.addAttribute("storeData", map);
		return "seller/storeAll";
	}
	
	/**
	 * ��¼�û����
	 * ���յ���ID����ƷID����Ʒ���������һ��Map�У�������session�У�
	 * һ��Map��¼һ���û���һ�����̵ĵ�����
	 * @param session
	 * @param sid
	 * @param fid
	 * @param count
	 */
	@RequestMapping("alterCount")
	public void alterFoodCount(HttpSession session,String sid,String fid,String count){
		Object attr = session.getAttribute(sid);
		if(attr == null){
			HashMap map = new HashMap();
			session.setAttribute(sid, map);
		}
		HashMap map = (HashMap) session.getAttribute(sid);
		int num = Integer.parseInt(count);
		if(num == 0){
			map.remove(fid);
		}else{
			map.put(fid, num);
		}
		return;
	}
}