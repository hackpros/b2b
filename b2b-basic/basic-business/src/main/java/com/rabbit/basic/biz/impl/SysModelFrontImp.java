package com.rabbit.basic.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.rabbit.basic.biz.ISysModelFront;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.SysModelRes;
import com.rabbit.model.SysModel;
import com.rabbit.model.SysModelExample;
import com.rabbit.service.ISysModelService;

@Service
public class SysModelFrontImp implements ISysModelFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Autowired
	ISysModelService sysModelService;

	@Override
	public Pages<?> browser(SysModelReq sysModel,
			@RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		SysModelExample example = new SysModelExample();
		/** 查询业务逻辑 **/
		SysModelExample.Criteria cri = example.createCriteria();
		cri.andLadderEqualTo(sysModel.getLadder() + 1);
		cri.andParentIdEqualTo(sysModel.getParentId());
		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		PageHelper.startPage(offset, length);
		example.setOrderByClause("model_code");
		List<SysModel> list = sysModelService.selectByExample(example);
		com.github.pagehelper.Page<SysModel> page = (com.github.pagehelper.Page<SysModel>) list;
		return new Pages<SysModel>(page.getResult(), page.getTotal(),
				offset, length);

	}

	@Override
	public int delete(List<SysModelReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysModelReq sysModelReq) {
		SysModel sysModel = new SysModel();
		SpringBeanUtils.copyProperties(sysModelReq, sysModel);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysModelService.insert(sysModel);
	}

	@Override
	public int update(SysModelReq sysModelReq) {
		SysModel sysModel = new SysModel();
		SpringBeanUtils.copyProperties(sysModelReq, sysModel);
		SysModelExample e = new SysModelExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return sysModelService.updateByExampleSelective(sysModel, e);
	}

	@Override
	public SysModelRes selectBy(SysModelReq sysModel) {
		SysModelExample e = new SysModelExample();
		// SysModelExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<SysModel> list = sysModelService.selectByExample(e);
		SysModelRes res = new SysModelRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
			throw new RuntimeException("对象不存在!");
		}
		return res;

	}

	/** 树结构查询 **/
	@Override
	public List<?> getTreeByLadder(short ladder) {
		return sysModelService.getTreeByLadder(ladder);
	}

}
