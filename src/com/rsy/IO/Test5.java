package com.rsy.IO;

import java.io.IOException;

public class Test5 {
	public static void main(String []args) throws IOException {
		//FileTools5.bufferedStreamInput("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\Note.txt");
		//FileTools5.bufferedStreamOutput("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\bufferedoutput.txt", "课堂笔记\n\tbufferedoutput",true);
//		FileTools5.bufferedStreamCopy("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\Luffien.jpg",
//										"E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\Luffien-copy.jpg");
//		FileTools5.readFileReader("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\Note.txt");
		FileTools5.writeFileWriter("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\writer.txt", "字符流输入输出比之前的字节流要简单的多\r\t", true);
	}
}
