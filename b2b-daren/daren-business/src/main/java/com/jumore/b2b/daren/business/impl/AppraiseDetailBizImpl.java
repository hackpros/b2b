package com.jumore.b2b.daren.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.service.business.io.request.AppraiseDetailReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseDetailRes;
import com.jumore.b2b.daren.business.IAppraiseDetailBiz;
import com.jumore.b2b.daren.model.AppraiseDetail;
import com.jumore.b2b.daren.model.AppraiseDetailQueryHelper;
import com.jumore.b2b.daren.service.IAppraiseDetailService;

@Component
public class AppraiseDetailBizImpl implements IAppraiseDetailBiz {

	static final Logger log = LogManager.getLogger(AppraiseDetailBizImpl.class);;
	@Resource
	IAppraiseDetailService appraiseDetailService;

	

	@Override
	public Pages<AppraiseDetailRes> browser(AppraiseDetailReq req, int offset, int length) {
		AppraiseDetailQueryHelper e = new AppraiseDetailQueryHelper();
		List<AppraiseDetail> appraiseDetails = appraiseDetailService.selectByExample(e);
		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/

		// PageInfo<Appraise> pages = new PageInfo<Appraise>(appraises);
		List<AppraiseDetailRes> resultList = new ArrayList<AppraiseDetailRes>();
		for (AppraiseDetail bean : appraiseDetails) {
			AppraiseDetailRes res = new AppraiseDetailRes();
			SpringBeanUtils.copyProperties(bean, res);
			resultList.add(res);
			if (resultList.size()>100){
				break;
			}
		}
		return new Pages<AppraiseDetailRes>(resultList, 100, offset, length);
		

	}



	@Override
	public Pages<AppraiseDetailRes> doStat(AppraiseDetailReq req, int offset, int length) {
		
		List<AppraiseDetail> appraiseDetails = appraiseDetailService.selectStat(req.getName(),req.getStartTime(),req.getEndTime());
		
		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/

		// PageInfo<Appraise> pages = new PageInfo<Appraise>(appraises);
		List<AppraiseDetailRes> resultList = new ArrayList<AppraiseDetailRes>();
		for (AppraiseDetail bean : appraiseDetails) {
			AppraiseDetailRes res = new AppraiseDetailRes();
			SpringBeanUtils.copyProperties(bean, res);
			resultList.add(res);
			if (resultList.size()>100){
				break;
			}
			res.setAppraiseCount(bean.getId().intValue());
		}
		return new Pages<AppraiseDetailRes>(resultList, 100, offset, length);
	}

	

}