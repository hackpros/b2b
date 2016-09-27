
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.RoleAuthReq;
import com.rabbit.fanbase.io.response.RoleAuthRes;

public interface IRoleAuthFront{

	Pages<?> browser(RoleAuthReq roleAuth, int currentPage, int pageSize);
		
	long doAppend(RoleAuthReq roleAuth);
	
	int update(RoleAuthReq roleAuth);
	
	int delete(List<RoleAuthReq> list);

	RoleAuthRes selectBy(RoleAuthReq roleAuth);
	
	}




