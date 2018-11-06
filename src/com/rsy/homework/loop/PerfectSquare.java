package com.rsy.homework.loop;

public class PerfectSquare {
	public static void main(String []args) {
		a : for (int i = 1;i < 10000 ; i++ ){
		//判断i + 100是否是一个完全平方数
		int n = i + 100;
		for (int j = 1; j < n; j++) {
			if(j * j == n) {
				//再判断i + 168是否是一个完全平方数
				int m = i + 168;
				for (int k = 1; k < m ;k++ ) {
					if (k * k == m) {
						System.out.println(i);
						break a;
					}
				}
			}
		}
		}
	}
}

//		int i;
//		for( i = 1; i <= 1000000; i ++ ) {
//			if(Math.floor(Math.sqrt(i + 100)) == Math.sqrt(i + 100) && Math.floor(Math.sqrt(i + 168))==Math.sqrt(i + 168)){
//				System.out.println("加168或者加100后还是是完全平方数的正整数是：" + i);
//			}
//		}
//
//	}
