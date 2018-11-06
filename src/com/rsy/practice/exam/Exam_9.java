package com.rsy.practice.exam;

public class Exam_9 {	
	public static void main(String args[]) {
		Test t = new Test();		
		t.first();
	}
}
class Value {	
	int i = 15;
}
class Test {
	public void first() {
		int i = 5;
		Value v = new Value();
		System.out.println(v.i);  // @1 15
		v.i = 25;
		System.out.println(v.i);  // @2 25
		second(v, i);
		System.out.println(v.i);  // @5 25 答案20
	}
	public void second(Value v, int i) {  // v = v ,i = 5
		i = 0;
		v.i = 20;
		System.out.println(v.i); // @3 20
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);  // @4 15  0
	}
}
