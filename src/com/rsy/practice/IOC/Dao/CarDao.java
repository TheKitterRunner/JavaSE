package com.rsy.practice.IOC.Dao;

import com.rsy.practice.IOC.Annotation.Componet;

/**
 * 持久层
 * 		专门操作数据（采购）
 * @author Nico
 * @CreateDate 2018年8月22日 下午6:05:01
 */
@Componet("carDao")
public class CarDao {
	
	public void receiveRequest(String car){
		System.out.println("购买维修" + car + "的配件！");
	}
}
