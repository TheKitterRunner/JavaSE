package com.rsy.practice.exam_1;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {
	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<>();

		listPerson.add(new Person("张三", 100001));
		listPerson.add(new Person("李四", 100002));
		listPerson.add(new Person("铁蛋", 100003));
		listPerson.add(new Person("赵六", 100004));
		listPerson.add(new Person("铁蛋", 100005));
		listPerson.add(new Person("铁蛋", 100005));

		for (Person p : listPerson) {
			System.out.println(p);
		}
	}
}
