package com.rsy.network.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTest {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8000);
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bis = new BufferedReader(isr);
			
			System.out.println(bis.readLine());
			
			bis.close();
			isr.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
