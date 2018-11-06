package com.rsy.homework.IO.EXAM_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	/**
	 *  将指定路径下的文件中的数据读取出来并赋值给变量str
	 * @param path
	 * @throws IOException
	 */
	public static void readFile(String path) throws  IOException{
		File fromFile = new File(path);
		if (fromFile.exists()) {
			try(FileInputStream fi = new FileInputStream(fromFile);){
				byte[] buffer = new byte[1024];
				int length = 0;
				String str = null;
				while( (length = fi.read(buffer)) != -1){
					str = new String(buffer,0, length,"GBK");
					System.out.println("str = " + str);
				}
			}
		}
	}
	/**
	 *  检测某个字符串是否包含指定的字符串a，若包含 则将a替换为b
	 * @param s1
	 * @param s2
	 * @param s3
	 */
	public static void existStr(String s1 ,String s2 ,String s3){
		boolean containsOrNot = s1.contains(s2);
		if (containsOrNot) {
//			s1.replace(oldChar, newChar)
			if (s2.length() == s3.length()) {
				char[] char1 = s1.toCharArray();
				char[] char2 = s2.toCharArray();
				char[] char3 = s3.toCharArray();
				int i = s1.indexOf(char2[0]);
				for (int j = i; j < (i + char2.length); j++) {
					char1[j] = char3[j-i];
				}
				StringBuffer str_new = new StringBuffer();
				for (int j = 0; j < char1.length; j++) {
					  str_new.append(char1[j]);					
				}
				System.out.print(str_new);
			}
		}
	}
	/**
	 *  可以将任意文件写入到本地任意路径下。
	 * @param path
	 * @param content
	 * @throws IOException
	 */
	public static void writeFile(String path, String content,boolean append) throws IOException {
		File toFile = new File(path);
		
		if (!toFile.exists()) {
			try {
				toFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try( FileWriter fw = new FileWriter(toFile,true);
				BufferedWriter bw = new BufferedWriter(fw);
				){
			bw.write(content);
			bw.flush();
		}
	}
	public static void main(String[] args) throws IOException {
		Test.readFile("C:\\Users\\30610\\Desktop\\HomeWork\\test.txt");
		Test.existStr("中国你好，abc123", "abc","ABC");
		Test.writeFile("C:\\Users\\30610\\Desktop\\HomeWork\\test1.txt", "美国你好，abc123",true);
	}
}
