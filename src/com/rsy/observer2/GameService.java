package com.rsy.observer2;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 *     观察者模式-----(观察者-->游戏服务器) 
 *     当被观察者执行了notifyObservers()方法后,会执行update()方法
 *     为什么要使用Vector(),而不是ArrayList,因为Vector是线程安全的;
 *   //每次在添加元素的时候,都是添加完成后再进行下一步,这里的update会出现并发
 *   一旦出并发,在添加玩家的时候就有可能添加只执行到某一步,这样就更改了ArrayList的长度,还没来得及给最后的下标赋值;
 *   这种情况下,主线程继续往下执行,在57行代码传递的gamePlayer有可能是null !//
 * @author Nico
 * @createDate 2018年8月1日 下午7:25:54
 */
public class GameService implements Observer{

	private String name;
	private List<GamePlayer> players = new Vector<GamePlayer>();
	private volatile int state = 0;  // 0 : 未开始   ; 1 :开始
	
	public GameService(String name) {
		this.name = name;
	}
	
	/**
	 * 通知
	 */
	@Override
	public void update(Observable o, Object arg) {
		/**
		 * 多个用户发送消息到服务器的时候，最多会产生10个(1-10个不等)并发
		 * 都执行到当前代码行时，每个size判断都会是10，那么最多会通知10次游戏开始
		 * 所以需要做一个游戏开关
		 */
		//将被观察者转型成GamePlayer
		GamePlayer gp = (GamePlayer) o;
		//将被观察者添加到List集合中
		players.add(gp);  // 这里的异步操做有坑
		System.out.println( this.name + " " + o +" 准备好了" + players.size());
			
		//判断集合长度有没有达到10
		if (players.size() == 10 && this.state == 0) {
				this.notifyplayer();
		}
		
	}

	private synchronized void notifyplayer() {
		
		if( players.size() == 1 || players.size() < 10){
			return;
		}
		//通知所有的用户进入游戏
		for(GamePlayer gamePlayer : players){
			new Thread(new NotifyRunnable(gamePlayer)).start();
		}
		this.state = 1 ;
	}
}
