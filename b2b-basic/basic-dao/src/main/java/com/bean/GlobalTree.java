package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GlobalTree  {
	
	public long id;
	public String name;
	public String code;
	public long parentId;
	public short level; //grade ladder
	public List<GlobalTree> children=new ArrayList<GlobalTree>();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	
	public List<GlobalTree> getChildren() {
		return children;
	}
	public void setChildren(List<GlobalTree> children) {
		this.children = children;
	}
	public short getLevel() {
		return level;
	}
	public void setLevel(short level) {
		this.level = level;
	}
	
	

}
