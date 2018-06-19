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
	 * 记录用户点菜
	 * 接收店铺ID、商品ID、商品数量存放在一个Map中，并放入session中，
	 * 一个Map记录一个用户在一个店铺的点餐情况
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