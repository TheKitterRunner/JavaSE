package com.rsy.homework.normalClass;
/**
 * 用户输入一个字符串 Stringstr=”123dsgfadsgjlafdjhladDWAdlfgjalDSFADSFDASnhsdaf!@$%@#45324rdsf” 
 *    统计字符串大写字母,小写字母,数字，其他字符的个数。
 * @author Nico
 * @createDate 2018年8月9日 下午7:19:36
 */
public class Test4 {
	public static void main(String[] args) {
		String str = "123dsgfadsgjlafdjhladDWAdlfgjalDSFADSFDASnhsdaf!@$%@#45324rdsf";
		
		int count1 = 0;  // 统计大写字母的数量
		int count2 = 0;  // 统计小写字母的数量
		int count3 = 0;  // 统计数字的数量
		int count4 = 0;  // 统计其他字符的数量
		
		// ASCII 大写65-90； 小写97-122； 0-9是48-57
		// 字符数组的ASCII的值划分，在分别统计
		char[] ch = str.toCharArray();
		for( int i = 0; i < ch.length; i ++){
			if( ch[i] >= 65 && ch[i] <= 90){
				count1 ++;
			}else if (ch[i] >= 97 && ch[i] <= 122) {
				count2 ++;
			}else if (ch[i] >= 48 && ch[i] <= 57) {
				count3 ++;
			}else{
				count4 ++;
			}
		}
		System.out.println("大写字母的数量为：" + count1);
		System.out.println("小写字母的数量为：" + count2);
		System.out.println("数字的数量的数量为：" + count3);
		System.out.println("其他字符的数量为：" + count4);
		System.out.println(ch.length);
	}
}
