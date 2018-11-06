package com.rsy.homework.IO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *  任意多的字母随机组合的所有可能性
 * @author Nico
 * @CreateDate 2018年8月17日 上午9:03:10
 */
public class Combination {
	// 主方法
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要排列的字母，中间用逗号隔开");
		String str = scan.nextLine();
		String[] strArr = str.split(",");
		List<String>  list = Arrays.asList(strArr);
		scan.close();
		Combination com = new Combination();
		List<String> result  = com.comLetter(list);
		int count = 0;
		for( String s : result){
			System.out.println(s);
			count ++ ;
		}
		System.out.println("组合的种类为： " + count);
		
	}
	
	private List<String> comLetter(List<String> list){
		if (list.size() <= 1) {
			return list;
		}
		// 定义三个list集合
		List<String> resultList = new ArrayList<String>(); // 存储最终结果
		List<String> temList = new ArrayList<>();   // 用于在递归的过程中存储每个字母开头的组合的所有可能
		List<String> leverList = new ArrayList<>(); 
		for (int i = 0; i < list.size(); i++) {
			resultList.add(list.get(i));
			for( int j = 0; j < list.size();  j ++){
				if (i != j) {
					temList.add(list.get(j));
				}
			}
			leverList = this.comLetter(temList);
			for( String s : leverList){
				resultList.add(list.get(i) + s);
			}
			
			temList.clear();
		}
		return resultList;
	}
    
}

