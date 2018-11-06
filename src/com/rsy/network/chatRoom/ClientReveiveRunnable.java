package com.rsy.network.chatRoom;

import java.io.BufferedInputStream;

/**
 * 客户端用来接收服务器发送过来的消息
 * @author Nico
 * @CreateDate 2018年8月12日 上午11:46:24
 */
public class ClientReveiveRunnable implements Runnable{
	
	private BufferedInputStream bi;
	
	
	public ClientReveiveRunnable(BufferedInputStream bi) {
		this.bi = bi;
	}

	@Override
	public void run() {
		// 因为需要不断地从server读取数据，需要死循环
		while(true){
			try{
				byte[] b = new byte[1024];
				int length = bi.read(b);
				if( length != -1){
					String content = new String(b, 0, length,"UTF-8");
					System.out.println("client receive" +content);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
