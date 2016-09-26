package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.SysAreaReq;
import com.rabbit.fanbase.io.response.SysAreaRes;

public interface ISysAreaFront {

	Pages<?> browser(SysAreaReq sysArea, int currentPage, int pageSize);

	long doAppend(SysAreaReq sysArea);

	int update(SysAreaReq sysArea);

	int delete(List<SysAreaReq> list);

	SysAreaRes selectBy(SysAreaReq sysArea);

}
