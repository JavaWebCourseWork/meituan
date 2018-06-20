package com.zhku.ccl.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhku.ccl.domain.Dictionary;
import com.zhku.ccl.domain.DictionaryExample;
import com.zhku.ccl.domain.DictionaryExample.Criteria;
import com.zhku.ccl.domain.Store;
import com.zhku.ccl.domain.Users;
import com.zhku.ccl.mapper.DictionaryMapper;
import com.zhku.ccl.mapper.StoreMapper;
import com.zhku.ccl.mapper.UsersMapper;
import com.zhku.ccl.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	@Resource
	private DictionaryMapper dictionaryMapper;
	@Resource
	private StoreMapper storeMapper;
	
	/**
	 * 手机号码验证
	 */
	public int checkRegister(Users user) {
		Users dbUser = usersMapper.selectByPhone(user.getUphone());
		if(dbUser == null){
			return 1;
		}
		return 0;
		
	}
	/**
	 * 注册验证
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
	 * 登录验证
	 */
	public Users login(Users user) {
		Users dbUser = usersMapper.selectByPhoneAndPassword(user);
		return dbUser;
		
	}

	/**
	 * 从数据字典取数据
	 */
	public List<Dictionary> getDictionary(String string) {
		DictionaryExample example = new DictionaryExample();
		Criteria criteria = example.createCriteria();
		criteria.andDclassifyEqualTo(string);
		List<Dictionary> list = dictionaryMapper.selectByExample(example);
		return list;
	}

	@Override
	public void updateUroleByUid(Integer sid,String urole) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("sid", sid);
		map.put("urole", urole);
		usersMapper.updateUroleByUid(map);
	}

	public int insertStore(Store store) {
		int s = storeMapper.insert(store);
		System.out.println("sql:"+s);
		return 0;
	}

}
