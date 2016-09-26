package com.rabbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysOrgMapper;
import com.rabbit.model.SysOrg;
import com.rabbit.model.SysOrgExample;
import com.rabbit.service.ISysOrgService;

@Service
public class SysOrgServiceImp extends BaseServiceImp<SysOrg, SysOrgExample>
		implements ISysOrgService {

	SysOrgMapper sysOrgMapper;

	@Autowired
	public void setSysOrgMapper(SysOrgMapper sysOrgMapper) {
		this.sysOrgMapper = sysOrgMapper;
		this.setBaseMapper(sysOrgMapper);
	}

	@Override
	public List<?> getTreeByOrgCode(String code) {
		return sysOrgMapper.getTreeByOrgCode(code);
	}
	@Override
	public List<?> getTreeByLadder(short ladder, String orgId) {
		return sysOrgMapper.getTreeByLadder(ladder, orgId);
	}
}
