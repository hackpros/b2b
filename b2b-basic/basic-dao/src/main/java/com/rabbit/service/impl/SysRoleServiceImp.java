package com.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysRoleMapper;
import com.rabbit.model.SysRole;
import com.rabbit.model.SysRoleExample;
import com.rabbit.service.ISysRoleService;

@Service
public class SysRoleServiceImp extends BaseServiceImp<SysRole, SysRoleExample>
		implements ISysRoleService {

	SysRoleMapper sysRoleMapper;

	@Autowired
	public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
		this.sysRoleMapper = sysRoleMapper;
		this.setBaseMapper(sysRoleMapper);
	}

}
