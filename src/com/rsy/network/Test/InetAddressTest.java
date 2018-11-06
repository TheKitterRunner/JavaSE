package com.rsy.network.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getByAddress(new byte[]{(byte)183,3,(byte)226,35});
		System.out.println(inetAddress.getHostName());
		System.out.println(inetAddress.getHostAddress());
	}
}
