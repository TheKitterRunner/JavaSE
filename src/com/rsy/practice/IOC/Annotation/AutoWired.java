package com.rsy.practice.IOC.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 	应用在成员变量上,准确的说就是用在属性上  
 * 		在系统成功启动后,所有的自组件都存储在beans中
 		通过AutoWired的value值去beans中找到对应的是实例化对象
 		再通过反射的方式将实例对象赋值给成员变量(也就是属性)
 * @author Nico
 * @CreateDate 2018年8月23日 上午8:39:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoWired {

	String value() default "" ;
}