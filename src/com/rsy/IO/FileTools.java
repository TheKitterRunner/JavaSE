package com.rsy.IO;

import java.io.File;
import java.io.IOException;

public class FileTools {
	//新建文件夹
	public static void createDir(String path){
		File file = new File(path);
		if(file.exists()) {
			//文件存在，停止操作
			System.out.println("文件存在，停止操作");
			return ;
		}
		//若果文件不存在，则可以创建文件夹
		Boolean flag = file.mkdirs();
		if(flag) {
			System.out.println("文件：" + path + "创建成功!");
		}else{
			System.out.println("文件：" + path + "创建失败!!!");

		}
	}
		//新建文件
		public static void createFile(String path) throws IOException{
			File file = new File(path);
			if(file.exists()) {
				//文件存在，停止操作
				System.out.println("文件存在，停止操作");
				return ;
			}
			//若果文件不存在，则可以创建文件
			Boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("文件：" + path + "创建成功!");
			}else{
				System.out.println("文件：" + path + "创建失败!!!");

			}
		}
}
