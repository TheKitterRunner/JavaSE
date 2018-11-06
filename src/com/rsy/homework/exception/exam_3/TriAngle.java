package com.rsy.homework.exception.exam_3;

public class TriAngle {
	private int a ;
	private int b;
	private int c;
	
	public TriAngle() {
		super();
	}

	public TriAngle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void judge() throws TrigonometricFunctionException {
		if (a + b <= c || a + b <= c || a + b <= c) {
			TrigonometricFunctionException te = new TrigonometricFunctionException("a,b,c不能构成三角 形");
			throw te;
		}
	}

	@Override
	public String toString() {
		return "三角形(TriAngle)边长分别是:[a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
