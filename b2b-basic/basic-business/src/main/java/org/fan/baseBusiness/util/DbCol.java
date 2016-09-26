package org.fan.baseBusiness.util;
/**
 * 表对应的表
 * @author fanwg
 * @date   2013-8-1 下午02:56:13 
 * @email  renntrabbit@foxmail.com
 */
public class DbCol {
	
	private String tbName;  //表名
	private String colName; //列名
	private String comments;//注释
	private String dataType;//列类型
	private int dataLength; //列长度
	private int dataScale;//小数位
	private int dataPrecision;//整数位
	
	private String nullAble; // 中是空
	private String constraintName;//约束名
	private String constraintType;//约束类型
	private boolean select;     //是否下拉列表选项
	
	public String getTbName() {
		return tbName;
	}
	public void setTbName(String tbName) {
		this.tbName = tbName;
	}
	public String getColName() {
		return colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public int getDataLength() {
		return dataLength;
	}
	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}
	public int getDataScale() {
		return dataScale;
	}
	public void setDataScale(int dataScale) {
		this.dataScale = dataScale;
	}
	public int getDataPrecision() {
		return dataPrecision;
	}
	public void setDataPrecision(int dataPrecision) {
		this.dataPrecision = dataPrecision;
	}
	public String getNullAble() {
		return nullAble;
	}
	public void setNullAble(String nullAble) {
		this.nullAble = nullAble;
	}
	public String getConstraintName() {
		return constraintName;
	}
	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
	}
	public String getConstraintType() {
		return constraintType;
	}
	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}
	public boolean isSelect() {
		return select;
	}
	public void setSelect(boolean select) {
		this.select = select;
	}
	
	
	

}
