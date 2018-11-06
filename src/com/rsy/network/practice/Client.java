package com.rsy.network.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 8000);
			System.out.println("已经成功连接到服务器");
			
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			
			BufferedInputStream bi = new BufferedInputStream(is);
			BufferedOutputStream  bo = new BufferedOutputStream(os);
			
			bo.write("我是一名终端用户".getBytes("UTF-8"));
			bo.flush();
			
			byte[] buffer = new byte[1024];
			int length = bi.read(buffer);
			while(length != -1){
				String content = new String(buffer, 0, length, "UTF-8");
				System.out.println("客户端接收到的消息为:" + content);
			}
			
			bo.close();
			bi.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
