package com.rsy.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTools5 {
	
	private FileTools5(){
		
	}
	/**
	 * 使用BufferedInputStream 读取文件
	 * @param path
	 * @throws IOException 
	 */
//	public static void bufferedStreamInput(String path) throws IOException {
//		//通过path 构建File类对象
//		File file = new File(path);
//		//判断文件是否存在，如果不存在，结束！
//		if(!file.exists()) {
//			System.out.println("文件不存在，结束");
//			return;
//		}
//		//判断文件是否是文件夹，如果是，结束！
//		if(file.isDirectory()) {
//			System.out.println("文件夹不可以读取 !");
//			return;
//		}
//		//使用try with resource自动关闭资源
//		try(FileInputStream fi = new FileInputStream(file) ;		//通过File 对象构建FileInputStream 对象
//				BufferedInputStream bi = new BufferedInputStream(fi);){//将FileInputStream装饰成BufferedInputStream 对象
//			//通过BufferedInputStream 来读取文件
//			byte[] b = new byte[1024];
//			int len = bi.read(b);
//			while( len != -1){
//				String content = new String(b, 0, len, "UTF-8");  // 将从文件中读取的字节构建成字符串
//				System.out.println(content);  //打印到控制台
//				len = bi.read(b);
//			}
//		}		
//	}
	/**
	 * 通过BufferedOutputStream 写文件
	 * @param path
	 * @param content
	 * @param append    //是否追加文本
	 * @throws IOException
	 */
	public static void bufferedStreamOutput(String path, String content, boolean append) throws IOException {
		//通过 path构建 File的类对象
		File file = new File(path);
		//判断文件是否存在，不存在，则创建
		if(!file.exists()){
			file.createNewFile();
		}
		//如果文件存在，判断是否是文件夹，如果是，则结束
		if(file.isDirectory()){
			System.out.println(path + "目录是文件夹，不能写入文本文档，结束！");
			return;
		}	
		//使用try with resource语法糖， 自动关闭资源
		try(FileOutputStream fo = new FileOutputStream(file,append);//通过File对象创建FileOutputStream 的类对象
				BufferedOutputStream bo = new BufferedOutputStream(fo);) {//将FileOutputStream  升级为 BufferedOutputStream
			bo.write(content.getBytes("UTF-8"));
			//刷新缓存
			bo.flush();
			
		}	
	}
	/**
	 *  利用Buffered字节流Copy文件
	 * @param path
	 * @param content
	 * @throws IOException 
	 */
	public static void bufferedStreamCopy(String from, String to) throws IOException {
		// 利用from 创建fromFile
		File fromFile = new File(from);
		// 判断fromFile 是否存在，并且是否是一个文件 ；如果不存在，或者不是一个文件，就结束！
		if(!fromFile.exists() || fromFile.isDirectory()) {	
				System.out.println("目标文件是文件夹，不能执行Copy操作，结束 ！!");
				return;
		}
		// 通过 to 构建toFile 
		File toFile = new File(to);
		// 判断 toFile 是否存在，不存在，则创建
		if(!toFile.exists()) {
			toFile.createNewFile();
		}
		// 判断toFile是否是文件夹，如果是文件夹，则结束
		if(toFile.isDirectory()) {
			System.out.println("结束，ending...");
		}
		// 使用try with resource 语法糖，自动关闭资源文件		
		try(FileInputStream fi = new FileInputStream(fromFile); // 构建fromFile 的输入流和缓冲输入流
				BufferedInputStream bi = new BufferedInputStream(fi); // 将文件输入流修饰成为缓冲输入流
				FileOutputStream fo = new FileOutputStream(toFile); // 构建toFile 的输出流和缓冲输出流
				BufferedOutputStream bo = new BufferedOutputStream(fo); // 将文件输出流修饰成为缓冲输出流
				) {
			// 进行文件的Copy操作
			byte[] b =new byte[1024];
			int len = bi.read(b);
			while( len != -1){
				// 将读取到的内容写入到输出流
				bo.write(b, 0, len);
				len = bi.read(b);
			}	
			//刷新缓存
			bo.flush();		
		}
	}
	/**
	 * 通过字符输入流读取文件内容
	 * @param path
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void readFileReader(String path) throws FileNotFoundException, IOException {
		// 通过path 构建File的 对象
		File file = new File(path);
		// 判断文件是否存在，如果不存在，则结束
		if(!file.exists()){
			System.out.println("目标文件不存在，结束 ！");
			return;
		}
		// 判断文件是否是文件夹，如果是文件夹，则结束
		if(file.isDirectory()){
			System.out.println("目标文件是文件夹，不能读取，结束 ！");
			return;
		}
		// 使用try with resource语法糖，自动结束资源 JDK 1.8加入到新特性
		try(FileReader fr = new FileReader(file); // 通过file 构建FileReader 的对象
				BufferedReader br = new BufferedReader(fr); // 将FileReader 装饰成为 BufferedReader
				){
			// 开始读取文件	
			String line = br.readLine();
			while( line != null){
				System.out.println(line);
				line = br.readLine();
			}
		}		
	}
	/**
	 * 用字符输出流写文件
	 * @param path
	 * @param content
	 * @param append    是否追加
	 * @throws IOException
	 */
	public static void writeFileWriter(String path, String content, boolean append) throws IOException{
		File file = new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
		if(file.isDirectory()){
			System.out.println("目标文件是文件夹，不能写入，结束 ！");
			return;
		}
		try(FileWriter fw = new FileWriter(file,append);
				BufferedWriter bw = new BufferedWriter(fw);
				){
			bw.write(content);
			bw.flush();
		}
	}
}








