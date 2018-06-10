package com.zhku.ccl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Users;
import com.zhku.ccl.mapper.UsersMapper;
import com.zhku.ccl.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	/**
	 * ע����֤
	 */
	public int register(Users user) {
		Users dbUser = usersMapper.selectByPhone(user.getUphone());
		if(dbUser == null){
			usersMapper.insert(user);
			return 1;
		}
		return 0;
		
	}
	
	/**
	 * ��¼��֤
	 */
	public int login(Users user) {
		Users dbUser = usersMapper.selectByPhoneAndPassword(user);
		if(dbUser == null){
			return 0;
		}
		return 1;
		
	}

}
