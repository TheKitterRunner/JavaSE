package com.rsy.StringDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {
	public static void main(String []args) throws UnsupportedEncodingException{
		@SuppressWarnings("unused")
		String s1 = new String("A");
		
		char[] cha = new char[]{'A','B','C','D','E','F','G'};
		String s2 = new String(cha);
		System.out.println(s2);
		
		String s3 = new String(cha,1,4);
		System.out.println(s3);
		//将字符串转换成字节数组
//		byte[] b = "千古风流人物，还看今朝了".getBytes(); 
		byte[] b = "千古风流人物，还看今朝了".getBytes("UTF-8"); 
		System.out.println("这是字节数组：" + b);
		//将字节数组转换成字符串
		String s4 = new String(b,"gbk");
		System.out.println(s4);
		//  先将乱码的数组按照原有的编码格式转换回去，再用新的编码方式将字节数组转换成字符串
		byte[] s5 = s4.getBytes("gbk");
		String s6 = new String(s5,"UTF-8");
		System.out.println(s6);
		
		System.out.println("==========================");
		
		System.out.println("asdfghj".startsWith("a"));

		System.out.println("==========================");
		
		System.out.println("asdfghj".endsWith("hj"));

		System.out.println("==========================");
		
		System.out.println("asdfghj".compareTo("asdfghj"));
		
		System.out.println("==========================");
		
		System.out.println("asdfghj".compareToIgnoreCase("AsDfGhJ")); //忽略大小写

		System.out.println("==========================");
		
		System.out.println("asdfghj".contains("dfg")); //元字符串中是否含有指定的字符串返回boolean值

		System.out.println("==========================");
		
		System.out.println("asdfghj".indexOf("df")); //返回自定字符（串）出现位置的字符串索引

		System.out.println("==========================");
		
		System.out.println("asdfghj".indexOf('g',9)); 

		System.out.println("==========================");
		
		System.out.println("asdfghj".substring(2, 5)); // 从下标 2 开始索引（5-2）个位置
		
		System.out.println("==========================");
		
		System.out.println("    as  dfghj    ".trim());//  去掉字符串前后的空格，不包括字符串中间的空格
		
		System.out.println("==========================");

		//将字符串中字符排序后输出
		char[] ch = "qwefgergeb".toCharArray();
		Arrays.sort(ch);
		for(char c:ch){
				System.out.print(c);
		}
		
		//  指定字符串的分隔符，吧一个字符串按照指定的分隔符分成字符串数组
		System.out.println("==========================");
		String[] arr = "足球.篮球.乒乓求.棒球 .橄榄球".split("\\.");
		for(String a : arr){
			System.out.println(a);
		}
		System.out.println("==========================");
		String s7 = "足球.篮球.乒乓求.棒球 .橄榄球";
		String s8 = s7.replace("足球", "板球");
		System.out.println(s8);
	}
}
