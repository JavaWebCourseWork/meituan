package com.zhku.ccl.mapper;

import com.zhku.ccl.domain.Orderfood;
import com.zhku.ccl.domain.OrderfoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderfoodMapper {
    int countByExample(OrderfoodExample example);

    int deleteByExample(OrderfoodExample example);

    int deleteByPrimaryKey(Integer ofid);

    int insert(Orderfood record);

    int insertSelective(Orderfood record);

    List<Orderfood> selectByExample(OrderfoodExample example);

    Orderfood selectByPrimaryKey(Integer ofid);

    int updateByExampleSelective(@Param("record") Orderfood record, @Param("example") OrderfoodExample example);

    int updateByExample(@Param("record") Orderfood record, @Param("example") OrderfoodExample example);

    int updateByPrimaryKeySelective(Orderfood record);

    int updateByPrimaryKey(Orderfood record);
}