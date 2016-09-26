package org.fan.baseBusiness.util;

import java.util.UUID;

/**
 * 系统常量设置
 * 
 * @author fan
 * @date 2014-9-30 上午11:30:34
 * @email renntrabbit@foxmail.com
 */
public class Constant {
	private final static String INIT_AUTHFUN_JSON = "[{'code':'doDelete','name':'删除动作','requestUrl':'%s/%s/doDelete','sort':'6','status':'0'}," +
			"{'code':'doModify','name':'修改动作','requestUrl':'%s/%s/doModify','sort':'5','status':'0'}," +
			"{'code':'modify','name':'修改页面','requestUrl':'%s/%s/modify','sort':'4','status':'0'}," +
			"{'code':'doAppend','name':'添加动作','requestUrl':'%s/%s/doAppend','sort':'3','status':'0'}," +
			"{'code':'append','name':'添加页面','requestUrl':'%s/%s/append','sort':'2','status':'0'}," +
			"{'code':'doBrowser','name':'查询动作','requestUrl':'%s/%s/doBrowser?offset=1&length=10','sort':'1','status':'0'}," +
			"{'code':'browser','name':'查询页面','requestUrl':'%s/%s/browser','sort':'0','status':'0'}]";
	
	public final static String RESPONSE_INTERFACE_CLASS	="";
	public static Object[] INIT_AUTHFUN_ARRAYS =null;
	public static final CustomObjectMapper objectMapper = new CustomObjectMapper();	
		

	/*static {
		try {
			INIT_AUTHFUN_ARRAYS= objectMapper.readValue(INIT_AUTHFUN_JSON,AuthFun[].class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	
	/**
	 * 系统版本号
	 */
	public final String VERSION = "1.0";
	/**
	 * 管理员主键
	 */
	public final static Long SYSTEM_ADMINISTRATOR_PK = 1L;

	public final String CAPTCHAID = UUID.randomUUID().toString();

	public String getVERSION() {
		return VERSION;
	}

	public String getCAPTCHAID() {
		return CAPTCHAID;
	}
	
	
	
}
