package com.rsy.IO.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferCopy {
	/**
	 *  利用BUffered 字节流Copy文件
	 * @param fromPath
	 * @param toPath
	 * @throws IOException
	 */
	public static void bufferedByteStreamCopy(String fromPath, String toPath) throws IOException{
		// 创建fromPath和toPath 分别构建要copy和要paste的文件对象
		File fromFile = new File(fromPath);
		File toFile = new File(toPath);
		//  如果源文件不存在或者是文件夹，GG
		if (!fromFile.exists() || fromFile.isDirectory()) {
			System.out.println("找复制的是文件夹或者不存在");
			return;
		}
		// try with resource 语法糖，自动关闭文件资源
		try(    InputStream in  = new FileInputStream(fromFile);
				OutputStream out = new FileOutputStream(toFile);
				BufferedInputStream bi = new BufferedInputStream(in);
				BufferedOutputStream bo = new BufferedOutputStream(out);
				) {
			if (toFile.exists()) {
				toFile.delete();
			}
			toFile.createNewFile();
			
			byte[] buffer = new byte[1024];
			int length = bi.read(buffer);
			while( length != -1){
				bo.write(buffer, 0, length);
				length = bi.read(buffer);
			}
			bo.flush();
		} 
	}
	
	public static void bufferedCharStreamCopy(String fromPath, String toPath) throws IOException{
		File fromFile = new File(fromPath);
		File toFile = new File(toPath);
		
		if (!fromFile.exists() || fromFile.isDirectory()) {
			System.out.println("选择有误");
			return;
		}
		if (toFile.isDirectory()) {
			System.out.println("GG");
		}
		if (toFile.exists()) {
			toFile.delete();
		}
		toFile.createNewFile();
		try( FileReader fr = new FileReader(fromFile);
				FileWriter fw = new FileWriter(toFile);
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				){
			char[] charBuffer = new char[1024];
			int length = br.read(charBuffer);
			while( length != -1){
				bw.write(charBuffer);
				bw.flush();
				
				length = br.read(charBuffer);
			}
		}
	}
}
