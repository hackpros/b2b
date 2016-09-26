
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;
import org.fan.baseBusiness.util.DbTab;

import com.rabbit.fanbase.io.requset.SysMenuReq;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.SysMenuRes;
import com.rabbit.model.AuthFun;

public interface ISysMenuFront  {

	Pages<?> browser(SysMenuReq sysMenu, int currentPage, int pageSize);

	long doAppend(SysMenuReq sysMenu);

	int update(SysMenuReq sysMenu);

	int delete(List<SysMenuReq> list);

	SysMenuRes selectBy(SysMenuReq sysMenu);
	
	List<?> selectOnTree(long parentId, long usrId);

	List<?> getSelectTree(String grade, String roleAuthId);
	

	/**
	 * 左菜单
	 */
	List<?> selectTreeByParentId(Long currAdminId, int ladder,Long parentId);

	List<?> getAutherTree(String grade);

	/**
	 * 构建项目时自动添加菜单fan-FarmeWork-generate
	 * @param cols
	 * @param dbTab
	 * @param sModle
	 */
	void doAutoSysMenu(DbTab dbTab, SysModelReq sModle, AuthFun authFun);

	/**
     * 查询页面树
     * @param ladder
     * @return
     */
	List<?> getTreeByLadder(int ladder);

	SysMenuRes selectByKey(SysMenuReq sysMenuReq);

}

