
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.SysRoleReq;
import com.rabbit.fanbase.io.response.SysRoleRes;

public interface ISysRoleFront {

	Pages<?> browser(SysRoleReq sysRole, int currentPage, int pageSize);
		
	long doAppend(SysRoleReq sysRole);
	
	int update(SysRoleReq sysRole);
	
	int delete(List<SysRoleReq> list);

	SysRoleRes selectBy(SysRoleReq sysRole);
	
	}




