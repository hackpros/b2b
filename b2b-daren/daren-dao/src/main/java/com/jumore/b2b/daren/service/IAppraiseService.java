package com.jumore.b2b.daren.service;

import org.mybatis.generator.base.service.single.IBaseService;

import com.jumore.b2b.daren.model.Appraise;
import com.jumore.b2b.daren.model.AppraiseQueryHelper;

public interface IAppraiseService extends IBaseService<Appraise, AppraiseQueryHelper> {

	
	int doApppraise(Integer good, Integer better, Integer best, Long id, String code);

}