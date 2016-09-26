
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.UsrRoleReq;
import com.rabbit.fanbase.io.response.UsrRoleRes;

public interface IUsrRoleFront {

	Pages<?> browser(UsrRoleReq usrRole, int currentPage, int pageSize);
		
	long doAppend(UsrRoleReq usrRole);
	
	int update(UsrRoleReq usrRole);
	
	int delete(List<UsrRoleReq> list);

	UsrRoleRes selectBy(UsrRoleReq usrRole);
	
	}




