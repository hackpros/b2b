package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.ISysSettingFront;
import com.rabbit.fanbase.io.requset.SysSettingReq;
import com.rabbit.fanbase.io.response.SysSettingRes;
import com.rabbit.model.SysSetting;
import com.rabbit.model.SysSettingExample;
import com.rabbit.service.ISysSettingService;

@Service
public class SysSettingFrontImp implements ISysSettingFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Autowired
	ISysSettingService sysSettingService;

	@Override
	public Pages<SysSettingReq> browser(SysSettingReq sysSetting,
			@RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		SysSettingExample example = new SysSettingExample();
		/** 查询业务逻辑 **/

		// example.createCriteria().andParentIdEqualTo(sysOrg.getParentId());

		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysSettingReq> list = new ArrayList<SysSettingReq>();
		long total = sysSettingService.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/

			// example.setOrderByClause("SORT_");

			/** 排序业务逻辑完 **/
			// list = sysSettingService.selectOnPage(example, offset, length);
		}
		return new Pages<SysSettingReq>(list, total, offset, length);
	}

	@Override
	public int delete(List<SysSettingReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysSettingReq sysSettingReq) {
		SysSetting sysSetting = new SysSetting();
		SpringBeanUtils.copyProperties(sysSettingReq, sysSetting);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysSettingService.insert(sysSetting);
	}

	@Override
	public int update(SysSettingReq sysSettingReq) {
		SysSetting sysSetting = new SysSetting();
		SpringBeanUtils.copyProperties(sysSettingReq, sysSetting);
		SysSettingExample e = new SysSettingExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysSettingService.updateByExampleSelective(sysSetting, e);
	}

	@Override
	public SysSettingRes selectBy(SysSettingReq sysSettingReq) {

		SysSettingExample e = new SysSettingExample();
		// SysSettingExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysSetting> list = sysSettingService.selectByExample(e);
		SysSettingRes res = new SysSettingRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
		}
		return res;

	}

}
