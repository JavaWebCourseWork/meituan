package com.zhku.ccl.service;

import java.util.List;

import com.zhku.ccl.domain.Dictionary;
import com.zhku.ccl.domain.Store;
import com.zhku.ccl.domain.Users;

public interface UsersService {

	int register(Users user);

	Users login(Users user);

	List<Dictionary> getDictionary(String string);

	void updateUroleByUid(Integer sid,String urole);

	int insertStore(Store store);

}
