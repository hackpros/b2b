/**
 * 活动表
 * IActivityService.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.daren.api;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AccountReq;
import com.jumore.b2b.activity.service.business.io.response.AccountRes;
import com.jumore.b2b.daren.result.Result;



public interface IAccountApi{

	public Result<AccountRes> selectUniqueByKey(AccountReq req);

	public Result<AccountRes> selectUnique(AccountReq req);

	public Result<Integer> doModify(AccountReq req);

	public Result<Long> doAppend(AccountReq req);
	
	public Result<Pages<AccountRes>> selectPage(AccountReq req);

}