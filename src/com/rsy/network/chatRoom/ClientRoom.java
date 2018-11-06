package com.rsy.network.chatRoom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;

/**
 * 聊天室客户端
 * @author Nico
 * @CreateDate 2018年8月11日 下午4:07:52
 */
public class ClientRoom {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		// 连接server，建立TCP\IP连接，生成Socket（套接字）对象
		Socket socket = new Socket("localhost", 8848);
		// 获取输入\输出流
		BufferedInputStream bi = new BufferedInputStream(socket.getInputStream());
		BufferedOutputStream bo = new BufferedOutputStream(socket.getOutputStream());
		// 开启一个线程，用来读取从server发送过来的消息
		new Thread(new ClientReveiveRunnable(bi)).start();
		// 开启一个线程，用来向server发送数据
		new Thread(new ClientSendRunable(bo)).start();
	}
}
