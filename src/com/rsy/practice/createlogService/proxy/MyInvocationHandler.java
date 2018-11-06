package com.rsy.practice.createlogService.proxy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MyInvocationHandler<T> implements InvocationHandler{
	
	private T instance;
	
	public MyInvocationHandler( T instance) {
		this.instance = instance;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始代理");
		String date_string = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date());
		String method_name = method.getName();
		Class<?>[] parameterType = method.getParameterTypes();
		String s = "" ;
		if (args == null) {
			s += "传入的参数为: " + "No parameter been added to mathod !" ;
		}else{
			for (int i = 0; i < args.length; i++) {
				s += Arrays.toString(parameterType) + ",";
			}
			s = "传入的参数为:  " + s.substring(0, s.length() - 1);
		}
		String finalString = date_string + "调用的方法为： " + method_name + ",  " + s ; 
		
		File file  = new File("C:\\Users\\30610\\Desktop\\Test\\WorkLog2.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write(finalString);
		bw.close();
		
		Object result = method.invoke(instance, args);
		System.out.println("代理活动结束");
		return result;
	}

}
