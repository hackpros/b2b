package com.rabbit.fanbase.io.response;

import java.io.Serializable;
import java.util.Date;

public class SysItemRes implements Serializable {
    private Long id;

    private Long parentId;

    private int ladder;

    private String itemCode;

    private String itemComments;

    private Short status;

    private String keyCode;

    private String keyValue;

    private Short sort;

    private Long appendBy;

    private Date appendTime;

    private Long modifyBy;

    private Date modifyTime;

    private String remark;

    private String excerptItemCode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public int getLadder() {
        return ladder;
    }

    public void setLadder(int ladder) {
        this.ladder = ladder;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemComments() {
        return itemComments;
    }

    public void setItemComments(String itemComments) {
        this.itemComments = itemComments;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Long getAppendBy() {
        return appendBy;
    }

    public void setAppendBy(Long appendBy) {
        this.appendBy = appendBy;
    }

    public Date getAppendTime() {
        return appendTime;
    }

    public void setAppendTime(Date appendTime) {
        this.appendTime = appendTime;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExcerptItemCode() {
        return excerptItemCode;
    }

    public void setExcerptItemCode(String excerptItemCode) {
        this.excerptItemCode = excerptItemCode;
    }
    
    
    /**
	 * 选项状态
	 * 
	 * @author fanwg
	 * @date 2013-8-14 上午11:09:13
	 * @email renntrabbit@foxmail.com
	 */
	public interface STATUS {
		short DISABED = 1;
		short ENABLED = 0;
	}

	public interface LADDER {
		short ROOT_LEVEL = 0; // 根节点
		short MODEL_LEVEL = 1; // 模块级别
		short TABLE_LEVEL = 2; // 表级别
		short COLUMN_LEVEL = 3; // 列级别
	}
}