package com.rsy.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTools3 {
	/**
	 * 通过字节输入流读取文件
	 * @param path
	 * @throws IOException 
	 */
	public static void inputStreamReadFile(String path) throws IOException {
		//通过path构建一个file对象
		File file = new File(path);
		//判断file是否存在，不存在，则结束
		if(!file.exists()) {
			System.out.println("文件不存在！不可以读取！");
			return;
		}
		//判断file是否是一个文件，如果不是文件，结束
		if(!file.isFile()) {
			System.out.println( path + "不是一个文件，不可以读取！ ");
			return;
		}
		//通过file构建一个InputStream
		InputStream input = null;
		try{
			//通过InputStream 读取文件内容并打印在控制台
			input = new FileInputStream(file);
			//byte[] b = new byte[4096];  //定义一个容器，用于接受文件中的二进制数据，每次最多可以接收4096B 的数据
			byte[] b = new byte[1024];  //定义一个容器，用于接受文件中的二进制数据，每次最多可以接收1024B 的数据
			// 读取数据
			int len = input.read(b); //从input输入流中读取二进制数据放到byte[] b 中去，并且返回读取的字节数
			//System.out.println("一共读取了：" + len + "个字节数");  //打印输出文件的总长度
			while(len != -1) {
				// 将byte[] b转换成字符串
				String string = new String(b,0,len);  //从文件的第一个字节读取到文件长度对应的字节
				//打印文件内容
				System.out.println(string);
				//继续读取文件
				len = input.read(b); //之前的b在38行读取过一次内容，这里再次读取会将之前的内容覆盖，并且获得len
			}
		}finally {
			if(input != null) {
				//关闭输入流对象
				input.close();
			}
		}
	}
	/**
	 * 通过字节输出流写入文件内容
	 * @param path
	 * @param content
	 * @throws IOException 
	 */
	public static void outputWriteFile(String path , String string) throws IOException {
		//通过path 构建一个File对象
		File file = new File(path);
		//判断File是否存在，如果不存在，则创建文件
		if( !file.exists()) {
			boolean flag = file.createNewFile();
			if(!flag){
				System.out.println("文件不存在，并且创建失败");
				return;
			}
		}
		//如果File是文件夹，则结束
		if(file.isDirectory()) {
			System.out.println(path + "是文件夹，不能写入内容!");
			return;
		}
		//通过File 对象构建一个输出流对象（FileOutputStream）
		OutputStream output = null;
		try{
			output = new FileOutputStream(file,true);
			//将content 转换成byte 数组
			byte[] b = string.getBytes("UTF-8");
			//将转换好的数组，写入到文件中去
			output.write(b);
		}finally{  //不管是否会出现异常，都会执行
			if(output != null) {
			//关闭输出流对象之前，需要刷新一下，保证内存里的数据全部写入到文件中去 
			output.flush();
			//关闭输入流对象
			output.close();
			}
		}
	}
}
