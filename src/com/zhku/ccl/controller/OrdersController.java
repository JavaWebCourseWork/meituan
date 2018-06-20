package com.zhku.ccl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhku.ccl.domain.Address;
import com.zhku.ccl.domain.Food;
import com.zhku.ccl.domain.Orders;
import com.zhku.ccl.domain.Users;
import com.zhku.ccl.service.AddressService;
import com.zhku.ccl.service.OrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Resource
	private OrdersService ordersServiceImpl;
	@Resource
	private AddressService addressServiceImpl;
//	@Resource
//	private FoodService foodServiceImpl;
	
	/**
	 * ����ҳ�洫�ݹ����Ķ�������oid,���ضԸ��û�������������Ϣ
	 * @param model
	 * @param oid
	 * @return		User
	 */
	@RequestMapping("toordertail")
	public String ordertail(Model model,Integer oid){
		oid = 1;
		Users users = ordersServiceImpl.selectUserAndOrderfoodByOid(oid);
		
		model.addAttribute("users", users);
		return "orders/orderdetail";
	}
	
	/**
	 * ����ҳ�洫�ݹ�����orders����oid��did�Ѿ���ֵ�����޸Ķ���idΪoid�Ķ���״̬��ֵdid
	 * @param orders
	 * @return
	 */
	@RequestMapping("changoid")
	public @ResponseBody Orders changoid(@RequestBody Orders orders){
		ordersServiceImpl.updateByID(orders);
		return orders;
	}
	
	
	

	/**
	 * ��ѯ����ɶ�����Ϣ����Ҫ����sid,ע��Orders������
	 * @param sid did = 4
	 * @param model
	 * @return
	 */
	@RequestMapping("tofinishorders")
	public String ordersstore1(Orders orders,Model model){
		orders.setDid(4);
		List<Orders> ordersList = ordersServiceImpl.selectBySidAndDid(orders);
		model.addAttribute("ordersList", ordersList);
		return "store/finishorders";
	}
	
	/**
	 * ��ѯ����ߵ�������Ϣ����Ҫ����sid,ע��Orders ������
	 * 				sid   ,  did  = 3
	 * @return
	 */
	@RequestMapping("tohurryorders")
	public String tosuccess2(Orders orders,Model model){
		orders.setDid(3);
		List<Orders> ordersList = ordersServiceImpl.selectBySidAndDid(orders);
		model.addAttribute("ordersList", ordersList);
		return "store/hurryorders";
	}
	
	/**
	 * ��ѯ�˿����Ϣ����Ҫ����sid,ע��Orders ������
	 * 				sid , did = 5
	 * @param model 
	 * @return
	 */
	@RequestMapping("torefundorders")
	public String tofinishorders(Orders orders,Model model){
		orders.setDid(5);
		List<Orders> ordersList = ordersServiceImpl.selectBySidAndDid(orders);
		model.addAttribute("ordersList", ordersList);
		return "store/refundorders";
	}
	
	/**
	 * ��ѯ�µĶ�����Ϣ����Ҫ����sid,ע��Orders ������
	 * 				sid , did = 1
	 * @param model 
	 * @return
	 */
	@RequestMapping("toneworders")
	public String toneworders(Orders orders,Model model){
		orders.setDid(1);
		List<Orders> ordersList = ordersServiceImpl.selectBySidAndDid(orders);
		model.addAttribute("ordersList", ordersList);
		return "store/neworders";
	}
	
	/**
	 * ��ѯ�ӵ��Ķ�����Ϣ����Ҫ����sid,ע��Orders ������
	 * 				sid , did = 2
	 * @param model 
	 * @return
	 */
	@RequestMapping("togetorders")
	public String togetorders(Orders orders,Model model){
		orders.setDid(2);
		List<Orders> ordersList = ordersServiceImpl.selectBySidAndDid(orders);
		model.addAttribute("ordersList", ordersList);
		return "store/getorders";
	}
	
	/**
	 * ȷ���˿�
	 * ����ҳ�洫������oid���޸Ķ���״̬Ϊ6
	 */
	@RequestMapping("updateByOid/{oid}")
	public String updateByOid(@PathVariable int oid){
		Orders orders = new Orders();
		orders.setOid(oid);
		orders.setDid(6);
		ordersServiceImpl.updateByID(orders);
		return "store/null";
	}
	
	/**
	 * �ӵ�
	 * ����ҳ�洫������oid���޸Ķ���״̬Ϊ2
	 */
	@RequestMapping("updateByOid1/{oid}")
	public String updateByOid1(@PathVariable int oid){
		Orders orders = new Orders();
		orders.setOid(oid);
		orders.setDid(2);
		ordersServiceImpl.updateByID(orders);
		return "store/null";
	}
	
	
	/**
	 * ��־��
	 * �����µ�ҳ�棬��Ҫ���ݣ�uid��sid,ofid,�Լ�ofid������
	 * @return
	 */
	@RequestMapping("topayorder")
	public String topayorder(Integer sid,HttpSession httpSession){
//		System.out.println(sid);
//		HashMap<String,String> map = (HashMap)httpSession.getAttribute(""+sid);
//		Iterator it = map.entrySet().iterator();
//		List<Food> listFood = new ArrayList<Food>();
//		 while (it.hasNext()) {  
//			   Map.Entry entry = (Map.Entry) it.next();
//			   String fid = (String) entry.getKey();
//			   String value = (String) entry.getValue(); 
//			   Food food = foodServiceImpl.selectByPrimaryKey(Integer.parseInt(fid));
//			   listFood.add(food);
//			  }  
		return "orders/payorder";
	}
	
	@RequestMapping("tostoreorders")
	public String tostoreorders(){
		
		return "store/storeorders";
	}
	
	
	/**
	 * ��ӵ�ַ�����ص�ַ����
	 * @param address
	 * @return
	 */
	@RequestMapping("form")
	public @ResponseBody Address form(@RequestBody Address address){
		addressServiceImpl.insertAddress(address);
		Address addr = addressServiceImpl.selectByPrimaryKey(address.getAid());
		return addr;
	}
	
	//���������ص�
	@RequestMapping("test")
	public void test(){
		Orders orders = new Orders();
		orders.setDid(2);
		orders.setSid(1);
		orders.setAid(1);
		ordersServiceImpl.insertOrders(orders);
		System.out.println(orders.getOid());
	}


}
