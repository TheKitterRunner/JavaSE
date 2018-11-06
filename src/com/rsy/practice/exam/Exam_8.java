package com.rsy.practice.exam;

import java.util.Arrays;

public class Exam_8 {
	
	public int[] intArray1;
	public int[] intArray2;

	public static void main(String[] args) {
		Exam_8 exam = new Exam_8();
		exam.intArray1 = new int[]{1,2,3,4,5};
		exam.intArray2 = new int[]{4,3,8};
//		exam.change(exam.intArray1, exam.intArray2);
		exam.change(exam);
		System.out.println(Arrays.toString(exam.intArray1));//1,2,3,4,5
		System.out.println(Arrays.toString(exam.intArray2));//4,3,8
	}
	
	
	public void change(Exam_8 exam){
		int[] array;
		array = exam.intArray1;
		exam.intArray1 = exam.intArray2;
		exam.intArray2 = array;
	}
	
	public void change(int[] intArray1,int[] intArray2){
//		int[] array;
//		array = intArray1;
//		intArray1 = intArray2;
//		intArray2 = array;
		intArray1 = new int[]{4,3,8};
		intArray2 = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(intArray1));//4,3,8
		System.out.println(Arrays.toString(intArray2));//1,2,3,4,5
	}
}
