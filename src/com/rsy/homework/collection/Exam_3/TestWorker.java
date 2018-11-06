package com.rsy.homework.collection.Exam_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个 List ，在 List 中增加三个工人，基本信息如下：  
	姓名          年龄    工资
	zhang3 18  3000 
	li4    25  3500 
	wang5  22  3200 
	(1) 在 li4 之前插入一个工人，信息为：姓名： zhao6，年龄： 24，工资 3300 
	(2) 删除 wang5 的信息 
	(3) 利用 for 循环遍历，打印 List 中所有工人的信息 
	(4) 利用迭代遍历，对 List 中所有的工人调用 work 方法。 
	(5) 为 Worker 类重写 equals 方法，当姓名、年龄、工资全部相等时候才返回 true
 * @author Nico
 * @createDate 2018年8月11日 上午11:43:02
 */
public class TestWorker {
	public static void main(String[] args) {
		// 创建ArrayList的实例化对象
		List<Worker> workerList = new ArrayList<Worker>();
		// 初始化三个Worker实例
		Worker w1 = new Worker("zhang3", 18, 3000);
		Worker w2 = new Worker("li4", 25, 3500);
		Worker w3 = new Worker("wang5", 22, 3200);
		// 添加三个Worker实例到workerList中
		workerList.add(w1);
		workerList.add(w2);
		workerList.add(w3);
		// (1) 在 li4 之前插入一个工人，信息为：姓名： zhao6，年龄： 24，工资 3300 
//		workerList.add(1, new Worker("zhao6", 24, 3300));
//		System.out.println(workerList.toString());
		
		// (2)删除 wang5 的信息 
//		workerList.remove(3);
//		System.out.println(workerList.toString());

		// (3) 利用 for 循环遍历，打印 List 中所有工人的信息 
//		for (Iterator iterator = workerList.iterator(); iterator.hasNext();) {
//			Worker worker = (Worker) iterator.next();
//			System.out.println(worker);
//		}
//		for (int i = 0; i < workerList.size(); i++) {
//			System.out.println(workerList.get(i));
//		}
		
		// 利用迭代遍历，对 List 中所有的工人调用 work 方法。 
		Iterator<Worker> iterator = workerList.iterator(); 
		while(iterator.hasNext()){
			Worker worker = (Worker) iterator.next();	
			System.out.println(worker);
		}
	}
}
