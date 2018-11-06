package com.rsy.practice.createlog.proxy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
/**
 *  要将代理执行的方法的信息写入日志里面
 * @author Nico
 * @CreateDate 2018年8月21日 下午1:27:32
 */
public class MyInnocationHandler<T> implements InvocationHandler{
	
	private T instance;
	
	public MyInnocationHandler(T instance) {
		this.instance = instance;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始代理....");
		// 开始将文件的操作写入日志
		// 创建时间类对象，返回操作的时间
		String operatorDate  = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(new Date()); 
		// 获取要调用的方法
		String method_name = method.getName();
		// 获取方法里面的参数
		Class<?>[] parameterClasses = method.getParameterTypes();
//		System.out.println(Arrays.toString(parameterClasses));
		String s = "";
		if (args == null) {
			s = "传入的参数为:  " + "No parameters be add to Method !";
		}else {
			for( int i = 0; i <args.length; i ++){
				s += Arrays.toString(parameterClasses) + ",";
			}
			s = "传入的参数为:  " + s.substring(0, s.length() - 1);
		}
		String totalString = operatorDate + "  调用的方法为 ：  " + method_name + ",   " +  s;
		// 将日志内容写入到工作日志中
		File file  = new File("C:\\Users\\30610\\Desktop\\Test\\WorkLog.txt");
		FileWriter fw = new FileWriter(file,true);   // 设置true使得文本可以续写
		BufferedWriter bw = new BufferedWriter(fw);
		// 每次都新启一行写
		bw.newLine();
		bw.write(totalString);
		bw.close();
		
		Object result = method.invoke(instance, args);
		System.out.println("代理结束");
		return  result;
	}

}
