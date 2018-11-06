package com.rsy.homework.loop;
/**
 *  输出2-200之间所有的素数
 * @author Nico
 *
 */
public class  Sushu{
		public static void main(String[] args) {
			int i = 2;
		    while (i <= 100) {
				for ( int k =2 ;k <i ;k ++ ){
					if( i%k == 0){
						i ++;
						continue ;
					}
				}
				System.out.print(i + " ");
				i ++ ;
		    }
		}
}