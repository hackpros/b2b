
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.SysAdminReq;
import com.rabbit.fanbase.io.response.SysAdminRes;

public interface ISysAdminFront  {

	Pages<?> browser(SysAdminReq sysAdmin, int currentPage, int pageSize);

	long doAppend(SysAdminReq sysAdmin);

	int update(SysAdminReq sysAdmin);

	int delete(List<SysAdminReq> list);

	SysAdminRes selectBy(SysAdminReq sysAdmin);

	/**
	 * 用户登录
	 * 
	 * @param auther
	 * @return
	 */
	SysAdminRes login(SysAdminReq auther);
	/**
	 * 装载用户关系
	 */
	void loadUserRelease(SysAdminRes sysAdmin);

	List<?> loadUserMenus(SysAdminRes sysAdmin);
}

