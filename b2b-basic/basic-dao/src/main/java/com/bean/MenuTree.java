package com.bean;

import java.util.List;

import com.rabbit.model.AuthFun;

public class MenuTree extends GlobalSelect {

	private static final long serialVersionUID = 5462043524045516992L;
	
	private Long menuId;
	private int ladder;
	private Long parentId;
	private AuthFun AuthFun;
	private Long currAdminId;
	private Long authorityId;
	private List<MenuTree> children;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public int getLadder() {
		return ladder;
	}

	public void setLadder(int ladder) {
		this.ladder = ladder;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public AuthFun getAuthFun() {
		return AuthFun;
	}

	public void setAuthFun(AuthFun authFun) {
		AuthFun = authFun;
	}

	public Long getCurrAdminId() {
		return currAdminId;
	}

	public void setCurrAdminId(Long currAdminId) {
		this.currAdminId = currAdminId;
	}

	public Long getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Long authorityId) {
		this.authorityId = authorityId;
	}

	public List<MenuTree> getChildren() {
		return children;
	}

	public void setChildren(List<MenuTree> children) {
		this.children = children;
	}

}
