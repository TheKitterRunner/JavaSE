package com.rsy.usualclass.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 时间格式化类
 * @author Nico
 * @createDate 2018年8月7日 下午5:40:58
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//format 的方法
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM-dd HH:mm:ss");
		String date1 = sdf.format(date);
		System.out.println(date1);
		
//		//parse方法解析字符串
//		String dateString = new String(" 2018-08-06 17:58:59");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date2 = sdf2.parse(dateString);
//		System.out.println(date2);
	}
}
