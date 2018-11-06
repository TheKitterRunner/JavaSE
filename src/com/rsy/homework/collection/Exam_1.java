package com.rsy.homework.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.统计一个指定的字符串中每个字符出现的个数。把结果存入到一个Map中。(key 为某个字符，value为这个字符出现的次数)。
 * @author Nico
 * @createDate 2018年8月10日 下午7:37:28
 */
public class Exam_1 {
	public static void main(String[] args) {
		// 创建一个新的字符串：学习java是一个漫长的过程
		String str = "learning java is a long process";
		// 创建一个Map的对象，使用泛型
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// 去掉中间的空格
		String newStr = str.replace(" ", "");
		
//		System.out.println(newStr);
		// 将newStr转换成字符数组
		char[] arr= newStr.toCharArray();
		for (char ch : arr) {
			// 是否包含指定的键，如果存在，则用现在新的value覆盖旧的value值
            if (map.containsKey(ch)) {
                Integer old = map.get(ch);
                // 把新的键值对的值++后再添加到map中
                map.put(ch, old + 1);
            } else {
            	// 如果没有这个键值对，直接添加进去
            	map.put(ch,1);
            }
        }
        System.out.println(map);
	}
}
