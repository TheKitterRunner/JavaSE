package com.rsy.homework.collection.Exam_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *   (Map练习)已知某学校的教学课程内容安排如下：
	老师	          课程
	马云	   Java
	马化腾    Android
	雷军	    Jsp
	完成下列要求：
	1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述 课程安排。
	2） 增加了一位新老师Allen    教JDBC
	3） 雷军改为教CoreJava
	4） 遍历Map，使用两种迭代方式输出所有的老师及老师教授的课程。
 * @author Nico
 * @createDate 2018年8月11日 下午12:29:46
 */
public class TestMap {
	public static void main(String[] args) {
		// 创建一个HashMap的实例化对象
		Map<String, String> teacherMap = new HashMap<>();
		// 将初始化的三个元素添加到teacherMapz中
		teacherMap.put("马云", "Java");
		teacherMap.put("马化腾", "Android");
		teacherMap.put("雷军", "Jsp");
		
		// 	(1) 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述 课程安排。
		//  (2) 增加了一位新老师Allen    教JDBC
		teacherMap.put("Allen", "JDBC");
		
		//  (3) 雷军改为教CoreJava
		teacherMap.put("雷军", "CoreJava");  // 如果有相同的键，则后添加的会覆盖前面添加的值（新值覆盖旧值）
		System.out.println(teacherMap);

		//  (4)遍历Map，使用两种迭代方式输出所有的老师及老师教授的课程。
		//方法一：entrySet方法（遍历速度最快）
		Set<Map.Entry<String, String>> entryTeacherSet1 = teacherMap.entrySet(); 
		Iterator<Map.Entry<String, String>> iterator1 = entryTeacherSet1.iterator();
		while(iterator1.hasNext()){
			Map.Entry<String, String>  entry = iterator1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("老师姓名：" + key + " ,老师教授的课程是：" + value );
		}
		
		// 方法二 : keySet方法
		Set<String> entryTeacherSet2 = teacherMap.keySet(); 
		Iterator<String> iterator2 = entryTeacherSet2.iterator();
		while(iterator2.hasNext()){
			String  key  = iterator2.next();
			String value = teacherMap.get(key);
			System.out.println("老师姓名：" + key + " ,老师教授的课程是：" + value );
		}
		
	}
}
