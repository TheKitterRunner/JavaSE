package com.rsy.homework.normalClass;
/**
 * 5.如下字符串:01#张三#2002#李四#3003#王五#40。。。。。。，解析每个人分数多少。输出样式如下：
	01 张三 20
	02 李四 30
	03 王五 40
 * @author Nico
 * @createDate 2018年8月10日 下午1:02:48
 */
public class Test5 {
	
	public static void main(String[] args) {
		String str = "01#张三#2002#李四#3003#王五#40";
		// 先将#用“”空取代
		String s = str.replaceAll("#", "");
		// 再见新得的字符串转换成字符数组
		char[] ch = s.toCharArray();
		// 遍历数组，每6个换行
		for(int i = 0; i < ch.length;  i ++ ){
			if (i >= 0 && i <= 5) {
				System.out.print(ch[i]);
				if (i == 5){
					System.out.println();
				}
			}
			if (i >= 6 && i <= 11){
				System.out.print(ch[i]);
				if (i == 11){
					System.out.println();
				}
			}
			if (i >= 12 && i <= 17){
				System.out.print(ch[i]);
				if (i == 17){
					System.out.println();
				}
			}
		}
	}
}
