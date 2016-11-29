/**
 * 
 * AppCustomerDbxApi.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-22 Created
 */
package com.jumore.b2b.daren.api;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;
import com.jumore.b2b.daren.service.IAppCustomerService;

@com.alibaba.dubbo.config.annotation.Service
public class AppCustomerDbxApi implements IAppCustomerApi {
    static final Logger log = LogManager.getLogger(AppCustomerDbxApi.class);;

    @Resource
    IAppCustomerService appCustomerService;

	@Override
	public AppCustomerRes selectUnique(AppCustomerReq activity) {
		AppCustomerRes res=new AppCustomerRes();
		res.setCorpCode("hello world");
		return res;
	}


   
}