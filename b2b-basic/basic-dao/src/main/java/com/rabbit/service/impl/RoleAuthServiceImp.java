
package com.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.RoleAuthMapper;
import com.rabbit.model.RoleAuth;
import com.rabbit.model.RoleAuthExample;
import com.rabbit.service.IRoleAuthService;

@Service
public class RoleAuthServiceImp 
	extends BaseServiceImp<RoleAuth, RoleAuthExample> implements IRoleAuthService {
	
	
	RoleAuthMapper roleAuthMapper;
	@Autowired
	public void setRoleAuthMapper(RoleAuthMapper roleAuthMapper) {
		this.roleAuthMapper = roleAuthMapper;
		this.setBaseMapper(roleAuthMapper);
	}
	
}


