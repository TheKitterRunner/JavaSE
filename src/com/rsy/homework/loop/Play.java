package com.rsy.homework.loop;

import java.util.Arrays;
import java.util.Scanner;

public class Play {
	public static void main(String[] args){
		//有n个人围成一圈,按顺序报号,报到3的人退出,问最后剩下的是几号
		// 从键盘键入需要计算的总数量，并赋值给数组
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入总人数：");
		int n = scan.nextInt();
		boolean[] b = new boolean[n];
//		//使数组里的元素的值都为true
//		for(int i = 0; i < b.length; i ++){
//			b[i] = true;
//        }
//		//定义总的人数和计数器count（用来计数1，2，1，2，1，2.。。。）
//		int count = 0;
//		int total = n;  //总的人数
//		//当总人数大于1 时开始
//		while( total > 1){
//			for(int i = 0; i < b.length; i ++){
//				if(b[i]){
//					count ++ ;
//					if(count%3 == 0){						
//						b[i] = false;
//						total -- ;
//						count = 0;
//					}
//				}
//			}		
//		}
//		System.out.println(Arrays.toString(b));
		Arrays.fill(b, true);   //Arrays 类是Java.lang包下的常用类
		int count = 0 ;  // 用来计数，三个循环一次
		int total = n ;  // 用来表示实时的总人数
		while( total > 1) {
			for(  int i = 0 ; i < b.length ; i ++){
				if (b[i]) {
					count ++;
					if (count == 3) {
						b[i] = false ; 
						count = 0;  //  每三个清一次零
						total --;
					}
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}

