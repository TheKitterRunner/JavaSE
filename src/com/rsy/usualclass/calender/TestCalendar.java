package com.rsy.usualclass.calender;

import java.util.Calendar;

/**
 *   日历类
 * @author Nico
 * @createDate 2018年8月7日 下午5:15:03
 */
public class TestCalendar {	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取当前日期是当年的第多少天
		int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(day_of_year);
		
		//获取当前日期是这年 的哪一周
		int week_of_year = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(week_of_year);
		
		//获取当前日期是这一周的第几天
		int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_of_week);
		
		//获取当前日期是本月的第几天
		int day_of_month = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day_of_month);
		
		//获取当前日期是第几周
		int week_of_month = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println(week_of_month);
		
		//获取当前日期是本月的第几周
		int day_of_week_in_month = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(day_of_week_in_month);
		
		
	}
}
