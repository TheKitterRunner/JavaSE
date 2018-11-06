package com.rsy.homework.loop;

import java.util.Scanner;

public class Days {
	public static void main(String []args) {
		//某年某一天是那一年的第几天
		//键盘输入年，月份和日
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入year：");
		int year  =  sca.nextInt();
		System.out.println("请输入month：");
		int month = sca.nextInt();
		System.out.println("请输入day：");
		int day = sca.nextInt();
		int count = 0 ;
		int days = 0 ;
		for( int n = 1993 ; n <= 2017 ; n ++) {
			if((n % 400 == 0 ) || (n % 4 == 0 && n % 100 != 0 )) {
				count += 366;
			}else {
				count += 365;
			}
		}
			switch (month) {
				case 12 :
					count += 30;
					days += 30;
				case 11 :
					count += 31;
					days += 31;
				case 10 :
					count += 30;
					days += 30;
				case 9 :
					count += 31;
					days += 31;
				case 8 :
					count += 31;
					days += 31;
				case 7 :
					count += 30;
					days += 30;
				case 6 :
					count += 31;
					days += 31;
				case 5 :
					count += 30;
					days += 30;
				case 4:
					count += 31;
					days += 31;
				case 3 :
					if((year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0 )) {
						count += 29;
						days += 29;
					}else {
						count += 28;
						days += 28;
					}
				case 2 :
					count += 31;
					days += 31;
				case 1 :
					count += day;
					days += day;
					System.out.println("这是" + year + "年的第" + days + "天 !");
					break ;
			}		
		System.out.println("这是我来到世界的第" + count + "天 !");
	}
}

