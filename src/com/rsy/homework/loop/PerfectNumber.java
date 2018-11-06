package com.rsy.homework.loop;
/**
 *   完数：所有的因数（除去自身）相加的和等于自己的正整数
 * @author 30610
 *
 */
public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("1000以内的所有完数有：");
		
		for (int i = 1 ; i <= 1000 ; i ++ ) {
			int sum = 0;
			for (int j = 1; j < i ; j ++  ) {
				if (i%j == 0) {
					sum += j;
				}
			}
				if (sum == i) {
					System.out.print(i+" ");
				}
		}		
	}
}
