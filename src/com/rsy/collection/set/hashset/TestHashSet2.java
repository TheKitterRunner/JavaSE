package com.rsy.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *   HashSet继承于Set
 *   HashSet 特点 :
 * 		1.无序,不可重复
 * 		2.如何判定是否是重复的
 * 		  a.重写equals方法
 * 		  b.重写hashCode方法
 * 		3.在1.5版本之前,集合不会记住元素的数据类型
 *		4.在1.5版本之后(含 1.5)引入泛型后,集合可以记住元素的数据类型
 * 
 * @author Nico
 * @createDate 2018年8月8日 上午11:35:04
 */
public class TestHashSet2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		// add(),向集合中添加元素
		set.add(new Person("Nico", 18));
		set.add(new Person("Kry", 19));
		set.add(new Person("Dawn", 20));
		set.add(123);
		
//		set.clear();   //移除集合中的所有元素
		Person p = new Person("Nico",18);
		set.add(p);
		System.out.println(set.contains(p));   //  集合中是否包含指定的元素,如果包含就返回true,否则返回false
		
		System.out.println(set.isEmpty());  // 集合中如果没有元素,返回false,如果有,就返回true 
		
//		System.out.println(set.remove(p));   //  如果集合中包含指定元素,就移除,返回是否包含该元素
		
		Set set2 = new HashSet();
		set2.add(new Person("Jethro", 25));
		set2.add(new Person("Long", 26));
		set2.add(new Person("Land", 22)); 
		set2.add(new Person("Nico", 18));
		
		//如果指定的 collection 也是一个 set，则 addAll 操作会实际修改此 set，这样其值是两个 set 的一个并集。
//		System.out.println(set.addAll(set2)); 
		
		// 如果此 set 包含指定 collection 的所有元素，则返回 true。如果指定的 collection 也是一个 set，那么当该 collection 是此 set 的子集 时返回 true
		boolean containsOrNot = set.containsAll(set2);     
		System.out.println(containsOrNot);
		
		// retainAll 返回的是两个集合的交集,有交集返回true,否则返回false
		boolean retainAllOrNot = set.retainAll(set2);
		System.out.println(retainAllOrNot);
		
		// 除去两个集合都有的元素,set的结果是除去之后的集合,含有相同的元素,返回true,否则false
//		boolean removeAllOrNot = set.removeAll(set2);
//		System.out.println(removeAllOrNot);
//		
//		// 将set变为一个数组
//		Object[] objectArray = set.toArray();
//		for (Object o : objectArray) {
//			System.out.println(o);
//		}
		System.out.println(set);
		
		
		System.out.println(set.size());  //  集合中元素的数量	
		//创建一个迭代器,集合的遍历
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}
		for( Object o : set){
			if (o instanceof Integer) {
				Integer i = (Integer) o;
				System.out.println(i);
			}
			if (o instanceof Person) {
				Person p1 = (Person) o ;
				System.out.println("Person-->[ name: " + p1.getName() + ", Age " + p1.getAge() + "]");
			}
		}
			
	}
}
