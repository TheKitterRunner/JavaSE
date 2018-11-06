package com.rsy.network.chatRoom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


/**
 *  聊天室服务器
 * @author Nico
 * @CreateDate 2018年8月11日 下午4:08:47
 */
public class ServerRoom {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 指定端口，构建一个Server
		ServerSocket serverSocket =  new ServerSocket(8848);
		System.out.println("server start success!");
		List<BufferedOutputStream> listOut = new ArrayList<>();
		// 持续的监听Client接入
		while(true){
			Socket client = serverSocket.accept();  // 阻塞监听Client连接
			System.out.println("有新的Client加入到聊天室");
			
			// 获取输入\输出流
			BufferedInputStream bi = new BufferedInputStream(client.getInputStream()); 
			BufferedOutputStream bo = new BufferedOutputStream(client.getOutputStream());
			
			// 将单前锋输出流添加到listOut中
			listOut.add(bo);
			
			// 接受client发送来的数据
			new Thread(new ServerReceiveRunnable(bi, bo, listOut)).start();
			
			// server可能会主动发送消息到所有的client(推送)
			new Thread(new ServerSendRunnable(listOut)).start();;
			
		}
	}
}
