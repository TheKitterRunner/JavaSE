package com.rsy.homework.loop;
/*
  Fibonacci数列 : 1,1,2,3,5,8,13,....找出规律,求出第n个数的值
*/
import java.util.Scanner;
public class Fibno {
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			int i,m =0,n =0,sum =0;
			for (i =1; i <= x; i++){
				if (i  == 1){
					System.out.println("F(" + i+ ")=" + i);
					n = i; 
				}else{
					sum = m + n;
					//System.out.println("F(" + i + ")=" + sum);
					if (i%2 == 0) {
						m = sum;
					} else{
						n = sum;
					}					
					System.out.println("F(" + i + ")=" + sum);
				}
			}
		}
	}