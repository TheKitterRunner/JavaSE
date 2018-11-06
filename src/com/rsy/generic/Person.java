package com.rsy.generic;

public class Person<A extends Decorate, B extends Decorate, C extends Decorate> {
	private A decorateA;
	private B decorateB;
	private C decorateC;
	
	public Person(){
		
	}
	
	public Person(A decorateA , B decorateB ,C decorateC ) {
		this.decorateA = decorateA ;
		this.decorateB = decorateB ;
		this.decorateC = decorateC ;

	}
	public String toString() {
		return "person[A :" + this.decorateA + ", B :" + 
						this.decorateB + " , C :" +
						this.decorateC + "]";
		
	}
	public A getDecorateA() {
		return decorateA;
	}
	public void setDecorateA(A decorateA) {
		this.decorateA = decorateA;
	}
	public B getDecorateB() {
		return decorateB;
	}
	public void setDecorateB(B decorateB) {
		this.decorateB = decorateB;
	}
	public C getDecorateC() {
		return decorateC;
	}
	public void setDecorateC(C decorateC) {
		this.decorateC = decorateC;
	}
	
}
