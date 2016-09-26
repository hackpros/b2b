package com.jumore.b2b.daren.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.stereotype.Service;

import com.jumore.b2b.daren.mapper.UserMapper;
import com.jumore.b2b.daren.model.User;
import com.jumore.b2b.daren.model.UserQueryHelper;
import com.jumore.b2b.daren.service.IUserService;
@Service
public class UserServiceImpl extends BaseServiceImp<User, UserQueryHelper> implements IUserService {

	static final Logger log = LogManager.getLogger(UserServiceImpl.class);;

	UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
		super.setBaseMapper(userMapper);
	}

	

}