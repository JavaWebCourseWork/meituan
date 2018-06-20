package com.zhku.ccl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Address;
import com.zhku.ccl.mapper.AddressMapper;
import com.zhku.ccl.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Resource
	private AddressMapper addressMapper;

	public void insertAddress(Address address) {
		addressMapper.insertAddress(address);
	}

	public Address selectByPrimaryKey(Integer aid) {
		Address address = addressMapper.selectByPrimaryKey(aid);
		return address;
	}
	
	

}
