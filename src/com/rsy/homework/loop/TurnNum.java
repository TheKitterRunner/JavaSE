package com.rsy.homework.loop;

import java.util.Scanner;

public class TurnNum {
	//给一个不多于5位的正整数,判断它是几位数,并将这个数字倒过来打印出来 
	public static void main(String []args){
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int a1,a2,a3,a4,a5;
//		if(num /10000 >= 1){
//			System.out.println("输入的数字是一个五位数的正整数！倒序输出的数字是：");
//			a1 = num / 10000;
//			a2 = num / 1000 % 10;
//			a3 = num / 100 % 10;
//			a4 = num / 10 % 1000 % 10;
//			a5 = num % 10;
//			System.out.println(a5*10000+a4*1000+a3*100+a2*10+a1);
//		}else if(num /1000 >= 1){
//			System.out.println("输入的数字是一个四位数的正整数！倒序输出的数字是：");
//			a1 = num / 1000;
//			a2 = num / 100 % 10;
//			a3 = num / 10 % 10;
//			a4 = num % 10;
//			System.out.println(a4*1000+a3*100+a2*10+a1);
//		}else if(num /100 >= 1){
//			System.out.println("输入的数字是一个三位数的正整数！倒序输出的数字是：");
//			a1 = num / 100;
//			a2 = num / 10 % 10;
//			a3 = num % 10;
//			System.out.println(a3*100+a2*10+a1);
//		}else if(num /10 >= 1){
//			System.out.println("输入的数字是一个两位数的正整数！倒序输出的数字是：");
//			a1 = num / 10;
//			a2 = num % 10;
//			System.out.println(a2*10+a1);
//		}else{
//			System.out.println("输入的数字是一个一位的正整数！倒序输出的数字是：" + num);
//		}
		System.out.println("请输入一个数字");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = n;
		int reverse = 0;
		//计数器
		int count = 1;
		//比如123  a. i=3-->reserve = 3 --> n=12 --> count=2
		//        b. i=2-->reserve = 32 --> n=1 --> count=3
		//        c. i=1-->reserve = 321 --> n=0 --> break
		for (; 1 == 1; ){
			//取个位数
			int i = n % 10;//3
			reverse = reverse * 10 + i;
			n /= 10;
			if (n > 0) {
				count++;
			} else if(n == 0) {
				break;
			}
		}
		System.out.println(m + "是一个" + count + "位数");
		System.out.println(reverse);
	}
}
