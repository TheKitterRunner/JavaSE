package com.rsy.homework.normalClass;

import java.util.Random;

/**
 * 10.随机生成400 个 [6,50]的整数，统计出生成的每个整数的个数s。输出入格式如下：数字：个数例如：40：4  …  50：6
 * @author Nico
 * @createDate 2018年8月10日 下午5:15:04
 */
public class Test10 {
	public static void main(String[] args) {
		// 创建Random的对象
		Random random = new Random();
		// 用来存放出现的随机数的数组
		int[] randomCount = new int[400];
		for( int i = 0; i < 400; i ++ ){
			// 随机出现0-44的随机整数
			int j = random.nextInt(45);
			// 随机出现6-50的随机整数
			int n = j + 6;
			// 将每次出现的随机数存放在数组的对应位置
			randomCount[i] = n;
//			System.out.println(randomCount[i]);
		}
		// 用来存放统计个数的数组：从randomCount[6]开始，对应的下标号对应出现的随机数，元素初始默认都是0
		int[] count = new int[51];
		// 从下表是6的开始遍历到50
		for (int k = 6; k < 51; k++) {
			// 遍历随机数的数组
			for( int m = 0; m < 400; m ++ ){
				// 如果下表的数字等于随机数组里面的元素，则对应下表位置的元素++
				if (randomCount[m] == k ) {
					count[k] ++;
				}
			}
			// 打印输出随机数出现的次数
			System.out.println(k + "出现的次数为 :" + count[k]);
		}
	}
}

