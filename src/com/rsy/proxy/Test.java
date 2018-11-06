package com.rsy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK 的动态代理
 *    23种设计模式之一
 * @author Nico
 * @createDate 2018年7月31日 上午11:44:37
 */
public class Test {
	public static void main(String[] args) {
		//创建一个原生对象（要被代理的）
		Instance instance = new Instance();
		//创建一个InstanceInvocationHandler ,并且将原生对象放进去，告知要代理哪个对象
		InvocationHandler ih = new InstanceInvocationHandler<Instance>(instance);
		//创建一个代理对象
		Object proxy = Proxy.newProxyInstance(Instance.class.getClassLoader(), 
				new Class[]{InterFace1.class,InterFace2.class},ih);
		
		InterFace1 i1 = (InterFace1) proxy;
		String result = i1 .findHouse();
		System.out.println("得到的结果是：" + result);
		
		System.out.println("=========================================");
		
		Instance2 instance2 = new Instance2();
		InvocationHandler ih2 = new InstanceInvocationHandler<Instance2>(instance2);
		Object proxy2 = Proxy.newProxyInstance(Instance2.class.getClassLoader()
				, new Class[]{InterFace1.class,InterFace2.class}, ih2);
		InterFace1 i2 = (InterFace1) proxy2;
		result = i2.findHouse();
		System.out.println("得到的结果是：" + result);
		
	}	
}
