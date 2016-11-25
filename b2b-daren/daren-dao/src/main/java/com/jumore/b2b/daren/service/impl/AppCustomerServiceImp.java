/**
 * 
 * AppCustomerServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-22 Created
 */
package com.jumore.b2b.daren.service.impl;

import com.jumore.b2b.daren.mapper.AppCustomerMapper;
import com.jumore.b2b.daren.model.AppCustomer;
import com.jumore.b2b.daren.model.AppCustomerQueryHelper;
import com.jumore.b2b.daren.service.IAppCustomerService;
import javax.annotation.Resource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.generator.base.service.single.BaseServiceImp;

@org.springframework.stereotype.Service
public class AppCustomerServiceImp extends BaseServiceImp<AppCustomer, AppCustomerQueryHelper> implements IAppCustomerService {
    static final Logger log = LogManager.getLogger(AppCustomerServiceImp.class);;

    AppCustomerMapper appCustomerMapper;

    @Resource
    public void setAppCustomerMapper(AppCustomerMapper appCustomerMapper) {
        this.appCustomerMapper=appCustomerMapper;
        this.setBaseMapper(appCustomerMapper);
    }
}