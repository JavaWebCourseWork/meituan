package com.zhku.ccl.service;


import java.util.List;

import com.zhku.ccl.domain.Orders;
import com.zhku.ccl.domain.Users;

public interface OrdersService {

	Orders selectByPrimaryKey(int oid);


	void updateByID(Orders orders);


	Users selectUserAndOrderfood();


	Users selectUserAndOrderfoodByOid(Integer oid);


	void insertOrders(Orders orders);


	List<Orders> selectBySidAndDid(Orders orders);

	
}
