package com.rsy.IOC.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  但启动应用程序时，扫描某个包路径下的所有class，如果class上增加了这个注释，那么就把这个类实例化并放在一个容器中
 *     使用Map<String,Object>
*@author Nico
*2018年7月28日下午1:33:01
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Componet {
	/**
	 *   value相当于容器的key
	 * @return
	 */
	String value();
}
