/**
 * @FileName:OrderSnUtil
 * @Package: com.asura.utils.order
 *
 * @author sence
 * @created 11/27/2014 11:38 AM
 *
 * Copyright 2011-2015 Asura
 */
package com.pub.open.commons.util;

import com.asura.framework.base.util.DateUtil;
import com.asura.framework.base.util.RandomUtil;
import com.pub.open.commons.constant.OrderConstant;
import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * <p>订单号码生成规则</p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sence
 * @since 1.0
 * @version 1.0
 */
public class OrderSnUtil {

	public static final String TIMESTAMP_PARTTERN = "yyyy-MM-dd HH:mm:ss:sss";
	/**
	 * 生成订单号
	 * @return
	 */
	public static String genOrderSn (OrderConstant.OrderSnType type) {
		String format = DateUtil.dateFormat(new Date(),TIMESTAMP_PARTTERN );
		int millisecondTag = format.lastIndexOf(":");
		String millisecond = format.substring(millisecondTag + 1);
		String millSecondsDate = DateUtil.replaceAllSeparator(format.substring(0, millisecondTag)).substring(2);
		String random = RandomUtil.genRandomNum(4);
		return random.concat(millisecond).concat(type.getSeqCode()).concat(millSecondsDate);
	}


	/** * @return 形如 yyyyMMddHHmmssSSS-Z0000019558195832297 的(38位)保证唯一的递增的序列号字符串， * 主要用于数据库的主键，方便基于时间点的跨数据库的异步数据同步。 * 前半部分是currentTimeMillis，后半部分是nanoTime（正数）补齐20位的字符串， * 如果通过System.nanoTime()获取的是负数，则通过nanoTime = nanoTime+Long.MAX_VALUE+1; * 转化为正数或零。 */

	public static String getTimeMillisSequence(){ long nanoTime = System.nanoTime(); String preFix=""; if (nanoTime<0){ preFix="A";

		// /负数补位A保证负数排在正数Z前面,解决正负临界值(如A9223372036854775807至Z0000000000000000000)问题。
		nanoTime = nanoTime+Long.MAX_VALUE+1; }else{ preFix="Z"; } String nanoTimeStr = String.valueOf(nanoTime);
		int difBit=String.valueOf(Long.MAX_VALUE).length()-nanoTimeStr.length();
		for (int i=0;i<difBit;i++){ preFix = preFix+"0"; } nanoTimeStr = preFix+nanoTimeStr;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		//24小时制
		String timeMillisSequence=sdf.format(System.currentTimeMillis())+"-"+nanoTimeStr;
		return timeMillisSequence;
	}


	public static String s(){
		char[] letters = {'A', 'C', '1', '2', '3','4', 'a', 'e', 'f', 'z'}; //这里根据你的需要初始化不同的字符
		 String tStr = String.valueOf(System.currentTimeMillis());
		/*因为tStr的字符只有‘0’-‘9’，我们可以把它看成索引到letters中找相应的字符，这样相当于“置换”，所以是不会重复的。*/
		System.out.println(tStr);
		StringBuilder sb = new StringBuilder();

		for(int i=1;i<tStr.length();i++) {
			sb.append(letters[tStr.charAt(i)-'0']);
		}

		return sb.toString();
	}




	private static String count = "000";
	private static String dateValue = "20131115";

	/**
	 * 产生流水号
	 */
	public synchronized static String getMoveOrderNo() {
		long No = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String nowdate = sdf.format(new Date());
		No = Long.parseLong(nowdate);
		if (!(String.valueOf(No)).equals(dateValue)) {
			count = "000";
			dateValue = String.valueOf(No);
		}
		String num = String.valueOf(No);
		num += getNo(count);
		num = "CB" + num;
		return num;
	}

	/**
	 * 获取撤展单序列号
	 */
	public synchronized static String getMoveOrderNo(String serialNum) {
		String nyr = StringUtils.substring(serialNum, 2, 10); // 获取年月日字符串
		String countV = StringUtils.substring(serialNum, 10); // 获取流水号
		if (Integer.valueOf(countV) > Integer.valueOf(count)) {
			dateValue = nyr;
			count = String.valueOf(countV);
		}
		return getMoveOrderNo();
	}

	/**
	 * 返回当天的订单数+1
	 */
	public static String getNo(String s) {
		String rs = s;
		int i = Integer.parseInt(rs);
		i += 1;
		rs = "" + i;
		for (int j = rs.length(); j < 3; j++) {
			rs = "0" + rs;
		}
		count = rs;
		return rs;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getMoveOrderNo());
		}
	}
}

