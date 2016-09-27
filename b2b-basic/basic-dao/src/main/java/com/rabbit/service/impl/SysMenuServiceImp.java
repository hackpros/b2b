package com.rabbit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.SysMenuMapper;
import com.rabbit.model.SysMenu;
import com.rabbit.model.SysMenuExample;
import com.rabbit.service.ISysMenuService;

@Service
public class SysMenuServiceImp extends BaseServiceImp<SysMenu, SysMenuExample>
		implements ISysMenuService {
	SysMenuMapper sysMenuMapper;

	@Autowired
	public void setSysMenuMapper(SysMenuMapper sysMenuMapper) {
		this.sysMenuMapper = sysMenuMapper;
		this.setBaseMapper(sysMenuMapper);
	}

	@Override
	public List<?> getTreeByLadder(int ladder) {
		// TODO Auto-generated method stub
		return sysMenuMapper.getTreeByLadder(ladder);
	}

	@Override
	public List<?> getAutherTree(String grade) {
		return sysMenuMapper.getAutherTree(grade);
	}

	@Override
	public List<?> selectOnTree(long parentId, long usrId) {
		return sysMenuMapper.selectOnTree(parentId, usrId);
	}

	@Override
	public List<?> selectTreeByParentId(Long currAdminId, int ladder,
			Long parentId) {
		return sysMenuMapper.selectTreeByParentId(currAdminId, ladder,parentId);
	}

	@Override
	public List<?> getSelectTree(String grade, String roleAuthId) {
		return sysMenuMapper.getSelectTree(grade, roleAuthId);
	}
}
