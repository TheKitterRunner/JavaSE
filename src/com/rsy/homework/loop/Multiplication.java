package com.rsy.homework.loop;

public class Multiplication {
	public static void main(String []args) {
		for (int i=1;i<=9 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print( j +	"X" + i  + "=" + i*j + " ");
			}
			System.out.println();
		}
	}	
}
