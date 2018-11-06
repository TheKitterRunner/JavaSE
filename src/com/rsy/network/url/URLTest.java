package com.rsy.network.url;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *   使用URL访问http协议下的网站
 * @author Nico
 * @CreateDate 2018年8月13日 下午2:13:59
 */
public class URLTest {
	public static void main(String[] args) throws IOException{
		// 创建一个URL的对象，用来接收传入的IP地址
		URL url = new URL("http://www.baidu.com");
		// 打开这个url对应域名的连接，获得连接对象，访问域名对应的服务
		URLConnection connection = url.openConnection();
		// 获取这个url对应的连接(创建一个BufferedInputStream的对象)，用于读取数据的输入流
		BufferedInputStream  bi = new BufferedInputStream(connection.getInputStream());
		// 读取数据
		byte[] b = new byte[1024];
		int length = 0;
		StringBuffer content = new StringBuffer();
		while( (length = bi.read(b))!= -1){
			content.append(new String(b, 0, length, "UTF-8"));
		}
		System.out.println(content);
	}
}
