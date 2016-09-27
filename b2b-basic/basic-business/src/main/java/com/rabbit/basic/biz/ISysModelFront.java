
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.SysModelRes;

public interface ISysModelFront{

	Pages<?> browser(SysModelReq sysModel, int currentPage, int pageSize);
		
	long doAppend(SysModelReq sysModel);
	
	int update(SysModelReq sysModel);
	
	int delete(List<SysModelReq> list);

	SysModelRes selectBy(SysModelReq sysModel);
	
	List<?> getTreeByLadder(short ladder);}




