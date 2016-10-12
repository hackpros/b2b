package com.jumore.b2b.daren.business;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AppraiseDetailReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseDetailRes;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;

public interface IAppraiseDetailBiz {

	Pages<AppraiseDetailRes> browser(AppraiseDetailReq t, int page, int rows);

	Pages<AppraiseDetailRes> doStat(AppraiseDetailReq req, int i, int j);
	
	Pages<AppraiseRes> doStatExcel(AppraiseDetailReq req, int i, int j);

}
