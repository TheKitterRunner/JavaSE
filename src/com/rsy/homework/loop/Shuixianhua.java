package com.rsy.homework.loop;

public class Shuixianhua {
	public static void main(String[] args) {

		//输出10000以内的水仙花数
		int a,b,c,d;
		int sum; //  表示各位三次幂的和
		for (int i=100;i<10000 ;i++ ) {
			 a=(i/1000);  // 千位的数字 
			 b=(i/10/10%10); // 百位的数字
			 c=(i/10%10);  //  十位的数字
			 d=(i%10);  //  个位的数字
			 sum=a*a*a+b*b*b+c*c*c+d*d*d;  //水仙花数的判定条件
			if (sum==i) {
				System.out.println(i+"是水仙花数");
			}
		}
	}
}
