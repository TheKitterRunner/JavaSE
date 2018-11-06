package com.rsy.IO.practice.modifyTable;

import java.util.List;

public interface PersonDao {
	/**
	 * 添加一个Person
	 * @param person
	 */
	public void insert(Person person);
	/**
	 * 根据ID 删除对应的Person
	 * @param id
	 */
	public void delete(int id);
	/**
	 * 更新
	 * @param person
	 */
	public void update(Person person);
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	public Person select(int id);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Person> selectAll();
}
