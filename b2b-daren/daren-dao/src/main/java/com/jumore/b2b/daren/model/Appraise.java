package com.jumore.b2b.daren.model;

import java.io.Serializable;
import java.util.Date;

public class Appraise implements Serializable {
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Appraise other = (Appraise) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHead() == null ? other.getHead() == null : this.getHead().equals(other.getHead()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getImg1() == null ? other.getImg1() == null : this.getImg1().equals(other.getImg1()))
            && (this.getImg2() == null ? other.getImg2() == null : this.getImg2().equals(other.getImg2()))
            && (this.getImg3() == null ? other.getImg3() == null : this.getImg3().equals(other.getImg3()))
            && (this.getContant() == null ? other.getContant() == null : this.getContant().equals(other.getContant()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSortInex() == null ? other.getSortInex() == null : this.getSortInex().equals(other.getSortInex()))
            && (this.getGood() == null ? other.getGood() == null : this.getGood().equals(other.getGood()))
            && (this.getBetter() == null ? other.getBetter() == null : this.getBetter().equals(other.getBetter()))
            && (this.getBest() == null ? other.getBest() == null : this.getBest().equals(other.getBest()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHead() == null) ? 0 : getHead().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getImg1() == null) ? 0 : getImg1().hashCode());
        result = prime * result + ((getImg2() == null) ? 0 : getImg2().hashCode());
        result = prime * result + ((getImg3() == null) ? 0 : getImg3().hashCode());
        result = prime * result + ((getContant() == null) ? 0 : getContant().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSortInex() == null) ? 0 : getSortInex().hashCode());
        result = prime * result + ((getGood() == null) ? 0 : getGood().hashCode());
        result = prime * result + ((getBetter() == null) ? 0 : getBetter().hashCode());
        result = prime * result + ((getBest() == null) ? 0 : getBest().hashCode());
        return result;
    }
}