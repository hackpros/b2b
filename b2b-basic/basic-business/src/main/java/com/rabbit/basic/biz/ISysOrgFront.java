
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.MapUserReleaseReq;
import com.rabbit.fanbase.io.requset.SysOrgReq;
import com.rabbit.fanbase.io.response.SysOrgRes;

public interface ISysOrgFront {

	Pages<?> browser(SysOrgReq sysOrg, int currentPage, int pageSize);
		
	long doAppend(SysOrgReq sysOrg);
	
	int update(SysOrgReq sysOrg);
	
	int delete(List<SysOrgReq> list);

	SysOrgRes selectBy(SysOrgReq sysOrg);
	
	List<?> getTreeByOrgCode(List<MapUserReleaseReq> userOrgs);

	List<?> getTreeByLadder(List<SysOrgRes> list);}




