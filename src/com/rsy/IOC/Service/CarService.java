package com.rsy.IOC.Service;

import com.rsy.IOC.DAO.CarDao;
import com.rsy.IOC.annotation.AutoWired;
import com.rsy.IOC.annotation.Componet;

@Componet("carService")
public class CarService {
	@AutoWired("carDao")
	private CarDao carDao;
	
	public void receiveRequest(String car) {
		System.out.println("进行改装的车是 ：" + car);
		carDao.receiveRequest(car);
	}
}
