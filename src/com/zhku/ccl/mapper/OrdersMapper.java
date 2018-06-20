package com.zhku.ccl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhku.ccl.domain.Orders;
import com.zhku.ccl.domain.OrdersExample;
import com.zhku.ccl.domain.Users;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Integer oid);

    //---------------------------------
	void updateByID(Orders orders);
    
    Users selectUserAndOrderfood();

	Users selectUserAndOrderfoodByOid(Integer oid);

	void insertOrders(Orders orders);

	List<Orders> selectBySidAndDid(Orders orders);
}