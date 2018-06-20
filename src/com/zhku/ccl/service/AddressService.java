package com.zhku.ccl.service;

import com.zhku.ccl.domain.Address;

public interface AddressService {

	void insertAddress(Address address);

	Address selectByPrimaryKey(Integer aid);


}
