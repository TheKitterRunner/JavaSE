package com.rsy.homework.loop;

import java.util.Scanner;
/**
 * 输入一个正整数，分解质因数并输出
*@author Nico
*2018年7月26日下午6:55:14
*/
public class DivideNumber {
	//判断键入的数字是否是质数
//	public boolean judge(int n){
//		if(n == 2){
//			return true;
//		}
//		for( int i = 2 ; i < n ; i ++){
//			if(n % i == 0){
//				return false;
//			}
//		}
//		return true; 	
//	}
//	// 分解质因数的方法（用到了递归的方法）
//	public void divide(int n){
//		if(judge(n)){
//			System.out.println(n);
//		}else{
//			for(int i = 2 ; i < n ; i ++){
//				if(n % i == 0){
//					System.out.print(i + "*");
//					divide(n/i);
//					return;
//				}
//			}
//		}
//	}
//	//主方法
//	public static void main(String[] args){
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		DivideNumber di = new DivideNumber();
//		System.out.print(n + "=");
//		di.divide(n);
//	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		System.out.print( n + " = ");
		if (n >= 2){
			for( int i = 2; i <= n ; i ++){
				if (n % i == 0) {
					System.out.print( i + " ");
					n = n / i;
					i -- ;
					if( n > 1){
						System.out.print("* ");
					}
				}
			}
		}else{
			System.out.println("分解不了了！");
		}
		
	}
} 	
