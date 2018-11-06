package com.rsy.practice.IOC.Service;

import com.rsy.practice.IOC.Annotation.AutoWired;
import com.rsy.practice.IOC.Annotation.Componet;
import com.rsy.practice.IOC.Dao.CarDao;
/**
 * 服务层：service
 *    专门用来处理业务逻辑
 * @author Nico
 * @CreateDate 2018年8月22日 下午5:58:27
 */
@Componet("carService")
public class CarService{
	
	@AutoWired
	public CarDao carDao;
	
	public void receiveRequest(String car){
		System.out.println("进行改装的车是 :" + car );
		carDao.receiveRequest(car);;
	}
}
