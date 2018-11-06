package com.rsy.IO.practice;

import java.util.Date;

public class TestFileCopy {
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime();
		long time2 = date.getTime();
		long time3 = time2 - time;
		FileCopy.streamCopy("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\第一阶段 旧版\\集合框架_01.exe",
							"C:\\Users\\30610\\Desktop\\Test\\集合框架_01copy.exe");
		System.out.println(time3);
	}
}
