package com.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysAreaMapper;
import com.rabbit.model.SysArea;
import com.rabbit.model.SysAreaExample;
import com.rabbit.service.ISysAreaService;

@Service
public class SysAreaServiceImp extends BaseServiceImp<SysArea, SysAreaExample>
		implements ISysAreaService {

	SysAreaMapper sysAreaMapper;

	@Autowired
	public void setSysAreaMapper(SysAreaMapper sysAreaMapper) {
		this.sysAreaMapper = sysAreaMapper;
		this.setBaseMapper(sysAreaMapper);
	}

}
