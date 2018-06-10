package com.zhku.ccl.service;

import com.zhku.ccl.domain.Users;

public interface UsersService {

	int register(Users user);

	int login(Users user);

}
