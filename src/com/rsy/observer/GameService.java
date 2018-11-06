package com.rsy.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *     观察者模 式
 * 观察者
 *    游戏服务器 
 * @author Nico
 * @createDate 2018年8月1日 下午7:25:54
 */
public class GameService implements Observer{

	private String name;
	
	private List<GamePlayer> players = new ArrayList<GamePlayer>();
	
	public GameService(String name) {
		this.name = name;
	}
	
	/**
	 * 通知
	 */
	@Override
	public void update(Observable o, Object arg) {
		//将被观察者转型成GamePlayer
		GamePlayer gp = (GamePlayer) o;
		//将被观察者添加到List集合中
		players.add(gp);
		System.out.println( this.name + " " + o +" 准备好了");
		
		//判断集合长度有没有达到10
		if (players.size() == 10) {
			//通知所有的用户进入游戏
			for(GamePlayer gamePlayer : players){
				//通知也需要时间等待
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				gamePlayer.gameStart();
			}
		}
	}
	
}
