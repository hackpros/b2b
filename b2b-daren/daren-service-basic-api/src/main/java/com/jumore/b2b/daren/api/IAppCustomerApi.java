/**
 * 
 * IAppCustomerApi.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-22 Created
 */
package com.jumore.b2b.daren.api;

import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;

public interface IAppCustomerApi {

   
	AppCustomerRes selectUnique(AppCustomerReq activity);

}