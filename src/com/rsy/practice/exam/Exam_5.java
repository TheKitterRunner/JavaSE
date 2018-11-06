package com.rsy.practice.exam;

import java.util.Arrays;

public class Exam_5 {
	public static void main(String[] args) {
		Exam_5 exam_5 = new Exam_5();
		int[] intArray = new int[]{1,2,3,4,5};
		exam_5.changeArray(intArray);
		System.out.println("外面的数组" + Arrays.toString(intArray));
	}
	
	public void changeArray(int[] intArray){
		for(int i = 0;i < intArray.length;i++){
			intArray[i] = 100;
		}
//		intArray = new int[]{100,100,100,100,100};
		System.out.println("里面的数组" + Arrays.toString(intArray));
	}

}
