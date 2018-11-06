package com.rsy.IOC.DAO;

import com.rsy.IOC.annotation.Componet;

/**
 * 持久层
 * 		专门操作数据（采购）
*@author Nico
*2018年7月28日上午11:27:24
*/
@Componet("helloDao")
public class HelloDao {
	public void recieveRequest(String food){
		System.out.println("去市场采购：" + food);
	}
}
