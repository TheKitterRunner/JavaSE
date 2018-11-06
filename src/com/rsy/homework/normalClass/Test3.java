package com.rsy.homework.normalClass;
/**
 * 3.给定字符串数组：String[] strings={“string”,”starting”,”strong”,”street”, “stir”,”studeng”,”soft”,”sting”}
 *               要求：分别统计以st开头的字符串有多少个，以ng结尾的字符串有多少个？
 * @author Nico
 * @createDate 2018年8月9日 下午7:09:04
 */
public class Test3 {
	public static void main(String[] args) {
		int count1 = 0 ;  // 统计以st开头的字符串数量
		int count2 = 0 ;  // 统计以ng结尾的字符串数量
		String[] strings={"string","starting","strong","street", "stir","studeng","soft","sting"};
		for( int i = 0; i < strings.length; i ++){
			if(strings[i].startsWith("st")){
				count1 ++ ;
			}
			if(strings[i].endsWith("ng")){
				count2 ++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
