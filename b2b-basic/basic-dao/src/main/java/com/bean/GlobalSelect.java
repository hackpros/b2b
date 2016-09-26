package com.bean;

import java.io.Serializable;

public class GlobalSelect implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4448671572914291028L;
	public String id;
	public String text;
	
	public String pcode;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	
}
