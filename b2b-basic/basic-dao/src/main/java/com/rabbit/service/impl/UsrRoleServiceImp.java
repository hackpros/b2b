package com.rabbit.service.impl;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.dao.UsrRoleMapper;
import com.rabbit.model.UsrRole;
import com.rabbit.model.UsrRoleExample;
import com.rabbit.service.IUsrRoleService;

@Service
public class UsrRoleServiceImp extends BaseServiceImp<UsrRole, UsrRoleExample>
		implements IUsrRoleService {

	UsrRoleMapper usrRoleMapper;

	@Autowired
	public void setUsrRoleMapper(UsrRoleMapper usrRoleMapper) {
		this.usrRoleMapper = usrRoleMapper;
		this.setBaseMapper(usrRoleMapper);
	}
}
