package com.rsy.collection;

import java.util.Set;
import java.util.TreeSet;
/**
*  自然排序
*@author Nico
*2018年7月18日下午4:15:25
*/
public class TreeSetTest1 {
	public static void main (String []args) {
		Set<String> string = new TreeSet<String>();
		
		string.add("qwqef");
		string.add("dksfghk");
		string.add("jhmhdg");
		string.add("sfdvth");
		string.add("oldrumr");

		for(String s:string) {
			System.out.println(s);
		}
		
		Set<Person> persons = new TreeSet<Person>();
		
		persons.add(new Person("name1",29));
		persons.add(new Person("name2",28));
		persons.add(new Person("name3",23));
		persons.add(new Person("name4",30));
		persons.add(new Person("name5",21));
		
		for(Person p : persons) {
			System.out.println(p);
		}
	}
}
