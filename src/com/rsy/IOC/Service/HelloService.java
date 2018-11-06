package com.rsy.IOC.Service;

import com.rsy.IOC.DAO.HelloDao;
import com.rsy.IOC.annotation.AutoWired;
import com.rsy.IOC.annotation.Componet;

/**
 * 服务层
 *		专门处理业务逻辑 
*@author Nico
*2018年7月28日上午11:24:10
*/
@Componet("helloService")
public class HelloService {
	
	@AutoWired("helloDao")
	private HelloDao helloDao;
	
	public void recieveRequest(String food ){	
		System.out.println("根据请求选择炒菜 :" + food);
		helloDao.recieveRequest(food);
	}
}
