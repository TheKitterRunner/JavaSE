package com.rsy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 *  处理代理方法的  执行
 * @author Nico
 * @createDate 2018年7月31日 下午2:05:20
 */
public class InstanceInvocationHandler<T> implements InvocationHandler {

	/**
	 *  要被代理的原生对象 	
	 */
//	private Instance instance;

//	public InstanceInvocationHandler( Instance instance) {
//		this.instance = instance;
//	}
	private T instance;
	
	public InstanceInvocationHandler(T instance) {
		this.instance = instance;
	}
	
	/**
	 *   被代理的方法执行的时候调用invoke
	 * @param proxy : 被代理的对象
	 * @param method ： 正在执行的方法对象
	 * @param args ： 正在执行的方法实参
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("做一些代理需要做的事情 start");
		Object result = method.invoke(instance, args);
		System.out.println("做一些代理需要做的事情 end");

		return "代理返回的结果是" + result;
	}

}
