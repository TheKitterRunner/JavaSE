package com.rsy.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 *  源文件保留的自定义注解
*@author Nico
*2018年7月27日上午10:37:34
*/
@Retention(RetentionPolicy.SOURCE)  //当前注解只在Java源文件中有效，通过编译后的class字节码文件就没有了
@Target(value = {ElementType.FIELD,ElementType.METHOD,ElementType.TYPE}) //注解可以放置在成员变量和方法上
public @interface AnnotationA {
	//定义一个注解的成员变量，数据类型：String ; 变量名 :value ; 初始值：“AAA”
	String value() default "AAA";
}
