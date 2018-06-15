package com.zhku.ccl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Store;
import com.zhku.ccl.mapper.StoreMapper;
import com.zhku.ccl.service.StoreService;
@Service
public class StoreServiceImpl implements StoreService {
	@Resource
	private StoreMapper storeMapper;

	public Store getStoreInfo(Integer sid) {		
		return storeMapper.selectByPrimaryKey(sid);
	}

}
