package com.rsy.homework.Thread.Exam_3;

public class Singleton1 { 
	
    private static Singleton1 instance;  
    private Singleton1 (){
        
    }   
    public static synchronized Singleton1 getInstance(){    //对获取实例的方法进行同步
      if (instance == null)     
        instance = new Singleton1(); 
      return instance;
      
    }
}