package com.rsy.homework.normalClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 9.要求，
    （1）写一个方法，传入long 时间，返回String时间格式。
    （2）再写一个方法，传入String时间格式，返回long时间。
        时间格式为：yyyy年M月d日 H：m：s
  * @author Nico
 * @createDate 2018年8月10日 下午3:24:07
 */
public class Exam_9 {
	public static void main(String[] args) throws ParseException {
		Exam_9 exam = new Exam_9();
		String time = exam.longToString(1533891716000L);
		System.out.println(time);   // 2018年8月10日17:01:56
		
		long time2 = exam.StringToLong("2018年8月10日 17:01:56");
		System.out.println(time2);
	}
	/**
	 * 写一个方法，传入long 时间，返回String时间格式。
	 * @param tri
	 * @return
	 */
	public String longToString(long tri) {
		// 创建一个long类型的时间
		Date date = new Date(tri);
		// 定制一个输出的时间格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"+"年"+"M"+"月"+"d"+"日" +" HH"+":"+"mm"+":"+"ss");
		// 将long类型的时间通过定制的格式转换成字符串型
		String stringDate = sdf.format(date);
		// 返回转换好的格式
		return stringDate;
	}
	/**
	 * 再写一个方法，传入String时间格式，返回long时间。
        	时间格式为：yyyy年M月d日 H：m：s
	 * @param dat
	 * @return
	 * @throws ParseException
	 */
	public long StringToLong(String dat) throws ParseException{
		// 定制一个输入的的时间格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"+"年"+"M"+"月"+"d"+"日" +" HH"+":"+"mm"+":"+"ss");
		// 将解析出的long类型的时间输出
		return sdf.parse(dat).getTime();
	}
		
}
