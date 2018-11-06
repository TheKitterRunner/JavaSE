package com.rsy.Except;
/*
从键盘输入3个数,按照从小到大输出
*/
import java.util.Scanner;
public class Test1 {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	scanner.close();
	int a1 = scanner.nextInt();//输入第一个数
	int a2 = scanner.nextInt();//输入第二个数
	int a3 = scanner.nextInt();//输入第三个数

	//1.a1 > a2
	if (a1 > a2) {
		//a.a3 > a1 > a2
		if(a3 > a1) {
			System.out.println(a2 + " < " + a1 + " < " + a3);
		//b.a1 > a3 > a2
		} else if(a3 < a1 && a3 > a2) {
			System.out.println(a2 + " < " + a3 + " < " + a1);
		} else {
			System.out.println(a3 + " < " + a2 + " < " + a1);	
		}
	//2.a1 < a2
	} else {
		if(a3 < a1) {
			System.out.println(a3 + " < " + a1 + " < " + a2);
		} else if(a3 > a1 && a3 < a2) {
			System.out.println(a1 + " < " + a3 + " < " + a2);
		} else {
			System.out.println(a1 + " < " + a2 + " < " + a3);
		}
	}
}
}