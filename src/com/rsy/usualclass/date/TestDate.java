package com.rsy.usualclass.date;

import java.util.Date;

/**
 * Date类
 * @author Nico
 * @createDate 2018年8月7日 下午5:06:48
 */
public interface TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		//从1970年到现在的毫秒数
		long time = date.getTime();
		System.out.println(time);
		Date date2 = new Date(1533632922513L);
		
		System.out.println(date.before(date2));
		System.out.println(date2.before(date));
		
		int i = date.compareTo(date2);
		System.out.println(i);
		
		System.out.println(date);
		
	}
}
