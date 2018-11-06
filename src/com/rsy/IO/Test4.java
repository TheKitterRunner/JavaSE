package com.rsy.IO;

import com.rsy.IO.practice.FileCopy;

public class Test4 {
	public static void main(String []args) {
//		FileTools4.streamCopy("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\基础语法.txt",
//							"E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\Note2.txt");
		FileCopy.streamCopy("C:\\Users\\30610\\Desktop\\Test\\基础语法.txt", "C:\\Users\\30610\\Desktop\\Test\\基础语法2.txt");
	}
}
