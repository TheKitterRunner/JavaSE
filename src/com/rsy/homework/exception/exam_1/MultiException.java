package com.rsy.homework.exception.exam_1;

public class MultiException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private int number;

	public MultiException(String message,int number)  {
		super(message);
		this.setNumber(number);
	}

	private void setNumber(int number) {
		this.number = number;
	}

	public MultiException() {
	}

	public int getNumber() {
		return number;
	}


}
