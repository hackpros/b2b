package com.rabbit.basic.velocitytools;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import com.cnnct.rabbit.framework.comm.CacheConstant;
import com.cnnct.rabbit.framework.comm.SpringUtils;
import com.rabbit.basic.cache.MemCacheManager;

/**
 * velicity 自定义系统选项获取函数
 * 
 * @author fanwg
 * @date 2013-8-10 下午02:40:14
 * @email renntrabbit@foxmail.com
 */
public class SysOptFunVC extends VelocityContext {

	private static MemCacheManager memCacheManager = SpringUtils.getBean("memCacheManager", MemCacheManager.class);

	public static final String MATH = "math";

	public boolean containsKey(Object key) {
		return MATH.equals(key) || super.containsKey(key);
	}

	public static class MathUtil {

		public long round(double a) {
			return Math.round(a);
		}

		public double ceil(double a) {
			return Math.ceil(a);
		}
	}

	public String getOption(String tbName) {

		return "hello " + tbName;
	}

	public String getCode(String code, String key) {
		return memCacheManager.toString();
	}

	public Object getKeyValue(String optionCode, String keycode) {
		// Map<String,Object> map = (Map<String, Object>)
		// memCacheManager.get(CacheConstant.SYSOPTION_CACHE);
		// return map.get(optionCode+"."+keycode);
		return "xxxx";

	}

	@SuppressWarnings("unchecked")
	public Object getKeyRange(String table, String col) {
		Map<String, Object> map = (Map<String, Object>) memCacheManager.get(CacheConstant.SYSOPTION_CACHE);
		Object value = map.get(table + "." + col + ".JSON");
		if (value == null || value.equals("")) {
			value = "[]";
		}
		return value;

	}

	public Object getValRange(String table, String col) {
		@SuppressWarnings("unchecked")
		Map<String, Object> map = (Map<String, Object>) memCacheManager.get(CacheConstant.SYSOPTION_CACHE);
		Object val = null;
		if (map == null || map.isEmpty()) {
			val = "{}";
		} else {
			val = map.get(table + "." + col + ".RANGE");
			if (val == null || val.equals("")) {
				val = "{}";
			}
		}
		return val;

	}
}