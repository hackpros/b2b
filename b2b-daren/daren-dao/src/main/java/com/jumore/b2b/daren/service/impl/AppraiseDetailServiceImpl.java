package com.jumore.b2b.daren.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jumore.b2b.daren.mapper.AppraiseDetailMapper;
import com.jumore.b2b.daren.model.AppraiseDetail;
import com.jumore.b2b.daren.model.AppraiseDetailQueryHelper;
import com.jumore.b2b.daren.service.IAppraiseDetailService;
@Service
public class AppraiseDetailServiceImpl extends BaseServiceImp<AppraiseDetail, AppraiseDetailQueryHelper> implements IAppraiseDetailService {

	static final Logger log = LogManager.getLogger(AccountServiceImpl.class);;

	AppraiseDetailMapper appraiseDetailMapper;

	@Autowired
	public void setAppraiseDetailMapper(AppraiseDetailMapper appraiseDetailMapper) {
		this.appraiseDetailMapper = appraiseDetailMapper;
		this.setBaseMapper(appraiseDetailMapper);
	}

	

}