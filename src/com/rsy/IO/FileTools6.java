package com.rsy.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileTools6 {
	/**
	 * 将Java对象存储到文件中
	 * @param path
	 * @param obj
	 * @throws IOException
	 */
	public static void savePerson(String path,Serializable obj) throws IOException{
		File file = new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
		if(file.isDirectory()){
			System.out.println("文件夹中不能写入内容 ！！");
		}
		try(FileOutputStream fo = new FileOutputStream(file);
				ObjectOutputStream oo = new ObjectOutputStream(fo);){
			oo.writeObject(obj);
			oo.flush();
		}
	}
	/**
	 * 从文件中读取	Java对象
	 * @param path
	 * @return
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static Serializable getPerson(String path) throws IOException, ClassNotFoundException {
		Serializable obj = null;
		File file = new File(path);
		if(!file.exists()  ||  file.isDirectory()){
			System.out.println("文件不存在或者是一个文件夹，不能读取");
			return null;
		}
		try(FileInputStream fi = new FileInputStream(file);
				BufferedInputStream bi = new BufferedInputStream(fi);
				ObjectInputStream oi = new ObjectInputStream(bi); ){
			obj =(Serializable) oi.readObject();
		}	
		return obj;		
		}
}
