package org.fan.baseBusiness.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串处理工具类
 * 
 * @author fanwg
 * @date 2013-8-15 下午03:42:54
 * @email renntrabbit@foxmail.com
 */
public class StringUtil {
	/**
	 * 身份证号
	 * 
	 * @param idCard
	 * @return
	 */
	public static String idCard2Mask(String idCard) {
		return idCard.replaceAll("(\\d{7})\\d{5}(\\d{5})", "$1********$2");

	}

	/**
	 * 集付通卡卡号
	 * 
	 * @param JftCardNo
	 * @return
	 */
	public static String JftCardNo2Mask(String JftCardNo) {
		if (JftCardNo.length() == 18) {
			return JftCardNo.replaceAll("(\\d{10})\\d{4}(\\w{4})", "$1****$2");
		} else {
			return JftCardNo.replaceAll("(\\d{8})\\d{4}(\\w{3})", "$1****$2");
		}

	}

	/**
	 * 手机号码
	 * 
	 * @param JftCardNo
	 * @return
	 */
	public static String mobileNo2Mask(String mobileNo) {
		return mobileNo.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");

	}

	/**
	 * 手机号码
	 * 
	 * @param JftCardNo
	 * @return
	 */
	public static String name2Mask(String name) {

		int i = getChineseWordLength(name);
		if (i <= 2) {
			i = 0;
		}else{
			i=i-2;
		}
		return name.replaceAll("([\u4E00-\u9FA5]{1})([\u4E00-\u9FA5]{" + i + "})([\u4E00-\u9FA5]{1})", "$1*$3");

	}

	// 统计汉字的个数
	public static int getChineseWordLength(String name) {
		int count = 0;
		Pattern pattern = Pattern.compile("[\u4E00-\u9FA5]");
		char c[] = name.toCharArray();
		for (int i = 0; i < c.length; i++) {
			Matcher matcher = pattern.matcher(String.valueOf(c[i]));
			if (matcher.matches()) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 是否包含中文字符
	 */
	public static boolean isContainChinese(String chinese) {

		final String regex = "[^\u4E00-\u9FA5]+$";
		return !Pattern.compile(regex).matcher(chinese).matches();
	}

	public static void main(String[] args) {
		System.out.println(StringUtil.mobileNo2Mask("135031205211"));
		System.out.println(StringUtil.name2Mask("李小环"));
		System.out.println(StringUtil.name2Mask("西门崔雪"));
		System.out.println(StringUtil.name2Mask("张二"));
		System.out.println(StringUtil.name2Mask("倚天屠龙记"));
	}
}
