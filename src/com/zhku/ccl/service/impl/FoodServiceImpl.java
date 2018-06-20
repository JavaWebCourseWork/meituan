package com.zhku.ccl.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Food;
import com.zhku.ccl.mapper.FoodMapper;
import com.zhku.ccl.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Resource
	private FoodMapper foodMapper;
	public Food selectByPrimaryKey(int parseInt) {
		Food food = foodMapper.selectByPrimaryKey(parseInt);
		return food;
	}

}
