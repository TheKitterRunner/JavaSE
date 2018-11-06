package com.rsy.homework.normalClass;
/**
 * 7.编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转。例如: “To be or not to be"，将变成"oT eb ro ton ot eb"
 * @author Nico
 * @createDate 2018年8月10日 下午2:18:35
 */
public class Test7 {
	public static void main(String[] args) {
		String s = "To be or not to be";
		// 转换成字符串数组
		String[] stringArr = s.split(" ");
		for (int i = 0; i < stringArr.length; i++) {
			// 把字符串数组的每个元素转换为StringBuffer类型
			StringBuffer sb = new StringBuffer(stringArr[i]);
//			sb.reverse();
			// 再将每个元素逆序输出
			if (i < stringArr.length - 1) {
				System.out.print(sb.reverse() + " ");
			}else{
				System.out.print(sb.reverse());
			}
		}
	}
}
