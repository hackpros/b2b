package com.rabbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysItemMapper;
import com.rabbit.model.SysItem;
import com.rabbit.model.SysItemExample;
import com.rabbit.service.ISysItemService;

@Service
public class SysItemServiceImp extends BaseServiceImp<SysItem, SysItemExample>
		implements ISysItemService {

	SysItemMapper sysItemMapper;

	@Autowired
	public void setSysItemMapper(SysItemMapper sysItemMapper) {
		this.sysItemMapper = sysItemMapper;
		this.setBaseMapper(sysItemMapper);
	}

	@Override
	public List<?> selectSimple(SysItem sysItem) {
		return sysItemMapper.selectSimple(sysItem);
	}

	@Override
	public List<?> getTreeByLadder(short ladder) {
		return sysItemMapper.getTreeByLadder(ladder);
	}

}
