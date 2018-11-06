package com.rsy.IO.practice.modifyTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersonImp implements PersonDao{

	@Override
	public void insert(Person person) {
		List<Person> list = read("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt");
		for (Person p : list) {
			if (person.getId() == p.getId()) {
				System.out.println("要查询的对象已经存在");
				return;
			}
		}
		list.add(person);
		write("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt",list);
		System.out.println("已经添加成功！");
	}
	/**
	 * 向文件中写入数据的方法
	 * @param string
	 * @param list
	 */
	private void write(String path, List<Person> list) {
		File file = new File(path);
		try (FileOutputStream fi = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fi);
			) {
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
		}
	}
	/**
	 *  读出文件的方法
	 * @param path
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<Person> read(String path) {
		List<Person> list = null;
		File file = new File(path);
		try (
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fi);
			) {
			Object o = ois.readObject();
			if (o instanceof List) {
				list = (List<Person>) o;
			}
		} catch (Exception e) {
		}
		return list;
	}

	@Override
	public void delete(int id) {
		List<Person> list = read("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt");
		boolean flag = false;
		for( Person p : list){
			if (p.getId() == id) {
				flag = true;
				list.remove(p);
				System.out.println("已经成功删除！");
				break;
			}
		}
		if (!flag) {
			System.out.println("要查询的对象不存在，请确认信息是否正确！");
		}
		write("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt", list);
	}

	@Override
	public void update(Person person) {
		List<Person> list = read("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt");
		boolean flag = false;
		for( Person p : list){
			if (p.getId() == person.getId()) {
				flag = true;
				p.setAge(person.getAge());
				p.setName(person.getName());
				System.out.println("更新成功");
				break;
			}
		}
		if (!flag) {
			System.out.println("要更新的对象不存在，请确认信息是否正确！");
		}
		write("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt", list);
	}

	@Override
	public Person select(int id) {
		List<Person> list = read("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt");
		Person person = null;
		for(Person p : list){
			if (p.getId() == id) {
				person = p;
				System.out.println("已经成功找到指定对象");
				break;
			}
		}
		return person;
	}

	@Override
	public List<Person> selectAll() {
		return read("E:\\Javastudy\\java 课件\\JavaSE 视频课件\\JavaSE\\personTable.txt");
	}

}
