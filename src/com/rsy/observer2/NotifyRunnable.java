package com.rsy.observer2;

public class NotifyRunnable implements Runnable {

	private GamePlayer player;
	
	public NotifyRunnable( GamePlayer player) {
		this.player = player;
	}
	
	@Override
	public void run() {
		//通知也需要时间等待
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		player.gameStart();
	}
	
}
