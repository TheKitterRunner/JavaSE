package com.rsy.usualclass.string;

import java.io.UnsupportedEncodingException;

public class TestString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		System.out.println(s1 == s2);    //  比较的是内存地址
		// 当用equals()方法进行比较时，对类File、String、Date及包装类（Wrapper Class）来说
		// 是比较类型及内容而不考虑引用的是否是同一个对象；
		System.out.println(s1.equals(s2));  
		System.out.println(s2 == s3);     //  
		System.out.println(s2 + s3 == "JavaJava");
		
		//StringBuilder的append()方法    就是在字符串的末尾增加字符串,返回的是相同的字符串.没有新建字符串对象
		StringBuilder sb = new StringBuilder(s2);
		sb.append(s3);
		System.out.println(sb);
		// 将一个字节数组的元素整合成一个字符串
		String s4 = new String(new byte[]{105,97,85,75});  //这里和数组里面的数字关联比较大,软件默认的编码格式是UTF-8
		System.out.println(s4);
		//通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。
		String s5 = new String(new byte[]{105,97,85,75},"UTF-8");  
		System.out.println(s5);
		
		String s6 = new String(new byte[]{105,97,85,75},"GBK");  
		System.out.println(s6);
		
		//使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
		String s7 = "我是一个中国人";
		byte[] byteArray = s7.getBytes();
		for(byte s:byteArray){
			System.out.println(s);
		}
		// 通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。说明"我"占有三个字节
		String s8 = new String(new byte[]{-26,-120,-111},"utf-8");
		System.out.println(s8);
		
		//将此字符串转换为一个新的字符数组
		char[] charArray  = s7.toCharArray();
		for(char  c : charArray){
			System.out.println((int)c);  //把字符数组成功转型为int 数组
		}
		
		String s9 = new String(new StringBuilder("Java"));
		System.out.println(s9);
		
		//按字典顺序比较两个字符串。该比较基于字符串中各个字符的 Unicode 值
		String s10 = "qwerrtyuu";
		String s11 = "qwerrtyuur";
		System.out.println(s10.compareTo(s11));
		
		String s12 = "我爱中国";   //  我:25105
		String s13 = "你爱中国吗";   //  你:20320
		System.out.println(s12.compareTo(s13));   // 只比较了每个字符串的第一个字符的Unicode值  结果:4785
		
		//将指定字符串连接到此字符串的结尾。
		String s14 = new String("qwertt");
		String s15 = s14.concat("asdfg");
		System.out.println(s15);
		
		//字符串里是否含有另外一个字符串,如果包含则返回索引值,如果不包含,返回-1
		String s16 = "testwet";
		int i = s16.indexOf("we");
		System.out.println(i);
		
		//startWith endWith :是否是以指定的字符串结尾
		String s17 = "test";
		System.out.println(s17.startsWith("t"));
		System.out.println(s17.endsWith("t"));
		
		//lastIndexOf 子字符串最后一次出现在该 字符串中的位置
		String s18 = "ststststste";
		System.out.println(s18.lastIndexOf("st"));
		
		//split方法 ,按照指定的规则(也可以是某个字母)去分割字符串  ,分割 成String[]
		String s19 = new String("a,s,d,f,g,h");
		String[] stringArray = s19.split(",");
		for(String s: stringArray){
			System.out.println(s);
		}
		
		//substring 截取字符串 (起,止)
		String s20 = "zxcvbnm";
		System.out.println(s20.substring(3, 6));
		
		//String static 方法 valueOf
		String trueString = String.valueOf(true); //"true"
		//返回指定数组中表示该字符序列的 String。它包含字符数组的字符。
		String charString = String.valueOf(new char[]{'I','L','U'});
		System.out.println(charString);
	}
}
