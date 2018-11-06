package com.rsy.homework.exception.exam_1;

public class Multiple {
	private int number;

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) throws MultiException  {
		if (number > 100000) {
			MultiException me = new MultiException("乘积大于100000了，结束！", number);
			throw me;
		}
	}
	
}
