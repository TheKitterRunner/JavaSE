package com.rsy.observer2;

import java.util.Observable;

/**
 * 被观察者
 *      游戏用户:准备和启动的方法都在GamePlayer的类里面,先
 * @author Nico
 * @createDate 2018年8月1日 下午7:27:01
 */
public class GamePlayer extends Observable {

	private String name;
	
	public GamePlayer(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "player [name : " + this.name + "]";
	}
	/**
	 * 进度条读取完成，等待玩家进入游戏，就可以开始游戏
	 */
	public void ready(){
//		System.out.println(name + " Is Ready");
		// 加载游戏也需要等待
		//  子线程都是并发的来ready的
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setChanged();  //改变数据，设置被改变过的数据信息
		this.notifyObservers();  //通知服务器
	}
	/**
	 * 开始游戏
	 */
	public void gameStart(){
		System.out.println("开始游戏:敌军还有5秒到达战场");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
