package com.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysSettingMapper;
import com.rabbit.model.SysSetting;
import com.rabbit.model.SysSettingExample;
import com.rabbit.service.ISysSettingService;

@Service
public class SysSettingServiceImp extends
		BaseServiceImp<SysSetting, SysSettingExample> implements
		ISysSettingService {

	SysSettingMapper sysSettingMapper;

	@Autowired
	public void setSysSettingMapper(SysSettingMapper sysSettingMapper) {
		this.sysSettingMapper = sysSettingMapper;
		this.setBaseMapper(sysSettingMapper);
	}
}
