package com.rsy.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  TCP\IP client:
 *  	连接本机的8848端口的应用程序
 *  	先向Server发送数据请求,	发送完成后,接受Server反馈回来的数据
 * @author Nico
 * @createDate 2018年8月8日 下午8:27:15
 */
public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		// 向ip为localhost,端口为:8848的应用程序发送连接的请求,TCP\IP 连接建立成功后获得一个Socket对象
		Socket client = new Socket("localhost", 8000); 
		System.out.println("client connect server Success !");
		// 通过Socket可以获得输入\输出流
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		// 装饰成Buffered,提升性能
		BufferedInputStream bi = new BufferedInputStream(in);
		BufferedOutputStream bo = new BufferedOutputStream(out);
		// 向server发送数据
		bo.write("你好! I am a client...".getBytes("UTF-8"));
		// 刷新缓存
		bo.flush();
		// 接收server反馈回来的消息
		byte[] b = new byte[1024];
		int length = bi.read(b);   // 读取server发送过来的数据,如果server还没来得及发送数据,程序就会阻塞在read()这个API
		while(length != -1){
			String content = new String(b, 0, length, "UTF-8");
			System.out.println("Client receive:" + content);
		}
		// 关闭资源
		bi.close();
		bo.close();
		client.close();
	}
}
