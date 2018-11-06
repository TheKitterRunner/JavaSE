package com.rsy.homework.Thread.Exam_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 将字符串的内容读取到一个字符串中
 * 
 * @author Nico
 * @CreateDate 2018年8月23日 下午7:10:39
 */
public class CreateString {
	
	public void creatString() {
		synchronized(this){
			
			File file = new File("C:\\Users\\30610\\Desktop\\Test\\ThreadTest.txt");
			try {
				// 字节流
				FileReader fr = new FileReader(file);
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(fr);
				
				String finalString = "";
				String content = br.readLine();
				while (content != null) {
					content = br.readLine();
					finalString += content;
				}
				for(int i = 0;i < finalString.length();i ++){
					try {
						Thread.currentThread();
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					String partStr = finalString.substring(i, i + 1);
					System.out.print(partStr);
				}
//				System.out.println(finalString);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
