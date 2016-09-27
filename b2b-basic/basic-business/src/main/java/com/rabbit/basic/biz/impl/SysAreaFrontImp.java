package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.ISysAreaFront;
import com.rabbit.dao.SysAreaMapper;
import com.rabbit.fanbase.io.requset.SysAreaReq;
import com.rabbit.fanbase.io.response.SysAreaRes;
import com.rabbit.model.SysArea;
import com.rabbit.model.SysAreaExample;

@Service
public class SysAreaFrontImp implements ISysAreaFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Autowired
	SysAreaMapper sysAreaMapper;

	@Override
	public Pages<?> browser(SysAreaReq sysArea,
			@RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		SysAreaExample example = new SysAreaExample();
		/** 查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysAreaReq> list = new ArrayList<SysAreaReq>();
		long total = sysAreaMapper.countByExample(example);
		if (total > 0) {
		}
		return new Pages<SysAreaReq>(list, total, offset, length);
	}

	@Override
	public int delete(List<SysAreaReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysAreaReq sysAreaReq) {
		SysArea sysArea = new SysArea();
		SpringBeanUtils.copyProperties(sysAreaReq, sysArea);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysAreaMapper.insert(sysArea);
	}

	@Override
	public int update(SysAreaReq sysAreaReq) {
		SysArea sysArea = new SysArea();
		SpringBeanUtils.copyProperties(sysAreaReq, sysArea);
		SysAreaExample e = new SysAreaExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysAreaMapper.updateByExampleSelective(sysArea, e);
	}

	@Override
	public SysAreaRes selectBy(SysAreaReq sysArea) {
		SysAreaExample e = new SysAreaExample();
		// SysAreaExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysArea> list = sysAreaMapper.selectByExample(e);
		SysAreaRes res = new SysAreaRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
		}
		return res;

	}

}
