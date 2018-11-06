package com.rsy.network.chatRoom;

import java.io.BufferedOutputStream;
import java.util.Scanner;

/**
 * 专门用来client向服务器发送消息
 * @author Nico
 * @CreateDate 2018年8月12日 上午11:54:24
 */
public class ClientSendRunable implements Runnable{
	private BufferedOutputStream bo;  // 用于向server发送消息
	private Scanner sca = new Scanner(System.in);   // 用于接收控制台输入的消息
	
	public ClientSendRunable(BufferedOutputStream bo) {
		this.bo = bo;
	}

	@Override
	public void run() {
		// 因为client需要先server不断地发送消息，需要死循环
		while(true){
			try{
				System.out.println("请输入聊天的信息：");

				String content = sca.nextLine();
				// 向server发送次消息
				bo.write(content.getBytes("UTF-8"));
				bo.flush();
				System.out.println("client send message success!");
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
