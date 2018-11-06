package com.rsy.homework.normalClass;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test12 {
	public static void main(String[] args) {
		char[] ch = {'a', 'b', 'c'};
		String string ="";
		for (int i = 0; i < ch.length; i++) {
			string  += ch[i] + "";
		}
		
		Calendar calendar = Calendar.getInstance(); 

		//格式化日期 java8
		DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date = LocalDate.now();
		// 之前
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date2 = new Date();

		System.out.println(date.format(newFormatter));
		System.out.println(simpleDateFormat.format(date2));
		
		System.out.println(string);
		// 从1970年1月1日0时0分0秒到现在的毫秒数
		System.out.println(calendar.getTimeInMillis());
		System.out.println(Clock.systemDefaultZone().millis());
		// 某月最后一天
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	} 
}
