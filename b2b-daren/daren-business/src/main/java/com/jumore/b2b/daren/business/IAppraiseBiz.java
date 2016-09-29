package com.jumore.b2b.daren.business;

import java.io.IOException;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AppraiseReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;

public interface IAppraiseBiz {

	int countByExample(AppraiseReq t);

	int deleteByExample(AppraiseReq t);

	int deleteByPrimaryKey(AppraiseReq t);

	long doAppend(AppraiseReq t);

	Pages<AppraiseRes> browser(AppraiseReq t, int page, int rows);

	AppraiseRes selectByPrimaryKey(AppraiseReq t);

	int updateByPrimaryKeySelective(AppraiseReq t);

	int updateByPrimaryKey(AppraiseReq t);

	AppraiseRes selectUnique(AppraiseReq req);

	int doApppraise(AppraiseReq req);

	long doAppend(AppraiseReq req, CommonsMultipartFile file) throws IllegalStateException, IOException;


	long doUpdate(AppraiseReq req, CommonsMultipartFile file) throws IllegalStateException, IOException ;
}
