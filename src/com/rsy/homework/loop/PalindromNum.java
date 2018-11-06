package com.rsy.homework.loop;

import java.util.Scanner;

public class PalindromNum {
	public static void main(String []args) {
		//判断一个五位数是不是回文数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int number = scan.nextInt();
		
		if ( number / 10000 == number % 10) {
			if ( number / 1000 % 10 == number % 100 / 10) {
				System.out.println(number+"是回文数");
			}else {
				System.out.println(number+"不是回文数");
			}
		}else {
			System.out.println(number+"不是回文数");
		}
	}
}