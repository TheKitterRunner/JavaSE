package com.rsy.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
/**
 *  ArrayList : 
 *   1.添加效率不高
 *   2.随机访问速度快...get()
 * @author Nico
 * @createDate 2018年8月8日 下午7:20:51
 */
public class TestArrayList {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		long systemStartTime = System.currentTimeMillis();
		for(int i =0 ;i < 5000000; i ++){
			list.add(i);
//			System.out.println(i);
		}
		long systemEndTime = System.currentTimeMillis();
		System.out.println(systemEndTime - systemStartTime);
		
		for(int i =0 ;i < 5000000; i ++){
			list.get(i);
		}
		long getEndTime = System.currentTimeMillis();
		System.out.println(getEndTime - systemEndTime);
	}
}
