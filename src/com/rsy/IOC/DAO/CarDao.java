package com.rsy.IOC.DAO;

import com.rsy.IOC.annotation.Componet;

@Componet("carDao")
public class CarDao {

	public void receiveRequest(String car) {
		System.out.println("购买改装 :" + car + " 的配件");
	}
}
