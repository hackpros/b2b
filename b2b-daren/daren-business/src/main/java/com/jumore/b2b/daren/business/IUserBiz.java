package com.jumore.b2b.daren.business;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.UserReq;
import com.jumore.b2b.activity.service.business.io.response.UserRes;

public interface IUserBiz {

	int countByExample(UserReq t);

	int deleteByExample(UserReq t);

	int deleteByPrimaryKey(UserReq t);

	long doAppend(UserReq t);

	Pages<UserRes> browser(UserReq t, int page, int rows);

	UserRes selectByPrimaryKey(UserReq t);

	UserRes selectUnique(UserReq t);

	int updateByPrimaryKeySelective(UserReq t);

	int updateByPrimaryKey(UserReq t);
}