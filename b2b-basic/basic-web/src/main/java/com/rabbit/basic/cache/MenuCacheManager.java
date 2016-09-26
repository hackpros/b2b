package com.rabbit.basic.cache;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bean.GlobalSelect;
import com.bean.MenuTree;
import com.cnnct.rabbit.framework.comm.CacheConstant;
import com.cnnct.rabbit.framework.comm.ICache;
import com.rabbit.basic.biz.ISysAdminFront;
import com.rabbit.basic.biz.ISysMenuFront;
import com.rabbit.fanbase.io.response.SysAdminRes;
import com.whalin.MemCached.MemCachedClient;

/*
 * 系统树限缓存管理
 */
@Component("menuCacheManager")
public class MenuCacheManager implements ICache<List<? extends GlobalSelect>> {

	public final static String MENU_CACHE_KEY = "MENU_CACHE_KEY.";

	@Resource
	ISysAdminFront sysAdminFront;

	@Autowired
	ISysMenuFront sysMenuFront;

	@Resource(name = "memCachedClient")
	MemCachedClient mcc;

	/*
	 * 根据指定的关键字获取对象.
	 * 
	 * @param key
	 * 
	 * @return
	 */
	public Object get(String key) {
		try {
			return (Object) mcc.get(key);
		} catch (Exception e) {
			return null;
		}
		// return null;
	}

	@Override
	public boolean load() {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) ra;
		// HttpServletRequest request = servletRequestAttributes.getRequest();
		SysAdminRes sysAdminRes = (SysAdminRes) servletRequestAttributes.getRequest().getSession().getAttribute("userSession");
		mcc.add(MENU_CACHE_KEY + "_" + sysAdminRes.getId(), sysAdminFront.loadUserMenus(sysAdminRes));
		return true;
	}

	@Override
	public List<? extends GlobalSelect> reLoad() {

		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) ra;
		// HttpServletRequest request = servletRequestAttributes.getRequest();
		SysAdminRes sysAdminRes = (SysAdminRes) servletRequestAttributes.getRequest().getSession().getAttribute("userSession");
		mcc.add(MENU_CACHE_KEY + sysAdminRes.getId(), sysAdminFront.loadUserMenus(sysAdminRes));
		return null;
	}

	@Override
	public void destroy() {
		mcc.delete(CacheConstant.AUTHFUN_CACHE);
	}

	@SuppressWarnings("unchecked")
	public List<MenuTree> reLoad(Long id) {
		List<MenuTree> list = null;
		SysAdminRes sysAdmin = new SysAdminRes();
		sysAdmin.setId(0L);
		mcc.add(MENU_CACHE_KEY + "_" + id, sysAdminFront.loadUserMenus(sysAdmin));
		list = (List<MenuTree>) mcc.get(MENU_CACHE_KEY + "_" + id);
		if (list == null) {
			list = new ArrayList<>();
		}
		return list;
	}

}
