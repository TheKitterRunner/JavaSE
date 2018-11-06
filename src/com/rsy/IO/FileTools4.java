package com.rsy.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTools4 {
	/**
	 * 文件的复制
	 * @param from  copy的文件
	 * @param to  paste 的文件名
	 * @throws IOException 
	 */
	public static void streamCopy(String from , String to) {
		//通过from构建 要copy的文件 fromFile
		File fromFile = new File(from);
		//通过to构建要paste的文件 toFile
		File toFile = new File(to);
		//fromFile如果是一个文件夹或者不存在，结束
		if(fromFile.isDirectory() || !fromFile.exists()) {
			System.out.println("要复制的文件不存在或者目标文件是文件夹");
			return;
		}
		//定义输入输出流
		InputStream input = null;
		OutputStream output = null;
		//如果toFile 文件存在，则删除
		try{
			if(toFile.exists()) {
				toFile.delete();
			}
			//新建toFile 文件
			toFile.createNewFile();
			//获取fromFile 的输入流
			input = new FileInputStream(fromFile); 
			//获取toFile 的输出流
			output = new FileOutputStream(toFile); 
			//循环读取fromFile的输入流并将每次读取的byte数组写入到toFile的输出流
			byte[] b = new byte[1024];
			int len = input.read(b);
			while(len != -1) {
				//将填充完成的byte数组写入到输出流
				output.write(b, 0, len);
				//继续从输入流读取数据
				len = input.read(b);
			}
		} catch (IOException e){
				e.printStackTrace();  //将异常打印在控制台
		}finally {
			try{
				if(input != null){
					input.close();
				}
				if(output != null){
					//将输出流刷新
					output.flush();
					//关闭资源
					output.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}	 
	}
}
