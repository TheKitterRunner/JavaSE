package com.rsy.thread.example;

public class Test2 {
	  public static void main(String[] args){ 
	        System.out.println(Thread.currentThread().getName());
	        Thread t1 = new Thread(new MyyThread());
	        t1.start(); 
	    }
	}

	class MyyThread implements Runnable{
	    @Override
	    public void run() {
	        System.out.println(Thread.currentThread().getName() + "-->我是通过实现接口的线程实现方式！");
	    }   
	}
