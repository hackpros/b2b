package com.rabbit.basic.biz.impl;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.fan.baseBusiness.util.DBInfoUtil;
import org.fan.baseBusiness.util.DbTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rabbit.basic.biz.ISysMenuFront;
import com.rabbit.fanbase.io.requset.SysItemReq.LADDER;
import com.rabbit.fanbase.io.requset.SysMenuReq;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.SysMenuRes;
import com.rabbit.model.AuthFun;
import com.rabbit.model.SysMenu;
import com.rabbit.model.SysMenuExample;
import com.rabbit.service.ISysMenuService;

@Service
public class SysMenuFrontImp implements ISysMenuFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Autowired
	ISysMenuService sysMenuService;

	@Override
	public Pages<?> browser(SysMenuReq sysMenu,
			@RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		SysMenuExample example = new SysMenuExample();
		/** 查询业务逻辑 **/
		example.createCriteria().andParentIdEqualTo(sysMenu.getParentId())
				.andLadderEqualTo((sysMenu.getLadder() + 1));
		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/

		PageHelper.startPage(offset, length);
		List<SysMenu> list = sysMenuService.selectByExample(example);
		PageInfo<SysMenu> page = new PageInfo<SysMenu>(list);
		log.info(page);
		
		// return new Pages<SysMenuReq>(page.getList(), page.getTotal(), offset,
		// length);
		return null;
	}

	@Override
	public int delete(List<SysMenuReq> list) {
		int i = 0;
		for (SysMenuReq sysMenu : list) {
			i = i
					+ sysMenuService.deleteByPrimaryKey(new SysMenu(sysMenu
							.getId()));
		}
		return i;
	}

	@Override
	public long doAppend(SysMenuReq sysModelReq) {
		SysMenu sysMenu = new SysMenu();
		SpringBeanUtils.copyProperties(sysModelReq, sysMenu);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysMenuService.insert(sysMenu);
	}

	@Override
	public int update(SysMenuReq sysModelReq) {
		SysMenu sysMenu = new SysMenu();
		SpringBeanUtils.copyProperties(sysModelReq, sysMenu);
		SysMenuExample e = new SysMenuExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysMenuService.updateByExampleSelective(sysMenu, e);
	}

	@Override
	public SysMenuRes selectBy(SysMenuReq sysMenu) {
		SysMenuExample e = new SysMenuExample();
		// SysMenuExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/
		e.createCriteria().andIdEqualTo(sysMenu.getId())
				.andCodeEqualTo(sysMenu.getCode());

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysMenu> list = sysMenuService.selectByExample(e);
		if (list.size() != 1) {
			throw new RuntimeException("对象不存在!");
		}
		return null;

	}

	@Override
	public List<?> selectOnTree(long parentId, long usrId) {
		return sysMenuService.selectOnTree(parentId, usrId);
	}

	// 查询左菜单
	public List<?> selectTreeByParentId(Long currAdminId, int ladder,
			Long parentId) {
		return sysMenuService
				.selectTreeByParentId(currAdminId, ladder, parentId);
	}

	@Override
	public List<?> getSelectTree(String grade, String roleAuthId) {
		return sysMenuService.getSelectTree(grade, roleAuthId);
	}


	@Override
	public List<?> getAutherTree(String grade) {
		return sysMenuService.getAutherTree(grade);

	}

	@Override
	public void doAutoSysMenu(DbTab dbTab, SysModelReq sModle, AuthFun authFun) {
		// 如果没有菜单。就找的父母菜单(功能对应的模块ID必定存在)　树型菜单　
		// 菜单--更-------
		// ----------------模块一---------
		// ---------------------- 菜单一---
		// ---------------------- 菜单二---
		// ----------------模块二---------
		// ---------------------- 菜单一---
		// ---------------------- 菜单二---
		String tbName = DBInfoUtil.dbName2JavaBeanName(new StringBuilder(dbTab
				.getTbName().toLowerCase()));
		SysMenuExample e = new SysMenuExample();
		e.createCriteria().andNameEnEqualTo(tbName);

		if (sModle == null) {
			return;
		}
		if (sysMenuService.countByExample(e) == 0) {
			e.clear();
			e.createCriteria().andCodeEqualTo(sModle.getModelCode());
			SysMenu modelSysMenu = null;
			if (sysMenuService.countByExample(e) == 0) {
				modelSysMenu = new SysMenu();
				modelSysMenu.setParentId(1L);
				modelSysMenu.setCode(sModle.getModelCode());
				modelSysMenu.setName(sModle.getName() + "模块");
				modelSysMenu.setSort(Integer.parseInt(sysMenuService
						.countByExample(e) + ""));
				modelSysMenu.setLadder(LADDER.MODEL_LEVEL);
				sysMenuService.insert(modelSysMenu);
			} else {
				modelSysMenu = sysMenuService.selectByExample(e).get(0);
			}
			SysMenu sysMenu = new SysMenu();
			sysMenu.setParentId(modelSysMenu.getId());
			sysMenu.setCode(UUID.randomUUID().toString());
			sysMenu.setName(dbTab.getComments() + "管理");
			e.clear();
			e.createCriteria().andParentIdEqualTo(modelSysMenu.getId());
			sysMenu.setSort(Integer.parseInt(sysMenuService.countByExample(e)
					+ ""));

			sysMenu.setNameEn(tbName);
			sysMenu.setCode((new Random()).nextInt(100) + "");
			if (authFun == null) {

				sysMenu.setUrl(sModle.getKeyword().toLowerCase() + "/" + tbName
						+ "/browser?offset=1&length=10");
			} else {
				sysMenu.setAuthorityId(authFun.getId());
			}

			sysMenu.setLadder(LADDER.TABLE_LEVEL);

			sysMenuService.insert(sysMenu);
		}

	}

	@Override
	public List<?> getTreeByLadder(int ladder) {
		return sysMenuService.getTreeByLadder(ladder);
	}

	@Override
	public SysMenuRes selectByKey(SysMenuReq sysMenuReq) {
		SysMenu t=new SysMenu();
		t.setId(sysMenuReq.getId());
		t= sysMenuService.selectByPrimaryKey(t);
		SysMenuRes res= new SysMenuRes();
		SpringBeanUtils.copyProperties(t, res);
		return  res;
		
	}
}
