package com.rsy.network.chatRoom;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * 服务端发送数据：主要是Sever发送公告信息
 * @author Nico
 * @CreateDate 2018年8月12日 上午10:43:30
 */
public class ServerSendRunnable implements Runnable{
	private List<BufferedOutputStream> listOut;
	private Scanner scanner = new Scanner(System.in); // 用于控制台接受公告信息
	
	public ServerSendRunnable(List<BufferedOutputStream> listOut) {
		this.listOut = listOut;
	}
	@Override
	public void run() {
		// 因为服务器会不定时的不断地向所有的client发送公告，所以治理必须适应死循环
		while(true){
			// 提示的信息
			System.out.println("请输入要公告的信息：");
			String content = scanner.nextLine();  // 程序会阻塞在nextLine，知道控制台输入了信息
			// 将接收到的信息广播给所有的client
			this.broad(content);
			System.out.println("server broad success!");
		}
		
	}
	/**
	 *  广播收到的信息
	 * @param content
	 */
	public void broad(String content){
		for(BufferedOutputStream bo : listOut){
			try {
				bo.write(content.getBytes("UTF-8"));
				bo.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
