package com.rsy.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String []args) {
		List<String> list = new ArrayList<String>();
		list.add("Chinese");
		list.add("traditional");
		list.add("doctor");
		list.add("believe");
		
//		String delElement = list.remove(3);
//		System.out.println("删除掉的元素是：" + delElement);
//		
//		System.out.println("CLear之前的长度" + list.size());
//		list.clear();
//		System.out.println("CLear之后的长度：" +list.size());
//
//		System.out.println(list.contains("Chinese"));
		
		//forEach
		for (String s:list) {
			System.out.println(s);
		}
		
		//迭代器
//		Iterator<String> ite = list.iterator();
//		while (ite.hasNext()) {  //判断是否有下一个元素
//			//获取下一个元素
//			String s = ite.next();
//			System.out.println(s);
//		}
	}
}
