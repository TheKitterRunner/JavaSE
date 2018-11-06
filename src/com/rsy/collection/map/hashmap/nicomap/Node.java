package com.rsy.collection.map.hashmap.nicomap;
/**
 * 定义Node（自定义）
 * @author Nico
 * @createDate 2018年8月10日 上午9:07:06
 */
public class Node {
	
	private Object  key;  // 键
	private Object value;  // 值
	
	public Node(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
