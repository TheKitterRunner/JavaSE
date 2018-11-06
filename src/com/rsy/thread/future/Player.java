package com.rsy.thread.future;

import java.util.concurrent.Callable;

public class Player implements Callable<Boolean>{

	private String name;
	private GameService gameService;
	
	public Player(String name,GameService gameService){
		this.name = name;
		this.gameService = gameService;
	}
	
	@Override
	public Boolean call() throws Exception {
		Thread.sleep(1000);
		System.out.println(this.name + "加载游戏.....");
		return true;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameService getGameService() {
		return gameService;
	}

	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

}
