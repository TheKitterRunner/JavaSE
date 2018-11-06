package com.rsy.homework.normalClass;

/**
 * 2.初始化一个字符串“ABCDEFG”,然后分别在后面跟上自己的小写字母.
     A(a)B(b)C(c)D(d)E(e)F(f)G(g)
 * @author Nico
 * @createDate 2018年8月9日 下午6:45:23
 */
public class Test2 {
	
	public static void main(String[] args) {
		String s = "ABCDEFG";
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			 sb2 = sb.append((char)ch[i]).append("(").append((char)(ch[i] + 32)).append(")");
		}
		System.out.print(sb2);
//		String[] s1 = new String[]{"A","B","C","D","E","F","G"};
//		String[] s2 = new String[]{"(a)","(b)","(c)","(d)","(e)","(f)","(g)"};
//		String[] s3 = new String[14];
//		
//		for( int i = 0; i < s3.length; i ++){
//			if( i % 2 == 0){
//				s3[i] = s1[i / 2];  //4 2
//			}else{
//				s3[i] = s2[(i - 1 ) / 2 ];  // 5 2
//			}
//		}
//		for( int i = 0; i < s3.length; i ++){
//			System.out.print(s3[i]);
//		}
	}
}
