package com.rabbit.basic.cache;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.fan.baseBusiness.util.GlobalEnum;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONException;
import com.cnnct.rabbit.framework.comm.CacheConstant;
import com.cnnct.rabbit.framework.comm.ICache;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rabbit.basic.biz.ISysItemFront;
import com.whalin.MemCached.MemCachedClient;

/*
 * 系统选项表缓存管理
 */
@Component("memCacheManager")
public class MemCacheManager implements ICache<Object> {
	@Resource
	ISysItemFront sysItemFront;

	@Resource(name = "memCachedClient")
	MemCachedClient mcc;

	public boolean add(String key, int exp, Object value) {
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.HOUR, 2);
		if (mcc.get(key) != null) {
			return mcc.replace(key, value, ca.getTime());
		} else {
			return mcc.add(key, value, ca.getTime());
		}
	}

	public boolean add(String key, Object value, Date expiry) {
		try {
			return mcc.add(key, value, expiry);
		} catch (Exception e) {
			return false;
		}
	}

	public boolean replace(String key, Object value) {
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.HOUR, 2);
		return mcc.replace(key, value, ca.getTime());
	}

	public boolean replace(String key, Object value, Date expiry) {
		try {
			return mcc.replace(key, value, expiry);
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * 根据指定的关键字获取对象.
	 * 
	 * @param key
	 * 
	 * @return
	 */
	public Object get(String key) {
		try {
			return mcc.get(key);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean load() {

		try {
			mcc.add(CacheConstant.SYSOPTION_CACHE, sysItemFront
					.witteValueAsMap(null, GlobalEnum.ELadder.TABLE_LEVEL));
			// mcc.add(CacheConstant.CUSTORM_CACHE,
			// customerService.witteValueAsMap());
			// mcc.add(CacheConstant.PRODUCT_CACHE,
			// productService.witteValueAsMap());
			// System.out.println(mcc.get(CacheConstant.SYSOPTION_CACHE));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;

	}

	@Override
	public Object reLoad() {
		// mcc.add(CacheConstant.SYSOPTION_CACHE,sysOptionService.witteValueAsMap(null,
		// SysOption.LADDER.TABLE_LEVEL));
		// mcc.add(CacheConstant.CUSTORM_CACHE,
		// customerService.witteValueAsMap());
		// mcc.add(CacheConstant.PRODUCT_CACHE,
		// productService.witteValueAsMap());
		return true;
	}

	@Override
	public void destroy() {
		/*
		 * mcc.delete(CacheConstant.SYSOPTION_CACHE);
		 * mcc.delete(CacheConstant.CUSTORM_CACHE);
		 * mcc.delete(CacheConstant.PRODUCT_CACHE);
		 */
	}

}
