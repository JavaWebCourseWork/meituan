package com.zhku.ccl.mapper;

import com.zhku.ccl.domain.Foodtag;
import com.zhku.ccl.domain.FoodtagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodtagMapper {
    int countByExample(FoodtagExample example);

    int deleteByExample(FoodtagExample example);

    int deleteByPrimaryKey(Integer ftagid);

    int insert(Foodtag record);

    int insertSelective(Foodtag record);

    List<Foodtag> selectByExample(FoodtagExample example);

    Foodtag selectByPrimaryKey(Integer ftagid);

    int updateByExampleSelective(@Param("record") Foodtag record, @Param("example") FoodtagExample example);

    int updateByExample(@Param("record") Foodtag record, @Param("example") FoodtagExample example);

    int updateByPrimaryKeySelective(Foodtag record);

    int updateByPrimaryKey(Foodtag record);
}