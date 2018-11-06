package com.rsy.homework.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 定义Student 类：包含：姓名和年龄等属性，有参和无参构造方法，输出所有信息的方法
	1.使用多种方法生成一个Student类的Class对象
	2.使用Class类获取Student类的结构信息并输出
	3.通过有参(无参)构造方法动态创建Student类的对象
	4.使用反射修改和查询Student类的姓名属性
	5.使用反射动态执行Student类输出信息的方法
 * @author Nico
 * @CreateDate 2018年8月20日 下午6:54:22
 */
public class TestStudent {
	public static void main(String[] args) throws ClassNotFoundException, Exception{
		// 1.两种方法创建Student 的Class类对象
		Class<Student> clazz1 = Student.class;
//		Class<Student> clazz2 = (Class<Student>) Class.forName("com.rsy.homework.reflect.Student");
		System.out.println(clazz1);
//		System.out.println(clazz2);
		System.out.println("===============获取所有的属性===============================");
		// 2.使用Class类获取Student类的结构信息并输出
		// A.获取所有的属性
		Field[] fields = clazz1.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println("================获取所有的方法===============================");
		// B.获取所有的方法
		Method[] methods = clazz1.getDeclaredMethods();
		for( Method m : methods){
			System.out.println(m);
			System.out.println(Arrays.toString(m.getParameterTypes()));// 获取传入参数的数据类型
		}
		System.out.println("==================获取所有的构造函数=============================");
		// C.获取所有的构造函数
		//获取Person所有声明的构造器
		Constructor<?>[] constructors = clazz1.getDeclaredConstructors();
		for (@SuppressWarnings("rawtypes") Constructor c : constructors) {
			System.out.println(c);
		}
		System.out.println("===========通过有参(无参)构造方法动态创建Student类的对象===============");

		// 3.通过有参(无参)构造方法动态创建Student类的对象
			Student s1 = clazz1.getDeclaredConstructor(String.class,int.class).newInstance("Nico1" , 18);
			Student s2 = clazz1.newInstance();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println("===============使用反射修改和查询Student类的姓名属性===============");
		// 4.使用反射修改和查询Student类的姓名属性
		try {
			// 通过Class类对象获取name属性
			Field nameField = clazz1.getDeclaredField("name");
			// 设置访问属性为可以访问
			nameField.setAccessible(true);
			// 查询name属性的值
			String name1 = (String) nameField.get(s1);
			System.out.println(name1);
			nameField.set(s1, "Nico");
			// 获取修改之后的s1的名字
			String name2 = (String) nameField.get(s1);
			System.out.println(name2);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		// 5.使用反射动态执行Student类输出信息的方法
		
	}
}
