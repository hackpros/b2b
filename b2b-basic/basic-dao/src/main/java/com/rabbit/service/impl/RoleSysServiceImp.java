package com.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.RoleSysMapper;
import com.rabbit.model.RoleSys;
import com.rabbit.model.RoleSysExample;
import com.rabbit.service.IRoleSysService;

@Service
public class RoleSysServiceImp extends BaseServiceImp<RoleSys, RoleSysExample>
		implements IRoleSysService {

	RoleSysMapper roleSysMapper;

	@Autowired
	public void setRoleSysMapper(RoleSysMapper roleSysMapper) {
		this.roleSysMapper = roleSysMapper;
		this.setBaseMapper(roleSysMapper);
	}

}
