package com.jumore.b2b.daren.business.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.service.business.io.request.AppraiseReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;
import com.jumore.b2b.daren.business.IAppraiseBiz;
import com.jumore.b2b.daren.model.Appraise;
import com.jumore.b2b.daren.model.AppraiseQueryHelper;
import com.jumore.b2b.daren.service.IAppraiseService;

@Component
public class AppraiseBizImpl implements IAppraiseBiz {

	static final Logger log = LogManager.getLogger(AppraiseBizImpl.class);;
	@Resource
	IAppraiseService appraiseService;

	@Override
	public int countByExample(AppraiseReq t) {

		AppraiseQueryHelper e = new AppraiseQueryHelper();
		return appraiseService.countByExample(e);
	}

	@Override
	public int deleteByExample(AppraiseReq t) {

		AppraiseQueryHelper e = new AppraiseQueryHelper();
		return appraiseService.deleteByExample(e);
	}

	@Override
	public int deleteByPrimaryKey(AppraiseReq t) {
		Appraise e = new Appraise();
		e.setId(t.getId());
		return appraiseService.deleteByPrimaryKey(e);
	}

	@Override
	public long doAppend(AppraiseReq t) {
		Appraise e = new Appraise();
		// 转换规则。demo认为没有规则。直接转
		t.setCreateTime(new Date());
		t.setBest(0);
		t.setBetter(0);
		t.setGood(0);
		if (t.getCode()==null){
			t.setCode("S"+RandomStringUtils.randomNumeric(3));
		}
		SpringBeanUtils.copyProperties(t, e);
		return appraiseService.insertSelective(e);
	}

	@Override
	public Pages<AppraiseRes> browser(AppraiseReq req, int offset, int length) {
		AppraiseQueryHelper e = new AppraiseQueryHelper();
		//PageHelper.startPage(offset, length);
		//e.createCriteria().andIdLessThan(6L);
		int i=	appraiseService.countByExample(e);
		log.debug(i);
		List<Appraise> appraises = appraiseService.selectByExample(e);
		log.info(appraises);
		/**查询业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		
		//PageInfo<Appraise> pages = new PageInfo<Appraise>(appraises);
		List<AppraiseRes> resultList = new ArrayList<AppraiseRes>();
		for (Appraise bean : appraises) {
			AppraiseRes res = new AppraiseRes();
			SpringBeanUtils.copyProperties(bean, res);
			resultList.add(res);
		}
		return new Pages<AppraiseRes>(resultList, 100, offset, length);

	}

	@Override
	public AppraiseRes selectByPrimaryKey(AppraiseReq t) {
		Appraise e = new Appraise();
		e.setId(t.getId());
		e = appraiseService.selectByPrimaryKey(e);
		AppraiseRes res = new AppraiseRes();
		SpringBeanUtils.copyProperties(e, res);
		return res;
	}

	@Override
	public int updateByPrimaryKeySelective(AppraiseReq req) {
		Appraise t = new Appraise();
		SpringBeanUtils.copyProperties(req, t);
		return appraiseService.updateByPrimaryKey(t);
	}

	@Override
	public int updateByPrimaryKey(AppraiseReq req) {
		Appraise t = new Appraise();
		SpringBeanUtils.copyProperties(req, t);
		return appraiseService.updateByPrimaryKey(t);
	}

	@Override
	public AppraiseRes selectUnique(AppraiseReq t) {
		AppraiseQueryHelper e = new AppraiseQueryHelper();
		// 查询条件
		AppraiseQueryHelper.Criteria c = e.createCriteria();
		c.andIdEqualTo(t.getId());
		c.andCodeEqualTo(t.getCode());
		// 条件一
		// 条件二
		// 条件三
		// 条件三N

		int rows = appraiseService.countByExample(e);
		if (rows != 1) {
			return null;
		}

		List<Appraise> Appraises = appraiseService.selectByExample(e);
		AppraiseRes res = new AppraiseRes();
		SpringBeanUtils.copyProperties(Appraises.get(0), res);
		return res;
	}

	@Override
	public int doApppraise(AppraiseReq req) {
		// update
		int rows = 0;
		if (req.getBest()!=null && req.getBest() > 0) {
			rows = appraiseService.doApppraise(0, 0, 1, req.getId(), req.getCode());
			return rows;
		}

		if (req.getBetter()!=null && req.getBetter() > 0) {
			rows = appraiseService.doApppraise(0, 1, 0, req.getId(), req.getCode());
			return rows;
		}
		if (req.getGood()!=null && req.getGood() > 0) {
			rows = appraiseService.doApppraise(1, 0, 0, req.getId(), req.getCode());
		}

		return rows;
	}

}