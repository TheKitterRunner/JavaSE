package com.rsy.homework.loop;
/**
 *   十行的杨辉三角形
 *   arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1]
 * @author Nico
 * @createDate 2018年7月30日 下午8:43:34
 */
public class Yanghui {
	public static void main(String[] args) {
		int[][] arr = new int[10][];
		for( int i = 0 ; i < arr.length ; i ++){
			arr[i] = new int[i + 1];
			for( int j = 0 ; j < arr[i].length; j ++){
				if( i == 0 || j == 0 || i == j){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}
		for( int i = 0 ; i < arr.length ; i ++ ){
			for(int j = 0 ; j < arr[i].length ; j ++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
