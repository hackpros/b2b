package com.rabbit.service.impl;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.dao.SysAdminMapper;
import com.rabbit.model.SysAdmin;
import com.rabbit.model.SysAdminExample;
import com.rabbit.service.ISysAdminService;

@Service
public class SysAdminServiceImp extends
		BaseServiceImp<SysAdmin, SysAdminExample> implements ISysAdminService {

	SysAdminMapper sysAdminMapper;

	@Autowired
	public void setSysAdminMapper(SysAdminMapper sysAdminMapper) {
		this.sysAdminMapper = sysAdminMapper;
		this.setBaseMapper(sysAdminMapper);
	}
}
