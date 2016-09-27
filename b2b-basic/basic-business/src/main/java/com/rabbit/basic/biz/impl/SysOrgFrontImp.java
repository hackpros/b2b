package com.rabbit.basic.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ELadder;
import com.github.pagehelper.PageHelper;
import com.rabbit.basic.biz.ISysOrgFront;
import com.rabbit.fanbase.io.requset.MapUserReleaseReq;
import com.rabbit.fanbase.io.requset.SysOrgReq;
import com.rabbit.fanbase.io.response.SysOrgRes;
import com.rabbit.model.SysOrg;
import com.rabbit.model.SysOrgExample;
import com.rabbit.service.ISysOrgService;

@Service
public class SysOrgFrontImp implements ISysOrgFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Autowired
	ISysOrgService sysOrgService;

	@Override
	public Pages<?> browser(SysOrgReq sysOrg, int offset, int length) {
		SysOrgExample example = new SysOrgExample();
		/** 查询业务逻辑 **/
		if (sysOrg.getParentId() != null)
			example.createCriteria().andParentIdEqualTo(sysOrg.getParentId());

		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		PageHelper.startPage(offset, length);
		List<SysOrg> list = sysOrgService.selectByExample(example);
		com.github.pagehelper.Page<SysOrg> page = (com.github.pagehelper.Page<SysOrg>) list;

		return new Pages<SysOrgRes>(null, page.getTotal(), offset, length);
	}

	@Override
	public int delete(List<SysOrgReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysOrgReq sysSettingReq) {
		SysOrg sysOrg = new SysOrg();
		SpringBeanUtils.copyProperties(sysSettingReq, sysOrg);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysOrgService.insert(sysOrg);
	}

	@Override
	public int update(SysOrgReq sysOrgReq) {
		SysOrg sysOrg = new SysOrg();
		SpringBeanUtils.copyProperties(sysOrgReq, sysOrg);
		SysOrgExample e = new SysOrgExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysOrgService.updateByExampleSelective(sysOrg, e);
	}

	@Override
	public SysOrgRes selectBy(SysOrgReq sysOrgReq) {
		SysOrgExample e = new SysOrgExample();
		// SysOrgExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysOrg> list = sysOrgService.selectByExample(e);
		SysOrgRes sysOrgRes = new SysOrgRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), sysOrgRes);
		}
		return sysOrgRes;

	}

	@Override
	public List<?> getTreeByOrgCode(List<MapUserReleaseReq> userOrgs) {

		String orgCode = "";
		for (MapUserReleaseReq mapUserRelease : userOrgs) {
			// orgCode= orgCode +"'"+mapUserRelease.getOrg().getNameEn()+"'," ;
			orgCode = mapUserRelease.getOrg().getNameEn();
			break;
		}
		/*
		 * if (orgCode.endsWith(",")){
		 * orgCode=orgCode.substring(0,orgCode.length()-1); } if
		 * ("".equals(orgCode)){ return new ArrayList<Object>(); }
		 */
		// orgCode="330100','330200";
		return sysOrgService.getTreeByOrgCode(orgCode);
	}

	@Override
	public List<?> getTreeByLadder(List<SysOrgRes> orgs) {
		String orgId = "";
		for (SysOrgRes org : orgs) {
			orgId += org.getId() + ",";
		}
		if (orgId.endsWith(",")) {
			orgId = orgId.substring(0, orgId.length() - 1);
		}
		return sysOrgService.getTreeByLadder(ELadder.ROOT_LEVEL.getLadder(),
				orgId);
	}

}
