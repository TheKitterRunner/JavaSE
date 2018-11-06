package com.rsy.homework.loop;
/**
 *   插入排序法
 * @author Nico
 * @createDate 2018年7月30日 下午7:48:44
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] ar = {12,13,15,14,19,18,16,17,20,11};
		int[] arr = new int[ar.length];
		for( int i = 0; i < ar.length; i ++ ){
			for( int j = 0; j < arr.length; j ++){
				if (arr[j] < ar[i] && j == i) { //至少要比较到arr[]数组最后一个非零的元素
					for( int k = 0; k < arr.length; k ++){
						if (arr[k] == 0) {
							arr[k] = ar[i];
							break;
						}
					}
				}else if (arr[j] > ar[i]){
					for( int k = arr.length-1 ; k > j ; k -- ){
						arr[k] = arr[k - 1];
					}
					arr[j] = ar[i];
					break;
				}	
			}
		}
		for( int i = 0 ; i < arr.length ; i ++ ){
			System.out.print(arr[i] + " " );
		}
	}
}
