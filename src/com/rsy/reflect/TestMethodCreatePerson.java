package com.rsy.reflect;

import java.lang.reflect.Method;
/**
*   使用反射构建一个Person对象然后分别设置name,age,sex,并调用toString 方法打印
*@author Nico
*2018年7月25日下午4:41:43
*/
public class TestMethodCreatePerson {
	public static void main(String []args) throws Exception {
		//获取到person的类对象
		Class<Person> clazz = Person.class;
		//通过类对象.newInstance()创建一个实例
		Person p = clazz.newInstance();
		//获取setName方法
		Method method1 = clazz.getMethod("setName",String.class);
		//调用setName方法
		method1.invoke(p, "nico");
		//获取setAge方法
		Method method2 = clazz.getMethod("setAge",int.class);
		//调用setAge方法
		method2.invoke(p, 19);
		//获取setSex方法
		Method method3 = clazz.getMethod("setSex",int.class);
		//调用setSex方法
		method3.invoke(p, 1);
		//获取toString
		Method method4 = clazz.getDeclaredMethod("toString");
		//调用toString
		Object name = method4.invoke(p);
		//打印输出
		System.out.println(name);
	}
}
