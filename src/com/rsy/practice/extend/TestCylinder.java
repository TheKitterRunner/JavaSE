package com.rsy.practice.extend;

import java.util.Scanner;

/**
 *  输入半径和高计算圆柱体体积
 * @author Nico
 * @createDate 2018年8月2日 下午7:45:30
 */
public class TestCylinder {
	public static void main(String[] args) {
		//实例化圆柱体对象
		Cylinder c2 = new Cylinder();
		//键盘输入半径和高
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入半径:");
		double r = scan.nextDouble();
		System.out.println("请输入高:");
		double h = scan.nextDouble();
		scan.close();
		//调用方法计算
		double result =  c2.findVolume(r,h);
		System.out.println("圆柱体的体积是:" + result );
	}
}
