package com.rsy.homework.loop;
/**
 *   逆序输出字符串
 * @author Nico
 * @createDate 2018年7月30日 上午10:25:37
 */
public class TurnString {
	//将一个字符串逆序输出
	public static void main(String []args){
		String string = new String("不成功,便成仁");
		//   方法一：将字符串转换成字符数组，再倒序输出其中的元素
//		char[] arr = string.toCharArray();
//		for(int i = arr.length-1 ; i >= 0 ; i --){
//			System.out.print(arr[i]);
//		}
		
		//   方法二：利用StringBuffer 的reverse()方法实现
		StringBuffer sb = new StringBuffer(string);
		System.out.println(sb.reverse());
	}
}
