package com.rsy.reflect;

import java.lang.reflect.Field;

public class TestField {
	public static void main(String []args) throws Exception{
		Class<Person> clazz = Person.class;
		//获取public修饰的方法
		Field[] fields = clazz.getFields();
//		for(Field field:fields){
//			System.out.println(field);
//			System.out.println("属性名称：" + field.getName() + " 类型：" + field.getType() + 
//					" 权限修饰符：" + field.getModifiers());
//		}
		//获取全部的属性
		fields = clazz.getDeclaredFields();
		for(Field field:fields){   // 类型 ：public返回1 ， private返回2， protected返回4 ， 默认 类型返回0
			System.out.println("属性名称：" + field.getName() + " 类型：" + field.getType() + 
					" 权限修饰符：" + field.getModifiers());
		}
		
		//获取指定的属性
		Field sexField = clazz.getDeclaredField("sex");
		//使私有的属性可以被访问
		sexField.setAccessible(true);
		Person p = clazz.newInstance();
		sexField.set(p, 1);
		System.out.println(p);
	
	}
}
