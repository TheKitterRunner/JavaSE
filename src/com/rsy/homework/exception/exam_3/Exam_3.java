package com.rsy.homework.exception.exam_3;

import java.util.Scanner;

public class Exam_3 {
	public static void main(String[] args) {
		// 从键盘接收三个边长
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		Exam_3.sanjiao(i, j, k);
	}
	
	public static void sanjiao(int a, int b, int c){
		// 创建一个实例对象，传入三个边长；
		TriAngle angle = new TriAngle(a,b,c);
		try {
			// 判断是否是三角形
			angle.judge();
			System.out.println(angle);
		} catch (TrigonometricFunctionException e) {
			System.out.println(e.getMessage());
		}
	}
}
