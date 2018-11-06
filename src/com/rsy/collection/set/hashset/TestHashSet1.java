package com.rsy.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  泛型的集合set
 *  集合里面的元素是安全的
 *  1.只有本数据类型才可以被添加进集合
 *  2.从集合里取出来的对象也是相应的数据类型的
 * @author Nico
 * @createDate 2018年8月8日 上午10:43:01
 */
public class TestHashSet1 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("Nico", 18));
		set.add(new Person("Kry", 18));
		Person p  = new Person();
		p.setName("Susan");
		p.setAge(19);
		set.add(p);
		
		System.out.println(set.size());
		
		//  迭代器
		Iterator<Person> iterator  = set.iterator();
		
		while(iterator.hasNext()){
			Person person = iterator.next();
			System.out.println(person.getName() + " , " + person.getAge());
//			System.out.println(person);
		}

	}
}
