package com.rsy.collection.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *  Map<K,V> 内部是一对键值对
 *  key不能重复，即同一个 Map 对象的任何两个 Key 通过 equals 方法比较后返回 false
 *  如何判断HashMap里面的key值是否重复,
	  1.判断两个对象是否是equals
	  2.判断两个对象的hashCode值是否相同
	     如果两个都满足,两个key值是同样的,调用put方法会覆盖
 * 遍历集合的方法：
 *    1.通过keySet
 *    2.通过entrySet
 *    3.通过value只能获取value值
 * @author Nico
 * @createDate 2018年8月9日 上午11:43:23
 */
public class TestHashMap {
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		Map map = new HashMap();
		
		//put(K,V)添加元素 会返回一个对象
		Object o1 = map.put("name", "Nico");
		Object o2 = map.put("age", 18);
		Object o3 = map.put("address", "宝安区西乡街道宝源路金源商务大厦");
		
		//size() 返回这个集合键值对的个数
		System.out.println(map.size());
		
		//clear() 清空所有的键值对
//		map.clear();
		
		//isEmpty() 判断 这个键值对集合是否为空
		System.out.println(map.isEmpty());
		
		//containsKey() 是否包含键
		String key1 = "name1";
		System.out.println(map.containsKey("address"));
		System.out.println(map.containsKey(key1));
		
		//containsValue() 是否包含值
		String value1 = "Nico2";
		System.out.println(map.containsValue(value1));
		System.out.println(map.containsValue("宝安区西乡街道宝源路金源商务大厦"));
		
		//remove() 移除一个键值对,返回移除的键值对的值对象
//		map.remove("age");
//		map.remove("name1");
//		System.out.println(map.size());
		
		//get() 获取键值对
		System.out.println(map.get("name"));
		
		//keySet() 返回map里面键值对的Key构成的集合
		map.put("name", 18);
		Set keySet  = map.keySet();
		Iterator setInterator = keySet.iterator();
		while(setInterator.hasNext()){
			Object obj = setInterator.next();
			System.out.println(obj);
		}
		
		//values()方法获取所有值的集合(value的值)
		Collection valuesCollection = map.values();
		Iterator valueIterator = valuesCollection.iterator();
		//通过迭代器进行集合遍历
		while(valueIterator.hasNext()){
			Object o = valueIterator.next();
			System.out.println(o);
		}
		
		//entrySet()方法 : 遍历Map
		//获取Map.Entry键值对映射关系的对象的一个集合Set<Map.Entry>
		Set<Map.Entry> entrySet = map.entrySet();
		//获取Set<Map.Entry>的迭代器
		Iterator<Map.Entry> entrySetIterator =entrySet.iterator();
		//使用迭代器遍历Set<Map.Entry>
		while(entrySetIterator.hasNext()){
			Map.Entry entry = entrySetIterator.next();
			System.out.println("K = " + entry.getKey() + ",V = " + entry.getValue());
		}
		
		// 遍历Map集合(keySet)
		Set keySet2 = map.keySet();
		Iterator keySetIterator = keySet2.iterator();
		while(keySetIterator.hasNext()){
				Object key = keySetIterator.next();
				Object value = map.get(key);
				System.out.println(key + "," +value);
		}
		
	}
}
