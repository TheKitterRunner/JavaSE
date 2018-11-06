package com.rsy.entend;

public class Kids extends ManKind {
	public  int yearsold = 25;

	public  static void main(String []args) {
			Kids somekid = new Kids();
			somekid.salary = 1000;
			somekid.sex = 1;
			//super.employeed();
			somekid.manOrWoman();
			somekid.printAge();
			somekid.employeed();
			}
	
	public void employeed() {
		super.employeed();
		System.out.println("kids should study and no job !");
	}
	public void printAge() {
				System.out.println(yearsold+" yearsold !");
	}
}