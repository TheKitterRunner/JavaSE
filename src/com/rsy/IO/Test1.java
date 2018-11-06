package com.rsy.IO;

import java.io.IOException;

public class Test1 {
	public static void main(String []args) throws IOException {
		FileTools.createDir("E:\\Spring data\\JavaSETest\\src\\com\\rsy\\IO\\practice");
		
		FileTools.createFile("E:\\Spring data\\JavaSETest\\src\\com\\rsy\\IO\\practice.txt");
	
	}
} 
