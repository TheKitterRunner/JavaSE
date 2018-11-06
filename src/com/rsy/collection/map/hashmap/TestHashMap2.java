package com.rsy.collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {
	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<>();
		
		map.put("4051", new Person("Nico1", 28));
		map.put("4052", new Person("Nico2", 18));
		map.put("4053", new Person("Nico3", 48));
		map.put("4054", new Person("Nico4", 58));
		map.put("4055", new Person("Nico5", 38));
		
		// 使用entrySet()遍历数组
		Set<Map.Entry<String, Person>> personSet = map.entrySet();
		Iterator<Map.Entry<String, Person>> personSetIterator = personSet.iterator();
		while(personSetIterator.hasNext()){
			Map.Entry<String, Person> entry = personSetIterator.next();
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key + "," + value);
		}
	}
}
