package com.jumore.b2b.daren.service;

import java.util.Date;
import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;

import com.jumore.b2b.daren.model.AppraiseDetail;
import com.jumore.b2b.daren.model.AppraiseDetailQueryHelper;

public interface IAppraiseDetailService extends IBaseService<AppraiseDetail, AppraiseDetailQueryHelper> {

	List<AppraiseDetail> selectStat(String name, Date startTime, Date endTime);

}