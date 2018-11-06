package com.rsy.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
*   从控制台输入字符串，算出字符串所有可能的组合并打印在控制台
*@author Nico
*2018年7月19日上午10:39:34
*/
public class Exap1 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要组合的字符串，字符串之间用逗号隔开：");
		
		//接受字符串，用逗号隔开变为数组，再将数组转换成集合
		String line = scan.nextLine();
		String []arr = line.split(",");
		List<String> list = Arrays.asList(arr);	 //数组转换为集合
		scan.close();
		Exap1 e = new Exap1();
		//开始计算
		List<String> result = e.getResult(list);	
		for(String s:result){
			System.out.println(s);
		}
	}	
	/**
	 * 计算集合中所有元素的组合可能
	 * @param list
	 * @return
	 */
	public List<String> getResult (List<String> list) {
		//如果集合中元素也只有一个，那么集合本身就是结果
		if (list.size() <= 1 ){
			return list;
		}
		
		List<String> result = new ArrayList<String>();  //用于接收所有的结果
		List<String> levelList = new ArrayList<String>();  //用于临时存储每个字母开头的组合可能
		List<String> otherElementList = new ArrayList<String>(); //用于临时存储X 和非X 字母的组合
		//分别拿到第一层级的A,B,C
		for(int i = 0 ; i < list.size(); i ++) {                    // i=0 ;          i=0
			result.add(list.get(i));                    			// result={a}	result={a,b}
			for( int j = 0 ; j < list.size() ; j ++ ) {				//j=0,other={}   j=0.other={b,c}
				if ( i != j) {										//j=1,other={b}  j=1,other={b,c}
					otherElementList.add(list.get(j));              //j=2 other={b,c}
				}													//other={b,c}    other={b,c}
			}
			//计算A C 或  A B 或 B C的组合可能
			levelList = this.getResult(otherElementList);  //迭代          //返回getResult  
			//第一层级的元素和第二层级的元素拼接
			for( String s:levelList) {
				result.add(list.get(i) + s);
			}
			otherElementList.clear();		
		}
		return result;
		
	}
}
