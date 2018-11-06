package com.rsy.thread.future;
/**
 *   游戏的种类
 * @author Nico
 * @createDate 2018年8月6日 下午12:36:05
 */
public class GameService {

	private String name;
	/**
	 * 游戏的最大人数
	 */
	private final int CAPACITY = 10;
	private int count = 1;   //加入游戏的人数
	
	public GameService(String name) {
		this.name = name;
	}
	public void start(){
		if (this.count ++ == CAPACITY ) {
			System.out.println("比赛开始");
		}else{
			System.out.println("等待其他玩家加入.....");
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
