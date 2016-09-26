
package com.rabbit.service.impl;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.dao.AuthFunMapper;
import com.rabbit.model.AuthFun;
import com.rabbit.model.AuthFunExample;
import com.rabbit.service.IAuthFunService;

@Service
public class AuthFunServiceImp extends BaseServiceImp<AuthFun, AuthFunExample> implements IAuthFunService {

	AuthFunMapper authFunMapper;
	@Autowired
	public void setAuthFunMapper(AuthFunMapper authFunMapper) {
		this.authFunMapper = authFunMapper;
		this.setBaseMapper(authFunMapper);
	}

}

