package com;

import java.util.List;

import org.apache.velocity.VelocityContext;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bean.MenuTree;
import com.cnnct.rabbit.framework.comm.SpringUtils;
import com.rabbit.basic.cache.MenuCacheManager;
import com.rabbit.fanbase.io.response.SysAdminRes;

/**
 * velicity 自定义系统选项获取函数
 * 
 * @author fanwg
 * @date 2013-8-10 下午02:40:14
 * @email renntrabbit@foxmail.com
 */
public class TestVtools extends VelocityContext {
	private static MenuCacheManager menuCacheManager = SpringUtils.getBean(
			"menuCacheManager", MenuCacheManager.class);

	public String test(String arg) {
		return arg + " hello world";
	}

	/**
	 * 更新用户登录的UserID获取c中他的菜单
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<MenuTree> loadMenus() {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) ra;
		if (null==servletRequestAttributes
				.getRequest().getSession().getAttribute("userSession")){
			return null;
		}
		SysAdminRes sysAdminRes = (SysAdminRes) servletRequestAttributes
				.getRequest().getSession().getAttribute("userSession");
		Object obj = menuCacheManager.get(MenuCacheManager.MENU_CACHE_KEY + "_"
				+ sysAdminRes.getId());
		List<MenuTree> list = null;
		if (obj != null)
			list = (List<MenuTree>) obj;
		return list;
	}
}