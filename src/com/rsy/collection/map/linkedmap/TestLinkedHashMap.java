package com.rsy.collection.map.linkedmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *  LinkedHashMap 是HashMap的一个子类
 *    本测试实现了一个entrySet()方法遍历集合
 * @author Nico
 * @createDate 2018年8月9日 下午8:39:04
 */
public class TestLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("My favarite fruit", "Orange");
		linkedHashMap.put("My favarite sports", "Basketball");
		linkedHashMap.put("My favarite food", "Hot-pot");
		
		Set<Map.Entry<String, String>> linkedSet = linkedHashMap.entrySet();
		Iterator<Map.Entry<String, String>> linkedIterator = linkedSet.iterator();
		while(linkedIterator.hasNext()){
			Map.Entry<String, String> linkedEntry = linkedIterator.next();
			String key = linkedEntry.getKey();
			String value = linkedEntry.getValue();
			System.out.println(key + " : " + value);
		}
 	}
}
