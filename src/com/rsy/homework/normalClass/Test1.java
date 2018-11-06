package com.rsy.homework.normalClass;
/**
 * 1.已知字符串："this is a test of java"
	按要求执行以下操作：
	(1) 统计该字符串中字母s出现的次数
	(2) 取出子字符串"test"
	(3) 将本字符串复制到一个字符数组Char[] str中.
	(4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
	(5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
 * @author Nico
 * @createDate 2018年8月9日 下午2:17:45
 */
public class Test1 {
	public static void main(String[] args) {
		String s = "this is a test of java";
		
		// (1)统计该字符串中字母s出现的次数
		char[] char1 = s.toCharArray();
		int count = 0;
		for(int i = 0; i < char1.length; i ++ ){
			if (char1[i] == 's') {
				count ++;
			}
		}
		System.out.println(count);
		// (2)取出子字符串"test"
//		System.out.println(s.substring(10,14));
		if (s.contains("test")) {
			System.out.println(s.substring(s.indexOf("test"),s.indexOf("test") + 4));
		}
		// (3)将本字符串复制到一个字符数组Char[] str中.
		char[] str = s.toCharArray();
		System.out.println(str);

		// (4)将字符串中每个单词的第一个字母变成大写， 输出到控制台。  this is a test of java
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if ( i == 0) {
				sb.append(s.substring(0,1).toUpperCase());
			}else{
				char char2 = s.charAt(i);
				if (char2 == ' ') {
					sb.append(" ");
					sb.append((char)(s.charAt(i + 1) - 32));
					i ++;
				}else{
					sb.append(s.charAt(i));
				}
			}
		}
		System.out.println(sb);

//		String s1 = s.substring(0,1).toUpperCase();
//		String s2 = s.substring(5,6).toUpperCase();
//		String s3 = s.substring(8,9).toUpperCase();
//		String s4 = s.substring(10,11).toUpperCase();
//		String s5 = s.substring(15,16).toUpperCase();
//		String s6 = s.substring(18,19).toUpperCase();
//		System.out.println(s1 + s.substring(1, 5) + s2 + s.substring(6, 8) + s3 + s.substring(9, 10) + 
//				s4 + s.substring(11, 15)+ s5 +s.substring(16, 18)+ s6+s.substring(19, 22));
		
		// (5)用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
		// 方法一
		StringBuffer sb1 = new StringBuffer(s);
		System.out.println(sb1.reverse());
		// 方法二
		for( int j = str.length-1 ; j >= 0; j --){
			System.out.print(str[j]);
		}
		 
	}
}
