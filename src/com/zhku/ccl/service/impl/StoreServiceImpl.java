package com.zhku.ccl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Food;
import com.zhku.ccl.domain.FoodExample;
import com.zhku.ccl.domain.Foodtag;
import com.zhku.ccl.domain.FoodtagExample;
import com.zhku.ccl.domain.FoodtagExample.Criteria;
import com.zhku.ccl.domain.Store;
import com.zhku.ccl.mapper.FoodMapper;
import com.zhku.ccl.mapper.FoodtagMapper;
import com.zhku.ccl.mapper.StoreMapper;
import com.zhku.ccl.service.StoreService;
@Service
public class StoreServiceImpl implements StoreService {
	@Resource
	private StoreMapper storeMapper;
	@Resource
	private FoodtagMapper foodtagMapper;
	@Resource 
	private FoodMapper foodMapper;

	public Store getStoreInfo(Integer sid) {		
		return storeMapper.selectByPrimaryKey(sid);
	}

	@Override
	public List<Foodtag> getStoreMune(Integer sid) {
		FoodtagExample example = new FoodtagExample();
		Criteria criteria = example.createCriteria();
		criteria.andSidEqualTo(sid);
		List<Foodtag> list = foodtagMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Food> getStoreFoods(Integer sid) {
		FoodExample example = new FoodExample();
		com.zhku.ccl.domain.FoodExample.Criteria criteria = example.createCriteria();
		criteria.andSidEqualTo(sid);
		List<Food> list = foodMapper.selectByExample(example);
		return list;
	}

	@Override
	public int updateStoreInfo(Store store) {
		return storeMapper.updateByPrimaryKey(store);
	}

}
