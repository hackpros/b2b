package com.bean;
/**
 * 
 * @author fanwg
 * @date   2014-3-11 下午2:00:25 
 * @email  renntrabbit@foxmail.com
 */
public enum ELadder {
	 
	ROOT_LEVEL((short)0),MODEL_LEVEL((short)1),TABLE_LEVEL((short)2),COLUMN_LEVEL((short)3);
    
    private final short ladder;
	private ELadder(short ladder) {
		this.ladder = ladder;
	}
	public short getLadder() {
		return ladder;
	}
}
