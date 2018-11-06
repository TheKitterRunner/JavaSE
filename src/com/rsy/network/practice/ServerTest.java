package com.rsy.network.practice;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *	谢老师的方法
 * @author Nico
 * @Create 2018年8月28日 上午8:57:28
 */
public class ServerTest {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket = serverSocket.accept();
			
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.write("你好,客户端,我是服务端");

			pw.close();
			os.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
