package com.cnnct.rabbit.framework.comm;



/**
 * 
 * @author fanwg
 * @date 2013-8-20 下午07:43:54
 * @email renntrabbit@foxmail.com
 */
public interface ICache<T> {
	
	/**
	 * 加载缓存数据
	 * @return
	 */
	public boolean load();
	/**
	 * 重新加载缓存 
	 * @return
	 */
	public T reLoad();

	/**
	 * 清除缓存
	 */
	public void destroy();

}
