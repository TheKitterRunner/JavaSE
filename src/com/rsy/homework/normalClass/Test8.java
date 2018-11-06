package com.rsy.homework.normalClass;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 8.输出指定年月的月历，年月从键盘输入。每星期一行，从星期日开始，到星期六结束。
	比如：2016年9月的月历。
 * @author Nico
 * @createDate 2018年8月10日 下午2:32:24
 */
public class Test8 {
	public static void main(String[] args) {
		// 键盘输入年和月
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		scanner.close();
		int day = 0;
		// 计算选中月有多少天
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
			month == 10 || month == 12) {
			day = 31;
		}
		if(month == 4 || month == 6 || month == 9 || month == 11){
			day = 30;
		}else if( month == 2){
			if(( year % 400 == 0)||( year % 4 == 0 && year %100 != 0)) {
				day = 29;
			}else {
				day = 28;
			}
		}
		// 调用当月第一天是周几的方法
		int dayOFWeek = new Test8().whichDayOfWeek(year, month);
		System.out.println("这个月的第一天是星期：" + (dayOFWeek - 1));
		// 打印日历头
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
		// 空出第一天之前的几天
		for( int i = 1; i < dayOFWeek; i ++){
			System.out.print("\t");
		}
		for (int i= 1;i <= day ;i++ ){
			System.out.print(i+"\t");
			//满7个换行
			if ((i + dayOFWeek - 1) % 7 == 0 ){
                 System.out.println();
			}
		}
	}
	/**
	 *  输出制定月的第一天是周几的方法
	 * @param year
	 * @param month
	 * @return
	 */
	public int whichDayOfWeek(int year, int month){
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month,1); 
		return calendar.get(Calendar.DAY_OF_WEEK);	
	}
}	 	


