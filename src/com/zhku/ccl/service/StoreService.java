package com.zhku.ccl.service;

import java.util.List;

import com.zhku.ccl.domain.Food;
import com.zhku.ccl.domain.Foodtag;
import com.zhku.ccl.domain.Store;


public interface StoreService {

	Store getStoreInfo(Integer sid);

	List<Foodtag> getStoreMune(Integer attribute);

	List<Food> getStoreFoods(Integer attribute);

}
