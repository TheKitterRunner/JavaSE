package com.rsy.IOC.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用在类的成员变量上
 * 		在系统启动成功之后，所有的组件都存储在beans集合当中
 * 		通过AutoWired的value属性在beans中寻找存储好的实例化对象
 * 		再通过反射的方式将实例对象赋值给成员变量
 * 
*@author Nico
*2018年7月28日下午1:57:54
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoWired {
	
	String value();
}
