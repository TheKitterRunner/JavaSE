package com.rsy.IO.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void streamCopy(String fromPath, String toPath ){
		File fromFile  = new File(fromPath);
		File toFile = new File(toPath);
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			if(!toFile.exists()) {
				toFile.createNewFile();
			} 
			inputStream = new FileInputStream(fromFile);
			outputStream = new FileOutputStream(toFile);
			byte[] buffer = new byte[1024];
			int length = inputStream.read(buffer);
			while( length != -1){
				outputStream.write(buffer, 0, length);
				length = inputStream.read(buffer);
			}
						
		} catch (IOException e) {
					e.printStackTrace();
		}finally {
			try{
				if(inputStream != null){
					inputStream.close();
				}
				if(outputStream != null){
					//将输出流刷新
					outputStream.flush();
					//关闭资源
					outputStream.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
