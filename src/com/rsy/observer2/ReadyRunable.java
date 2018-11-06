package com.rsy.observer2;
/**
 *  进入游戏的线程
 * 
 * @author Nico
 * @createDate 2018年8月1日 下午8:27:14
 */
public class ReadyRunable implements Runnable {
	
	private GamePlayer gameplayer;
	
	public ReadyRunable(GamePlayer gameplayer) {
		this.gameplayer = gameplayer;
	}
	@Override
	public void run() {
		gameplayer.ready();
		
	}

}
