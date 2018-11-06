package com.rsy.homework.Thread.Exam_3;

public class SingleTon {
	private static SingleTon st = null;
	
	private SingleTon(){
		
	}
	
	public static SingleTon getSingleTon() {
		try { 
			synchronized (SingleTon.class) {
				if(st != null){//懒汉式 
					return st;
				}else{
					//创建实例之前可能会有一些准备性的耗时工作 
					Thread.sleep(1000);
					st = new SingleTon();
				}
			}
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		return st;
	}
}
