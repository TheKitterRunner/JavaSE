package com.rsy.homework.IO.EXAM_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 3.写一个程序，记录程序在运行时出现过的错误，保存成错误日志！。如：
	•在输入Int类型的时候输错，把这个记录写入到文件中。
	•在String 类型 转换 int类型的时候如果出错，把错误的记录写入到文件中。
	•格式如下：
	•err:2017年3月30日 15:26:33 字符串转换Int失败 不能把 abc 转成 int 类型。  
 * @author 3061
 *
 */
public class Test2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
			String date1 = sdf.format(date);
			String s = null;
			String s1 = null;
			try{
				int intNumber = Integer.parseInt(str);
				System.out.println(intNumber);
				scanner.close();
			}catch(Exception e){
				s = "erro :" + date1 + "  字符串转换Int失败 不能把  “" + str + "”转成 int 类型。";
				System.out.println(s);
				Test2.writeFile("C:\\Users\\30610\\Desktop\\HomeWork\\config.txt", s1,true);
			}
		}
		
		public static void writeFile(String path, String string, boolean append){
			File file = new File(path);
			if (file.isDirectory()) {
				System.out.println("指定路径是文件夹，不能写入文本文件！");
			}
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try(
					FileWriter fw = new FileWriter(file,append);
					BufferedWriter bw = new BufferedWriter(fw);
					){
				bw.write(string + "\n");
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
