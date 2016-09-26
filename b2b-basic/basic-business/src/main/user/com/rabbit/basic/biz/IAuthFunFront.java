
package com.rabbit.basic.biz;

import java.util.List;
import java.util.Map;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.AuthFunReq;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.AuthFunRes;
import com.rabbit.model.AuthFun;

public interface IAuthFunFront  {

	Pages<?> browser(AuthFunReq authFunReq, int currentPage, int pageSize);

	long doAppend(AuthFunReq authFun);

	int update(AuthFunReq authFun);

	int delete(List<AuthFunReq> list);

	AuthFunRes selectBy(AuthFunReq authFun);

	/**
	 * 初始化功能权限数数据
	 * 
	 * @param dbTab
	 * @param sModle
	 * @return
	 */
	AuthFun initAuth(String targetName, SysModelReq sModle);
	/**
	 * 缓存权限对像
	 * @return
	 */
	Map<Long, AuthFunRes> selectCacheMap();

}

