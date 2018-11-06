package com.rsy.thread.example;

public class Test extends Thread{
    public Test(){
        //编写子类的构造方法，可缺省
    }
    public void run(){
        //编写自己的线程代码
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){ 
    	Test test = new Test(); 
    	test.setName("我是自定义的线程1");
    	test.start();       
        System.out.println(Thread.currentThread().toString());  
    }
}
