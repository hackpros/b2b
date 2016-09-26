package com.rabbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysModelMapper;
import com.rabbit.model.SysModel;
import com.rabbit.model.SysModelExample;
import com.rabbit.service.ISysModelService;

@Service
public class SysModelServiceImp extends
		BaseServiceImp<SysModel, SysModelExample> implements ISysModelService {

	SysModelMapper sysModelMapper;

	@Autowired
	public void setSysModelMapper(SysModelMapper sysModelMapper) {
		this.sysModelMapper = sysModelMapper;
		this.setBaseMapper(sysModelMapper);
	}

	@Override
	public List<?> getTreeByLadder(short ladder) {
		return sysModelMapper.getTreeByLadder(ladder);
	}

}
