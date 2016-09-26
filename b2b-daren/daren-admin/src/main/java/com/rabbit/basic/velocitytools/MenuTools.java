package com.rabbit.basic.velocitytools;

import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.VelocityContext;

import com.bean.MenuTree;
import com.cnnct.rabbit.framework.comm.CacheConstant;
import com.cnnct.rabbit.framework.comm.SpringUtils;
import com.rabbit.basic.cache.MenuCacheManager;

/**
 * velicity 自定义系统选项获取函数
 * 
 * @author fanwg
 * @date 2013-8-10 下午02:40:14
 * @email renntrabbit@foxmail.com
 */

public class MenuTools extends VelocityContext {

	// private static MemCacheManager memCacheManager =
	// SpringUtils.getBean("memCacheManager", MemCacheManager.class);
	private static MenuCacheManager menuCacheManager = SpringUtils.getBean(
			"menuCacheManager", MenuCacheManager.class);

	@SuppressWarnings("unchecked")
	public List<MenuTree> getAuthUrl(Long id) {
		List<MenuTree> menuTrees = (List<MenuTree>) menuCacheManager
				.get(CacheConstant.AUTHFUN_CACHE);
		if (menuTrees == null) {
			menuTrees = menuCacheManager.reLoad(id);
			if (menuTrees == null) {
				return new ArrayList<MenuTree>();
			}
		}
		return menuTrees;
	}

	public String test(String arg) {
		return arg + " hello world";
	}
}
