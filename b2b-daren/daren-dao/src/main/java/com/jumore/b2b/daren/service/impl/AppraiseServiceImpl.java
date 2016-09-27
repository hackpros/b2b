package com.jumore.b2b.daren.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jumore.b2b.daren.mapper.AppraiseMapper;
import com.jumore.b2b.daren.model.Appraise;
import com.jumore.b2b.daren.model.AppraiseQueryHelper;
import com.jumore.b2b.daren.service.IAppraiseService;
@Service
public class AppraiseServiceImpl extends BaseServiceImp<Appraise, AppraiseQueryHelper> implements IAppraiseService {

	static final Logger log = LogManager.getLogger(AccountServiceImpl.class);;

	AppraiseMapper appraiseMapper;

	@Autowired
	public void setAppraiseMapper(AppraiseMapper appraiseMapper) {
		this.appraiseMapper = appraiseMapper;
		super.setBaseMapper(appraiseMapper);
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public int doApppraise(Integer good, Integer better, Integer best, Long id, String code) {
		return appraiseMapper.doApppraise(good, better, best, id, code);
	}

}