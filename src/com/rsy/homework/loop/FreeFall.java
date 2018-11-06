package com.rsy.homework.loop;

public class FreeFall {
	public static void main(String []args) {
		double start = 100;
		double sum = 0;
		for ( int i= 1; i <= 10; i ++) {
			sum = sum +start + start / 2;
			start /= 2;
		}
		System.out.println("第十次弹起来经过的路程为：" + sum);
		System.out.println("第十次反弹的高度为：" + start);
	}
}