package com.rabbit.basic.control.comm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 七牛上传图片
 * 
 * @author zf
 * @since p2p_cloud_v1.0
 */
@Controller
public class QiniuController {

	public final static String QINIU_DOMAIN = "http://7xkctq.com1.z0.glb.clouddn.com/";
	// public final static String
	// QINIU_ACCESSKEY="1ULgcoY5-AZNYY4ms-sqRSkqa_FTgzkuWf7u0BJn";
	// public final static String
	// QINIU_SECRETKEY="B40V9_WTf9Kn5QZTQsphk2kr99OaqXn6hbZLXAUy";

	// fans_2046@126.com
	public final static String QINIU_ACCESSKEY = "PQk7gBQwctEX2QoVJLlI7PEvkiFIZhwDbe3E4Zq4";
	public final static String QINIU_SECRETKEY = "rWQgTzSna-kqudrZjmhNsboaLPdfWGhBSKmHX7Ug";

	/**
	 * 七牛TOKEN
	 * 
	 * @return String
	 * @since p2p_cloud_v1.0
	 */
	@RequestMapping("7niu/uptoken")
	@ResponseBody
	public String getUpToken() {
		// Auth auth = Auth.create(QINIU_ACCESSKEY, QINIU_SECRETKEY);
		// return String.format("{\"%s\":\"%s\"}", "uptoken",
		// auth.uploadToken("test"));
		return null;
	}

	// qiniu.domain=http://7xkctq.com1.z0.glb.clouddn.com/
	// qiniu.accessKey=1ULgcoY5-AZNYY4ms-sqRSkqa_FTgzkuWf7u0BJn
	// qiniu.secretKey=B40V9_WTf9Kn5QZTQsphk2kr99OaqXn6hbZLXAUy

	/**
	 * 七牛TOKEN
	 * 
	 * @return String
	 * @since p2p_cloud_v1.0
	 */
	@RequestMapping("/uptoken/{c}/{u}/{r}")
	@ResponseBody
	public String getUpToken(@PathVariable String c, @PathVariable String u,
			@PathVariable String r) {
		// Auth auth = Auth.create(QINIU_ACCESSKEY, QINIU_SECRETKEY);
		// return String.format("{\"%s\":\"%s\"}", "uptoken",
		// auth.uploadToken("test", c + "/" + u + "/" + r));
		return null;
	}

	/**
	 * 七牛TOKEN
	 * 
	 * @return String
	 * @since p2p_cloud_v1.0
	 */
	@RequestMapping("/qiniuDomain")
	@ResponseBody
	public String qiniuDomain() {
		return QINIU_DOMAIN;
	}

}