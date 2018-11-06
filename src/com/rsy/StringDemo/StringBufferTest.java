package com.rsy.StringDemo;

public class StringBufferTest {
	public static void main(String []args){
		StringBuffer s1 = new StringBuffer("我炒鸡喜欢学习");
		s1.append("JavaSE");
		s1.append("  和Oracle");
		System.out.println(s1.toString());
		
		s1.delete(1,4);
		System.out.println(s1.toString());

		//定一个爱好数组，将爱好拼接成一个字符串 （爱好之间用逗号隔开）
		String[] habits = new String[]{"篮球","足球","乒乓","棒球","台球"};
		StringBuffer hab = new StringBuffer();
		for(String h : habits){
			hab.append(h);
			hab.append(", ");
		}
		//  去掉最后的“, ”
		hab.delete(hab.length()-2, hab.length());
		System.out.println(hab.toString());
	}
}




