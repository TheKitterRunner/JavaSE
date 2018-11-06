package com.rsy.practice.thread.case1;

import java.util.ArrayList;
import java.util.List;

public class Source {
	
	public static Integer i = 1;
	
	public static Integer count = 1;

	public List<Integer> list = new ArrayList<>();
	
	public void add() {
		synchronized(this){
			while( count % 2 == 0 ){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			list.add(i ++ );
			list.add(i ++ );
			list.add(i ++ );
			System.out.println(list);
			count ++;
			this.notify();
		}
	}
	// 线程随机被执行,如果执行了
	public void delete(){
		synchronized(this){
			while( count % 2 == 1){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			list.remove(list.size() - 1);
			list.remove(list.size() - 1);
			System.out.println(list);
			count ++;
			this.notify();
		}
	}
}
