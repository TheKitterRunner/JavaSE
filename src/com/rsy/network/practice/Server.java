package com.rsy.network.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端,用来接收客户端的请求,并处理相关的信息
 * @author Nico
 * @Create 2018年8月27日 下午3:52:52
 */
public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("等待客户端的连接请求");
			Socket socket = serverSocket.accept();
			
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
					
			BufferedInputStream bi = new BufferedInputStream(is);
			BufferedOutputStream bo = new BufferedOutputStream(os);
			
			byte[] buffer = new byte[1024];
			int length = bi.read(buffer);
			while(length != -1){
				String content = new String(buffer, 0, length, "UTF-8");
				System.out.println("服务器端接收到的信息为:" + content);
				bo.write("你已经成功连接到服务器".getBytes("UTF-8"));
				bo.flush();
			}
			
			os.close();
			is.close();
			serverSocket.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
