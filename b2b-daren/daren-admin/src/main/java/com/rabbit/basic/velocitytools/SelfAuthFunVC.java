package com.rabbit.basic.velocitytools;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;

import com.cnnct.rabbit.framework.comm.CacheConstant;
import com.cnnct.rabbit.framework.comm.SpringUtils;
import com.rabbit.basic.cache.AuthFunCacheManager;
import com.rabbit.fanbase.io.response.AuthFunRes;

/**
 * velicity 自定义系统选项获取函数
 * 
 * @author fanwg
 * @date 2013-8-10 下午02:40:14
 * @email renntrabbit@foxmail.com
 */
public class SelfAuthFunVC extends VelocityContext {

	private final Logger LOG = Logger.getLogger(this.getClass());

	private static AuthFunCacheManager authFunCacheManager = SpringUtils.getBean("authFunCacheManager", AuthFunCacheManager.class);

	@SuppressWarnings("unchecked")
	public String getAuthUrl(Long id) {
		Map<Long, AuthFunRes> map = (Map<Long, AuthFunRes>) authFunCacheManager.get(CacheConstant.AUTHFUN_CACHE);
		if (map == null) {
			authFunCacheManager.load();
		}
		AuthFunRes authFun = (AuthFunRes) map.get(id);
		if (authFun == null) {
			authFun = authFunCacheManager.reLoad(id);
			if (authFun == null) {
				return "http://www.baidu.com";
			}
		}
		LOG.debug(authFun.getRequestUrl());
		return authFun.getRequestUrl();
	}

}
