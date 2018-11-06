package com.rsy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 使用Collection 工具类
 * List内部排序器
*@author Nico
*2018年7月18日下午4:32:09
*/
public class ListSortTest {
	public static void main(String []args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("name1",29));
		persons.add(new Person("name2",28));
		persons.add(new Person("name3",23));
		persons.add(new Person("name4",30));
		persons.add(new Person("name5",21));
		
		Collections.sort(persons);
		for(Person p : persons) {
			System.out.println(p);
		}
	}
}
