package com.jumore.b2b.activity.service.business.io.request;

import java.io.Serializable;
import java.util.Date;

public class AppraiseReq implements Serializable {
	private Long id;

    private String name;

    private String head;

    private String code;

    private String img1;

    private String img2;

    private String img3;

    private String contant;

    private Date createTime;

    private Integer sortInex;

    private Integer good;

    private Integer better;

    private Integer best;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }

    public String getContant() {
        return contant;
    }

    public void setContant(String contant) {
        this.contant = contant == null ? null : contant.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSortInex() {
        return sortInex;
    }

    public void setSortInex(Integer sortInex) {
        this.sortInex = sortInex;
    }

    public Integer getGood() {
        return good;
    }

    public void setGood(Integer good) {
        this.good = good;
    }

    public Integer getBetter() {
        return better;
    }

    public void setBetter(Integer better) {
        this.better = better;
    }

    public Integer getBest() {
        return best;
    }

    public void setBest(Integer best) {
        this.best = best;
    }
}