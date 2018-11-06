package com.rsy.collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList1 {
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0;i < 100000;i++ ) {
			list.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		for (int i = 0;i < 100000;i++) {
			list.get(i);
		}
		
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2 - endTime);
	}
}
