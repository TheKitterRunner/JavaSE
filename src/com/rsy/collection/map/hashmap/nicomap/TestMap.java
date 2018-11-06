package com.rsy.collection.map.hashmap.nicomap;

import java.util.LinkedList;

/**
 *  自定义Map中的方法
 * @author Nico
 * @createDate 2018年8月10日 上午9:10:39
 */
public class TestMap {
	// 定义一个LinkedList的数组来存储数据
	private static LinkedList<Node>[] linkedLists = new LinkedList[98]; 
	// 定义属性 ： 容器的大小
	private int size;
	// 初始化链表数组的元素
	static{
		for (int i = 0; i < linkedLists.length; i++) {
			linkedLists[i] = new LinkedList<Node>();
		}
	}
	//重新定义hashCode() 方法，根据对链表长度取余决定将传入的对象传进哪个位置
	public static int hashCode(Object obj){
		return obj.hashCode() % linkedLists.length; 
	} 
	 // 返回键值对的数量
	public int size(){
		return this.size;
	}
	
	// 根据key值去获取容器中存放的对应的value值
	public Object get(Object key){
		// 计算传入的对象的key 值得hashCode值
		int hashCodeObj = hashCode(key);
		// 根据算出的值进入到数组中指定的链表中（链表里面的数据类型是Node）
		LinkedList<Node> list = linkedLists[hashCodeObj];
		// 遍历指定链表里面的Node
		for(Node n : list){
			// 根据Key值去找时候有匹配的Node，若果有，返回对应的value值
			if (key.equals(n.getKey())) {
				return n.getValue();
			}
		}
		// 根据Key值去找时候有匹配的Node，若果没有，返回null
		return null;
	}
	
	// 向容器中存放键值对
	public Object put(Object key, Object value){
		// 将键值对的值赋值给新建的节点
		Node node = new Node(key, value);
		 // 计算这个新建节点的hashCode值
		int hashCodeObj = hashCode(key);
		// 根据算出的hashCode值定位到对应的linkedlists[]中
		LinkedList<Node> list = linkedLists[hashCodeObj];
		 // 遍历这个链表，判断时候有重复的键（key）
		for (Node n : list) {
			if (n != null && n.getKey().equals(key)) {
				// 若果有，先把旧的节点的值赋值给一个变量
				Object val = n.getValue();
			    // 再用新导入的键值对的值覆盖旧得值
				n.setValue(value);
				// 将旧的值返回出去
				return val;
			}
			// 如果没有重复的键，则将这个新的节点插入到链表中
			list.add(node);
			// 链表的长度 ++
			size ++;
			// 返回空
			return null;
		}
		return null;
	}
	
	//根据key值移除一个元素
}
