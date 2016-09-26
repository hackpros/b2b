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
import com.jumore.b2b.activity.service.business.io.request.UserReq;
import com.jumore.b2b.activity.service.business.io.response.UserRes;
import com.jumore.b2b.daren.result.Result;

public interface IUserApi {

	public Result<UserRes> selectUniqueByKey(UserReq req);

	public Result<UserRes> selectUnique(UserReq req);

	public Result<Integer> doModify(UserReq req);

	public Result<Long> doAppend(UserReq req);
	
	public Result<Pages<UserRes>> selectPage(UserReq req);

}