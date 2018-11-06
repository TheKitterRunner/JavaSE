package com.rsy.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String []args) {
	List<?> list = new ArrayList<String>(Arrays.asList(new String[]{"AAAA","NBBB"}));
	
	System.out.println(list.get(1));
	}
}
