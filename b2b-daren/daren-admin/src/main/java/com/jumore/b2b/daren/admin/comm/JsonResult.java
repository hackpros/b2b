package com.jumore.b2b.daren.admin.comm;

import java.io.Serializable;
/**
 * 服务返回接口统一封闭对象
 * @author Administrator
 *
 * @param <T>
 */
public class JsonResult<T> implements Serializable {

	private static final long serialVersionUID = -3051881995264885587L;
	private int code;
	private String msg;
	private T data;

	public JsonResult(){
		this.code=-1;
		this.msg="初始化";
	}
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
