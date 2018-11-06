package com.rsy.homework.normalClass;

import java.util.Scanner;

/**
 * 6.写一个方法，判断一个字符串是否对称。比如： abcba就是一个对称字符串
 * 
 * @author Nico
 * @createDate 2018年8月10日 下午1:28:03
 */
public class Test6 {

	public static String reverseStr(String originStr) {

		if (originStr == null || originStr.length() <= 1)

		return originStr;

		return reverseStr(originStr.substring(1)) + originStr.charAt(0);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 想获得一个字符串
		String s = scanner.nextLine();
		scanner.close();
		StringBuffer sb = new StringBuffer(s);
		if (sb.equals(sb.reverse())) {
			System.out.println("要判断的字符串是对称的！");
		} else {
			System.out.println("要判断的字符串是不对称的！");
		}
	}
}
// // 先将字符串转换成字符数组
// char[] ch = s.toCharArray();
// int count = 0;
// System.out.println(s.length());
// // 判断相互镜像的元素是否相等
// if (ch.length % 2 == 1) {
// for (int i = 0; i < (ch.length / 2); i++) {
// for( int j = ch.length - 1; j > (ch.length / 2); j --){
// if ((ch[i] == ch[j])) {
// count ++;
// }
// }
// }
// }else{
// for (int i = 0; i < (ch.length / 2); i++) {
// for( int j = ch.length - 1; j >= (ch.length / 2); j --){
// if ((ch[i] == ch[j])) {
// count ++;
// }
// }
// }
// }
// if (count == (ch.length / 2)) {
// System.out.println("要判断的字符串是对称的！");
// }else{
// System.out.println("要判断的字符串是不对称的！");
//
// }
