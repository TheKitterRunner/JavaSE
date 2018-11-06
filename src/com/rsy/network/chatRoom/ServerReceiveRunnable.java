package com.rsy.network.chatRoom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * 用于Server 接收数据
 *   但server收取到信息后会进行广播
 * @author Nico
 * @CreateDate 2018年8月12日 上午10:42:13
 */
public class ServerReceiveRunnable implements Runnable{
	private BufferedInputStream bi;  // 当前连接Server对应的client的输入流
	private BufferedOutputStream bo;  // 当前连接Server对应的client的输出流
	private List<BufferedOutputStream> listOut;   // 所有连接Server的client的输出流集合

	public ServerReceiveRunnable(BufferedInputStream bi, BufferedOutputStream bo, List<BufferedOutputStream> listOut) {
		this.bi = bi;
		this.bo = bo;
		this.listOut = listOut;
	}

	@Override
	public void run() {
		// 读取客户端的数据，需要死循环
		while(true){
			try{
			// 读取客户啊短发送过来的数据，read会进行堵塞读取
				byte[] b = new byte[1024];
				int length = bi.read(b);
				if(length != -1){
					// 获取读取到的信息
					String content = new String(b, 0, length,"UTF-8");
					System.out.println("server had received message" + content);
					// 将读取到的数据广播到所有的client
					this.broadCast(content);
					System.out.println("server boradcast success!");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	/**
	 * 广播消息到的所有的client
	 * @param content
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	public void broadCast(String content) throws  IOException{
		if (this.bo != bo){
			for(BufferedOutputStream bo : listOut){
				bo.write(content.getBytes("UTF-8"));
				bo.flush();
			}
		}
	}
}
