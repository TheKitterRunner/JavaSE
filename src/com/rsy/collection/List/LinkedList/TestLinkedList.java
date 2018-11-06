package com.rsy.collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.rsy.collection.List.ArrayList.Student;
/**
 * LinkedList
 * 1.添加的速度块
 * 2.随机读取的速度很慢
 * @author Nico
 * @createDate 2018年8月8日 下午4:31:18
 */
public class TestLinkedList {
	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();
		
		Student s1 = new Student("Nico1" ,18);
		Student s2 = new Student("Nico2" ,18);
		Student s3 = new Student("Nico3" ,18);
		Student s4 = new Student("Nico4" ,18);
		Student s5 = new Student("Nico5" ,18);
		Student s6 = new Student("Nico6" ,18);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Student student = list.get(2);
		System.out.println(student);
		
	
		LinkedList<Student> linkedList = (LinkedList<Student>) list;
		System.out.println(linkedList);
		//element() : 获取集合的是一个元素,但不删除(重写Queue()接口的方法)
		Object o = linkedList.element();
		System.out.println(o);
		
		// getFirst():返回此列表的第一个元素。(重写Deque()接口的方法)
		System.out.println(linkedList.getFirst());
		
		//getLast() : 返回此列表的最后一个元素。(重写Deque()接口的方法)
		System.out.println(linkedList.getLast());
		
		// indexOf() :此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1
		System.out.println(linkedList.indexOf(s4));
		
		// offer() :将指定元素增加到列表的末位(最后一个元素)
		linkedList.offer(new Student("Nico7", 18));
		System.out.println(linkedList.getLast());
		
		//addFirst() : 指定元素插入到列表的第一位
		linkedList.addFirst(new Student("FirstNico", 18));
		
		//addFirst() : 指定元素插入到列表的末尾
		linkedList.addLast(new Student("LastNico", 18));
		
		//pop():从此列表所表示的堆栈处弹出一个元素。换句话说，移除并返回此列表的第一个元素。
//		System.out.println(linkedList.pop());
		
		//listIterator(index) 从index这个索引开始迭代
		ListIterator<Student> listIterator = linkedList.listIterator(0);
		while(listIterator.hasNext()){
			Student s7 = listIterator.next();
			System.out.println(s7);
			
		}
	}
}
