package com.rsy.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  用来处理代理方法
 * @author Nico
 * @createDate 2018年8月7日 下午8:58:37
 */
public class InstanceInvocationHandle implements InvocationHandler{
	/**
	 *  要被代理的原生对象
	 */
	private Instance1 instance;
	/**
	 *   被代理的方法执行的时候调用invoke
	 * @param proxy : 被代理的对象 (暂时忽略)
	 * @param method ： 正在执行的方法对象
	 * @param args ： 正在执行的方法实参
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("请开始代理应该完成的事情");
		Object result = method.invoke(instance, args);
		System.out.println("请结束代理要完成的事情");
		return "代理部分返回的结果是:" + result;
	} 

}
