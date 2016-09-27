package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.bean.MenuTree;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rabbit.basic.biz.ISysAdminFront;
import com.rabbit.fanbase.io.requset.SysAdminReq;
import com.rabbit.fanbase.io.response.RoleSysRes;
import com.rabbit.fanbase.io.response.SysAdminRes;
import com.rabbit.fanbase.io.response.SysOrgRes;
import com.rabbit.model.MapUserRelease;
import com.rabbit.model.MapUserReleaseExample;
import com.rabbit.model.SysAdmin;
import com.rabbit.model.SysAdminExample;
import com.rabbit.model.SysOrg;
import com.rabbit.service.IMapUserReleaseService;
import com.rabbit.service.ISysAdminService;
import com.rabbit.service.ISysMenuService;
import com.rabbit.service.ISysOrgService;

@Service
public class SysAdminFrontImp implements ISysAdminFront {

	private final Logger log = LogManager.getLogger(this.getClass());

	@Resource
	ISysAdminService sysAdminService;

	@Autowired
	ISysMenuService sysMenuSerive;

	@Autowired
	IMapUserReleaseService mapUserReleaseService;

	@Autowired
	ISysOrgService sysOrgService;

	@Override
	public Pages<?> browser(SysAdminReq sysAdmin, int offset, int length) {
		SysAdminExample example = new SysAdminExample();

		/** 查询业务逻辑 **/
		List<Integer> ids = mapUserReleaseService.selectOrgIdsByOrgCode(sysOrgService.selectByPrimaryKey(new SysOrg(sysAdmin.getOrgId()))
				.getNameEn());
		if (!ids.isEmpty()) {
			example.createCriteria().andIdIn(ids);
		}

		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/

		/* 此处使用了mybatis的分页查询，如需优化请在其配置文件内 */
		PageHelper.startPage(offset, length);
		List<SysAdmin> list = sysAdminService.selectByExample(example);

		com.github.pagehelper.Page<SysAdmin> page = (Page<SysAdmin>) list;
		return new Pages<SysAdmin>(page.getResult(), page.getTotal(), offset, length);
	}

	@Override
	public int delete(List<SysAdminReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysAdminReq sysItemReq) {
		SysAdmin sysAdmin = new SysAdmin();
		SpringBeanUtils.copyProperties(sysItemReq, sysAdmin);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysAdminService.insert(sysAdmin);
	}

	@Override
	public int update(SysAdminReq sysItemReq) {
		SysAdmin sysAdmin = new SysAdmin();
		SpringBeanUtils.copyProperties(sysItemReq, sysAdmin);
		SysAdminExample e = new SysAdminExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysAdminService.updateByExampleSelective(sysAdmin, e);
	}

	@Override
	public SysAdminRes selectBy(SysAdminReq sysAdmin) {
		SysAdminExample e = new SysAdminExample();
		// SysAdminExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/
		e.createCriteria().andIdEqualTo(sysAdmin.getId());

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysAdmin> list = sysAdminService.selectByExample(e);
		SysAdminRes res = new SysAdminRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
		}
		return res;

	}

	@Override
	public SysAdminRes login(SysAdminReq sysAdmin) {
		SysAdminExample example = new SysAdminExample();
		example.createCriteria().andNameEqualTo(sysAdmin.getName())
				.andPwdEqualTo(DigestUtils.md5DigestAsHex(sysAdmin.getPwd().getBytes()).toUpperCase());
		List<SysAdmin> list = sysAdminService.selectByExample(example);
		SysAdminRes res = new SysAdminRes();
		if (list.size() == 1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
			return res;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadUserRelease(SysAdminRes sysAdmin) {

		MapUserReleaseExample exp = new MapUserReleaseExample();
		exp.createCriteria().andSysAdminIdEqualTo(sysAdmin.getId());
		List<MapUserRelease> mapUserRelease = mapUserReleaseService.selectByExample(exp);

		List<SysOrgRes> orgs = new ArrayList<SysOrgRes>();
		List<RoleSysRes> roles = new ArrayList<RoleSysRes>();
		for (MapUserRelease mur : mapUserRelease) {
			if (null != mur.getOrg()) {
				SysOrgRes sysOrgRes = new SysOrgRes();
				SpringBeanUtils.copyProperties(mur.getOrg(), sysOrgRes);
				orgs.add(sysOrgRes);
			}
			if (null != mur.getRole()) {
				RoleSysRes roleSysRes = new RoleSysRes();
				SpringBeanUtils.copyProperties(mur.getRole(), roleSysRes);
				roles.add(roleSysRes);
			}
		}
		sysAdmin.setUserOrgs(orgs);// 用户组织机构
		sysAdmin.setUserRoles(roles);// 用户角色
		//数据放在缓存了，
		//sysAdmin.setUserMenus((List<MenuTree>) loadUserMenus(sysAdmin));
	}

	/**
	 * 加载用户菜单
	 */
	@Override
	public List<?> loadUserMenus(SysAdminRes sysAdmin) {
		int ladder = 0;
		Long parentId = null;
		List<?> sysMenus = sysMenuSerive.selectTreeByParentId(sysAdmin.getId(), ladder, parentId);
		if (sysMenus.size() == 0) {
			sysMenus = new ArrayList<MenuTree>();
		}
		// 存入缓存
		return sysMenus;
	}
}
