/**
 * 
 * IAppCustomerService.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-30 Created
 */
package com.jumore.b2b.daren.service;

import com.jumore.b2b.daren.model.AppCustomer;
import com.jumore.b2b.daren.model.AppCustomerQueryHelper;
import org.mybatis.generator.base.service.single.IBaseService;

public interface IAppCustomerService extends IBaseService<AppCustomer, AppCustomerQueryHelper> {

	int test();
}