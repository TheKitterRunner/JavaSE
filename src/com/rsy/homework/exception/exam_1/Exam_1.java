package com.rsy.homework.exception.exam_1;

import java.util.Scanner;

/**
 * 编写程序，要求输入若干整数，输入的同时计算前面输入各数的乘积，若乘积超过10 0000，则认为是异常，捕获并处理这个异常，输出信息。
 * @author Nico
 * @CreateDate 2018年8月17日 上午11:36:34
 */
public class Exam_1 {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		int j = 1;
		while(j <= 100000){
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			scanner.close();
			try{
				j = j * i ;
				m.setNumber(j);
			}catch (MultiException me){
				System.out.println(me.getMessage());
				System.out.println("乘积为：" + me.getNumber());
				break;
			}
			
		}
	}
}
