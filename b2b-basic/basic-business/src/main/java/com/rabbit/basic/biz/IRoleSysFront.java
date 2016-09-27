
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.RoleSysReq;
import com.rabbit.fanbase.io.response.RoleSysRes;

public interface IRoleSysFront {

	Pages<?> browser(RoleSysReq roleSys, int currentPage, int pageSize);
		
	long doAppend(RoleSysReq roleSys);
	
	int update(RoleSysReq roleSys);
	
	int delete(List<RoleSysReq> list);

	RoleSysRes selectBy(RoleSysReq roleSys);
	
	}




