package com.rsy.reflect;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 
 * @author Nico
 * @createDate 2018年7月30日 上午11:36:09
 */
public class Test {
	public static void main(String []args) throws IOException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException{
		Class<Person> clazz = Person.class;
		//返回puublic可访问的方法
//		Method[] methods = clazz.getMethods();
		//  返回所有方法，包括private的
//		Method[] methods = clazz.getDeclaredMethods();
//		for(Method m:methods){
//			System.out.println(m.getName());
//		}
		//通过方法名称获取到class类对象的方法
//		Method method = clazz.getMethod("play");
//		System.out.println(method.getName());
//		1Method method2 = clazz.getMethod("play");  // 调用class对象没有形参的方法
		Method method = clazz.getMethod("eat",int.class,String.class);
//		System.out.println(method.getName());
//		//调用方法（方法调用之前，必须要实例化对象）
		Person p = clazz.newInstance();  //实例化对象（无参数构造器）
		method.invoke(p,15, "香蕉");    //反射调用
//		System.out.println("===============调用私有的方法================");
//		
//		Method sleepMethod = clazz.getDeclaredMethod("sleep");
//		//调用私有方法之前必须将Method设置为可以访问
//		sleepMethod.setAccessible(true);
//		sleepMethod.invoke(p);   //调用私有方法
//		
	}
}
