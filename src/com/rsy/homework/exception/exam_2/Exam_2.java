package com.rsy.homework.exception.exam_2;

import java.util.Scanner;

/**
 *      从控制台输入 5个整数，放入一整型数组，然后打印输出，
 * 要求：
 * 		输入数据 为整数，要捕获Integer.parseInt()产生的异常，直至用户能够输入5个整数。（用户输入的不是整数则捕获异常）
 * @author Nico
 * @CreateDate 2018年8月17日 下午1:24:42
 */
public class Exam_2 {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		for(int i = 0; i < 5; i ++){
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			try{
				int num = Integer.parseInt(s);
				intArr[i] = num;
			}catch(Exception e){
				System.out.println("输入的字符串不能转换成整数...");
				i --;
			}
		}
		System.out.print("intArr数组的元素分别为 ：[ ");
//		System.out.println(intArr.toString());
		for(int i = 0; i < intArr.length;i ++){
			if (i < 4) {
				System.out.print(intArr[i] + ",");
			}else{
				System.out.print(intArr[i] + " ]");
			}
		}
	}
}
