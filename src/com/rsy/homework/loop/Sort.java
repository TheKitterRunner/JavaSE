package com.rsy.homework.loop;

import java.util.Scanner;
public class Sort {
	public static void main(String[] args){
		//输入10个数并将它们排序(从小到大)
		Scanner scanner = new Scanner(System.in);
		int [] arr = {35,453,465,78,45,64,47,68,79,110};
//		int[] arr = new int[10];
//		for (int i = 0;i < arr.length ;i++ ){
//			//获取一个输入的整数
//			int n = scanner.nextInt();
//			arr[i] = n;
//		}
//		
//		for( int i = 0 ; i < arr.length ; i ++) {
//			System.out.println(arr[i]);
//		}
		int temp = 0; //临时变量
		for( int i = 0 ; i < arr.length; i ++){
			for(int j = i + 1 ; j < arr.length ; j ++){
				if(arr[i] > arr[j]){
					//将前后的数字交换位置
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//将排好序的数字打印输出
		for( int i = 0 ; i < 10 ; i ++){
			System.out.print(arr[i] + ",");
		}
	}
}
