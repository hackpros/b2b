package com.rabbit.fanbase.io.response;

import java.io.Serializable;
import java.util.List;

public class SysMenuRes implements Serializable {
    private Long id;

    private String code;

    private String name;

    private String nameEn;

    private int ladder;

    private Long parentId;

    private Integer sort;

    private String pictureId;

    private String url;

    private Long authorityId;

    private List<SysMenuRes> children;
    
    //附加列
    private Long currAdminId;
    
    private static final long serialVersionUID = 1L;
    
    public List<SysMenuRes> getChildren() {
		return children;
	}

	public void setChildren(List<SysMenuRes> children) {
		this.children = children;
	}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

	public Long getCurrAdminId() {
		return currAdminId;
	}

	public void setCurrAdminId(Long currAdminId) {
		this.currAdminId = currAdminId;
	}
    
}