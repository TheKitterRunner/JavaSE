package com.rsy.collection.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import com.rsy.collection.map.hashmap.Person;
/**
 * TreeMap
 * 要求Key必须是可以排序的（实现Comparable接口的）
 * @author Nico
 * @createDate 2018年8月9日 下午10:04:45
 */
public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Person,String> treeMap = new TreeMap<>();
		
		treeMap.put(new Person("Nico1", 46), "4051");
		treeMap.put(new Person("Nico2", 26), "4052");
		treeMap.put(new Person("Nico3", 56), "4053");
		treeMap.put(new Person("Nico4", 36), "4054");
		treeMap.put(new Person("Nico5", 16), "4055");
		
		// entrySet()遍历
		Set<Map.Entry<Person, String>> entrySet = treeMap.entrySet();
		Iterator<Map.Entry<Person, String>> treeMapIterator = entrySet.iterator();
		while(treeMapIterator.hasNext()){
			Map.Entry<Person, String> treeMapEntry = treeMapIterator.next();
			Person key = treeMapEntry.getKey();
			String value = treeMapEntry.getValue();
			System.out.println(key + ":" + value);
		}
		
		// ceilingEntry :最小键大于等于 key 的条目；如果不存在这样的键，则返回 null 
		/*Person p1 = new Person("Nico6", 26);
		Entry<Person, String> entry = treeMap.ceilingEntry(p1);
		System.out.println(entry.getKey() + "," + entry.getValue());
		
		// higherEntry :返回一个键-值映射关系，它与严格大于给定键的最小键关联；如果不存在这样的键，则返回 null。
		Person p3 = new Person("Nico8", 26);
		Entry<Person, String> entry3 = treeMap.higherEntry(p3);
		System.out.println(entry3.getKey() + "," + entry3.getValue());
		
		// floorEntry : 返回一个键-值映射关系，它与小于等于给定键的最大键关联；如果不存在这样的键，则返回 null
		Person p2 = new Person("Nico7",47);
		Entry<Person, String> entry2 = treeMap.floorEntry(p2);
		System.out.println(entry2.getKey() + "," + entry2.getValue() );
		
		
		// lowerEntry :返回严格小于给定键的最大键；如果不存在这样的键，则返回 null。
		Person p4 = new Person("Nico9", 46);
		Entry<Person, String> entry4 = treeMap.lowerEntry(p4);
		System.out.println(entry4.getKey() + "," + entry4.getValue());
		
		// 逆序输出集合
		NavigableSet<Person> reverseSet = treeMap.descendingKeySet();
		Iterator<Person> iterator = reverseSet.iterator();
		while(iterator.hasNext()){
			Person person = iterator.next();
			System.out.println(person);
		}
		
		// 逆序迭代器descendingIterator():以降序返回在此 set 的元素上进行迭代的迭代器
		Iterator<Person> reverseIterator = reverseSet.descendingIterator();
		while(reverseIterator.hasNext()){
			Person person1 = reverseIterator.next();
			System.out.println(person1);
		}*/
	}
}
