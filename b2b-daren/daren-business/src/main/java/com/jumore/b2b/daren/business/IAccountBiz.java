package com.jumore.b2b.daren.business;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AccountReq;
import com.jumore.b2b.activity.service.business.io.response.AccountRes;

public interface IAccountBiz {

	int countByExample(AccountReq t);

	int deleteByExample(AccountReq t);

	int deleteByPrimaryKey(AccountReq t);

	long doAppend(AccountReq t);

	Pages<AccountRes> browser(AccountReq t,int page, int rows);

	AccountRes selectByPrimaryKey(AccountReq t);

	int updateByPrimaryKeySelective(AccountReq t);

	int updateByPrimaryKey(AccountReq t);

	AccountRes selectUnique(AccountReq req);

}