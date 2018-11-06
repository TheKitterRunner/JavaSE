package com.rsy.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server : 服务器端
 * @author Nico
 * @createDate 2018年8月8日 下午8:27:57
 */
public class Server {
	public static void main(String[] args) throws Exception {
		// 创建一个服务器ServerSocket (服务器套接字)
		ServerSocket serverSocket = new ServerSocket(8000);
		System.out.println("server 启动成功");
		// 通过ServerSocket监听客户端发送的连接请求
		Socket client = serverSocket.accept();  // accept会阻塞等待客户端的连接,连接成功后会返回一个Socket对象
		System.out.println("监听到有Client连接到server....");
		// 通过Client对象可以获取输入\输出流
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		// 通过Buffered装饰
		BufferedInputStream bi = new BufferedInputStream(in);
		BufferedOutputStream bo = new BufferedOutputStream(out);
		// 从Client接受数据
		byte[] b = new byte[1024];
		int length = bi.read(b);  //读取client发送过来的数据,如果没有client还没来得及发送数据,程序就会阻塞在read()这个API
		while( length != -1){
			String content = new String(b, 0, length, "UTF-8");
			System.out.println("Server receive :" + content);
			// 接收完成后,先Client发送消息
			bo.write("您好,I am server....".getBytes("UTF-8"));
			// 刷新缓存
			bo.flush();
		}
		// 关闭
		in.close();
		out.close();
		client.close();
		serverSocket.close();
	}
}
