package com.rsy.reflect;

import java.lang.annotation.Annotation;

/**
 *  注解
*@author Nico
*2018年7月27日上午9:22:40
*/
public class TestAnnotation {
	public static void main(String []args){
	Class<Person> clazz = Person.class;
	
	//获取当前类的所有注解信息
	Annotation[] annotations = clazz.getAnnotations();
	//System.out.println(annotations.length);
	for(Annotation an  : annotations) {
		System.out.println("注解类型：" + an.annotationType());
		System.out.println("判断当前的注解是否是AnnotationB的注解类型 ： " + (an.annotationType() == AnnotationB.class));
		if (an.annotationType() == AnnotationB.class) {
			//强制向下转型
			AnnotationB an1 = (AnnotationB) an;
			String name = an1.name();
			System.out.println(name);
		}
	}
	}
}
