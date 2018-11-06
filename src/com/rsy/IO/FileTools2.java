package com.rsy.IO;

import java.io.File;

public class FileTools2 {
	/**
	 * 查找指定文件夹下的所有子文件（包括文件夹和文件）
	 * @param path
	 */
//	public static void findChildFiles(String path){
//		//通过path构建一个File对象；
//		File file = new File(path);
//		//判断file对象是否是一个文件夹，如果是文件，结束当前方法
//		if(!file.isDirectory()) {
//			System.out.println("当前目录" + path + "指向的不是一个文件夹，结束方法！");
//		}
//		//通过file.list()获取所有这个文件目录下的字文件名称的String[]
//		String[] fileNames = file.list();
//		//通过迭代将所有子文件的名称打印在控制台
//		for(String filename : fileNames){
//			System.out.println(filename);
//		}
//	}
	/**
	 * 查找指定文件夹下的所有子文件（包括文件夹和文件，打印在控制台是标注是文件夹还是文件）
	 * @param path
	 */
	public static void findChildFiles(String path){
		//通过path构建一个File对象；
		File file = new File(path);
		//判断file对象是否是一个文件夹，如果是文件，结束当前方法
		if(!file.isDirectory()) {
			System.out.println("当前目录" + path + "指向的不是一个文件夹，结束方法！");
			return;
		}
		//通过file.listFiles()获取所有这个文件目录下的字文件名称的String[]
		File[] files = file.listFiles();
		//通过迭代将所有子文件的名称打印在控制台
		for(File f : files){
			if (f.isDirectory()){
				System.out.println("文件夹:" + f.getName()); //getName()得到子文件的字符串名字
			}else {
				System.out.println("文件:" + f.getName());
			}
		}
	}
	
	//查询出某个文件夹下的所有的子文件，包括子文件下的所有文件名称
	public static void findAllChildFiles(String path, int level) {
		//通过path创建一个File对象
		File file = new File(path);
		//判断当前的file是否是文件，如果是文件，结束方法
		if(file.isFile()) {
			return;
		}
		//获取到当前file的所有子文件数组(file.listFile())
		File[] files = file.listFiles();
		//迭代所有的子文件
		for(File f:files) {
			//如果子文件是一个文件，那么打印缩进
			for(int i = 0;i < level; i ++){
				System.out.print("\t");
			}
			//并打印文件名称
			System.out.println(f.getName());
			//如果子文件是文件夹，那么递归调用findAllChildFiles来打印子文件夹下的所有文件
			if(f.isDirectory()) {
				//path = f.getAbsolutePath() ;得到当前文件的目录地址
				//level = level + 1;
				FileTools2.findAllChildFiles(f.getAbsolutePath(), level + 1);
			}
		}
	}
}
