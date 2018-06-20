package com.zhku.ccl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Orders;
import com.zhku.ccl.domain.Users;
import com.zhku.ccl.mapper.OrdersMapper;
import com.zhku.ccl.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService {

	
	@Resource
	private OrdersMapper ordersMapper;
	
	public Orders selectByPrimaryKey(int oid) {
		Orders orders = ordersMapper.selectByPrimaryKey(oid);
		return orders;
	}


	public void updateByID(Orders orders) {
		ordersMapper.updateByID(orders);
	}


	@Override
	public Users selectUserAndOrderfood() {
		
		Users users = ordersMapper.selectUserAndOrderfood();
		
		return users;
	}


	@Override
	public Users selectUserAndOrderfoodByOid(Integer oid) {
		Users users = ordersMapper.selectUserAndOrderfoodByOid(oid);
		return users;
	}


	@Override
	public void insertOrders(Orders orders) {
		ordersMapper.insertOrders(orders);
	}


	@Override
	public List<Orders> selectBySidAndDid(Orders orders) {
		List<Orders> ordersList = ordersMapper.selectBySidAndDid(orders);
		return ordersList;
	}
	


}
