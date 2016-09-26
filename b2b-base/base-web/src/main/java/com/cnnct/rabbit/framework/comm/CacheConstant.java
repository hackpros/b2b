package com.cnnct.rabbit.framework.comm;

public abstract interface CacheConstant {
	public final static String AUTHFUN_CACHE = "AUTHFUN_CACHE_KEY.";
	public final static String SYSOPTION_CACHE = "SYSOPTION_CACHE_KEY.";
	public final static String CUSTORM_CACHE = "CUSTORM_CACHE_KEY.";
	public final static String PRODUCT_CACHE = "PRODUCT_CACHE_KEY.";

	enum ELadder {

		ROOT_LEVEL((short) 0), MODEL_LEVEL((short) 1), TABLE_LEVEL((short) 2), COLUMN_LEVEL((short) 3);

		private final short ladder;

		private ELadder(short ladder) {
			this.ladder = ladder;
		}

		public short getLadder() {
			return ladder;
		}
	}

}
