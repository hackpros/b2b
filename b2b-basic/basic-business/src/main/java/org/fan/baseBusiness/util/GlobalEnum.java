package org.fan.baseBusiness.util;

public class GlobalEnum {
	
	/**
	 * 
	 * @author Administrator
	 *
	 */
	public enum GlobStatus {
		DISABED, ENABLED

	}
	/**
	 * 
	 * @author Administrator
	 *
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

}