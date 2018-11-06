package com.rsy.homework.normalClass;

import java.util.Scanner;

/**
 * 11.已知[a-z]的asc码值是：97-122，[A-Z]的asc码值是:65-90,随机打印一个英文字符，可以是大写，可以是小写
 * @author Nico
 * @createDate 2018年8月10日 下午5:23:28
 */
public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字母：");
		String str = scanner.nextLine();
		scanner.close();
		char[] ch = new char[1];
		ch = str.toCharArray();
		
		if (ch[0] >= 65 && ch[0] <= 90 ) {
			System.out.println(ch[0]);
		}
		if (ch[0] >= 97 && ch[0] <= 122) {
			System.out.println(ch[0]);
		}
	}
}

//		char[] ch1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
//				'q','r','s','t','u','v','w','x','y','z'};
//		char[] ch2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
//				'Q','R','S','T','U','V','W','X','Y','Z'};
//		
//		for (int j = 0; j < ch1.length; j++) {
//			if (ch[0] == ch1[j]) {
//					
//			}
//		}