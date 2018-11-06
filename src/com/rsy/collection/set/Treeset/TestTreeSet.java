package com.rsy.collection.set.Treeset;

import java.util.Iterator;
import java.util.TreeSet;
/**
 * TreeSet(要添加进集合的类必须实现Comparable()接口)
 * 1.是SortedSet的一个实现子类
 * 2.集合里的元素按照指定的顺序排列
 * 3.如何判断两个元素是否相同
 * 按照实现的compareTo方法,判断返回的int值是 0
 * 4.添加到TreeSet里面的元素的数据类型一定要实现Comparable接口,或者重写Comparator的compare方法
 * @author Nico
 * @createDate 2018年8月8日 下午4:20:34
 */
public class TestTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("Nico1", 23));
		treeSet.add(new Person("Nico2", 18));
		treeSet.add(new Person("Nico3", 20));
		treeSet.add(new Person("Nico4", 22));
		treeSet.add(new Person("Nico5", 21));

		//ceiling():返回此 set 中大于等于给定元素的最小元素；如果不存在这样的元素，则返回 null
		System.out.println(treeSet.ceiling(new Person("Nico1", 24)));
		
		//contains()如果此 set 包含指定元素，则返回 true
		System.out.println(treeSet.contains(new Person("Nico3", 20)));
		
		// floor()返回此 set 中小于等于给定元素的最大元素；如果不存在这样的元素，则返回 null。
		System.out.println(treeSet.floor(new Person("Nico", 23)));
		
		// higer() :严格的向上取整  不能=
		System.out.println(treeSet.higher(new Person("Nico", 22)));
		
		// lower(): 严格的向下取整  不能=
		System.out.println(treeSet.lower(new Person("Nico", 22)));

		//headSet(): 取比这个元素小的所有元素的集合
		System.out.println(treeSet.headSet(new Person("Nico",23)));
		
		//tailSet():取大于等于这个元素的所有元素的集合
		System.out.println(treeSet.tailSet(new Person("Nico",18)));
		
		//pollFirst() : 获取第一个元素并移除
//		System.out.println(treeSet.pollFirst());
//		System.out.println(treeSet);
		
		//subSet() 返回这个集合的部分视图(返回此 set 的部分视图，其元素从 fromElement（包括）到 toElement（不包括）)
		System.out.println(treeSet.subSet(new Person("Nico9",20), new Person("Nico9",22)));
		
		// 在此 set 中的元素上按升序进行迭代的迭代器
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			Person p = iterator.next();
			System.out.println("Person--> [ name: " + p.getName() + ",  Age: " + p.getAge() + "]");
		}
		
		// 降序排列.和iterator的用法一样
		Iterator<Person> descendingiterator = treeSet.descendingIterator();
		while(descendingiterator.hasNext()){
			Person p = descendingiterator.next();
			System.out.println("Person--> [ name: " + p.getName() + ",  Age: " + p.getAge() + "]");
		}
		
		System.out.println(treeSet.size());
	}
}
