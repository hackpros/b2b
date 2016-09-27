package com.rabbit.basic.cache;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cnnct.rabbit.framework.comm.CacheConstant;
import com.cnnct.rabbit.framework.comm.ICache;
import com.rabbit.basic.biz.IAuthFunFront;
import com.rabbit.fanbase.io.requset.AuthFunReq;
import com.rabbit.fanbase.io.response.AuthFunRes;
import com.whalin.MemCached.MemCachedClient;

/*
 * 系统树限缓存管理
 */
@Component("authFunCacheManager")
public class AuthFunCacheManager implements ICache<Map<Long, AuthFunRes>> {

	private final Logger LOG = Logger.getLogger(this.getClass());
	
	@Resource
	IAuthFunFront authFunFront;

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
			LOG.error(e);
			return null;
		}
	}

	@Override
	public boolean load() {
		mcc.add(CacheConstant.AUTHFUN_CACHE, authFunFront.selectCacheMap());
		return true;
	}

	@Override
	public Map<Long, AuthFunRes> reLoad() {
		Map<Long, AuthFunRes> map = authFunFront.selectCacheMap();
		mcc.add(CacheConstant.AUTHFUN_CACHE, map);
		return map;
	}

	@Override
	public void destroy() {
		mcc.delete(CacheConstant.AUTHFUN_CACHE);
	}

	@SuppressWarnings("unchecked")
	public AuthFunRes reLoad(Long id) {
		AuthFunRes AuthFunRes = authFunFront.selectBy(new AuthFunReq(id));
		if (AuthFunRes != null) {
			Map<Long, AuthFunRes> authFunMap = (Map<Long, AuthFunRes>) mcc
					.get(CacheConstant.AUTHFUN_CACHE);
			if (authFunMap!=null){
				authFunMap.put(AuthFunRes.getId(), AuthFunRes);
				mcc.add(CacheConstant.AUTHFUN_CACHE,authFunMap);
			}
		}
		return AuthFunRes;
	}

}
