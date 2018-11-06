package com.rsy.IO;

import java.io.IOException;

public class Test6 {
	public static void main(String []args) throws IOException, ClassNotFoundException{
		FileTools6.savePerson("C:\\Users\\30610\\Desktop\\Test\\person.object", new Person("Nico", 25));
		
		Object obj = FileTools6.getPerson("C:\\Users\\30610\\Desktop\\Test\\person.object");
		System.out.println(obj);
	}
}
