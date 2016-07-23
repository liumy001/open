/**
 * @FileName:RandomUtil
 * @Package: com.asura.utils.order
 *
 * @author sence
 * @created 11/27/2014 11:40 AM
 *
 * Copyright 2011-2015 Asura
 */
package com.pub.open.commons.util;

import java.util.Random;

/**
 *
 * <p>生成指定的随机数</p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改�?			修改内容
 * </PRE>
 *
 * @author sence
 * @since 1.0
 * @version 1.0
 */
public class RandomUtil {


	//private static final char[] NUMS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9','a','b','c','d','e','k','g','h','n','o','p','q','s','u','v','x','y','z'};

	private static final char[] NUMS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


	/**
	 *
	 * 生成指定位数的数字串
	 *
	 * @author zhangshaobin
	 * @created 2013-6-6 下午7:07:24
	 *
	 * @param pwdLen
	 * @return
	 */
	public static String genRandomNum (int pwdLen) {
		int maxNum = 1000;
		int i; // 生成的随机数
		int count = 0; // 生成的长度
		StringBuffer pwd = new StringBuffer("");
		Random r = new Random();
		while (count < pwdLen) {
			// 生成随机数，取绝对值，防止生成负数，
			i = Math.abs(r.nextInt(maxNum)); // 生成的数最大为36-1
			i = i % NUMS.length;
			if (i >= 0 && i < NUMS.length) {
				pwd.append(NUMS[i]);
				count++;
			}
		}
		return pwd.toString();
	}

}
