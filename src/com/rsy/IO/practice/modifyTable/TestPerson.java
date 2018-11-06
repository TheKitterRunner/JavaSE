package com.rsy.IO.practice.modifyTable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestPerson {

	static{
		List<Person> list = new ArrayList<>();
		list.add(new Person(4051, "Nico1", 18));
		list.add(new Person(4052, "Nico2", 18));
		list.add(new Person(4053, "Nico3", 18));
		list.add(new Person(4054, "Nico4", 18));
		list.add(new Person(4055, "Nico5", 18));
		list.add(new Person(4056, "Nico6", 18));
		list.add(new Person(4057, "Nico7", 18));
		list.add(new Person(4058, "Nico8", 18));
		list.add(new Person(4059, "Nico9", 18));
		list.add(new Person(4060, "Nico10", 18));
		
		File file = new File("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PersonDao pd = new PersonImp();
//		pd.insert(new Person(4062, "张三", 18));
		
//		int id = 4060;
//		pd.delete(id);
//		pd.update(new Person(4055, "NICO5", 18));
		Person person = pd.select(4057);
		System.out.println(person.getName() + "," + person.getAge());
		System.out.println(pd.selectAll());
	}
}
