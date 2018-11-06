package com.rsy.thread.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class GameTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建游戏对象
		GameService gameService = new GameService("LOL");
		
		//创建要加入游戏的玩家
		Player p1 = new Player("Nico1", gameService);
		Player p2 = new Player("Nico2", gameService);
		Player p3 = new Player("Nico3", gameService);
		Player p4 = new Player("Nico4", gameService);
		Player p5 = new Player("Nico5", gameService);
		Player p6 = new Player("Nico6", gameService);
		Player p7 = new Player("Nico7", gameService);
		Player p8 = new Player("Nico8", gameService);
		Player p9 = new Player("Nico9", gameService);
		Player p10 = new Player("Nico10", gameService);
		
		//给每个player创建一个FutureTask	
		FutureTask<Boolean> task1 = new FutureTask<Boolean>(p1);
		FutureTask<Boolean> task2 = new FutureTask<Boolean>(p2);
		FutureTask<Boolean> task3 = new FutureTask<Boolean>(p3);
		FutureTask<Boolean> task4 = new FutureTask<Boolean>(p4);
		FutureTask<Boolean> task5 = new FutureTask<Boolean>(p5);
		FutureTask<Boolean> task6 = new FutureTask<Boolean>(p6);
		FutureTask<Boolean> task7 = new FutureTask<Boolean>(p7);
		FutureTask<Boolean> task8 = new FutureTask<Boolean>(p8);
		FutureTask<Boolean> task9 = new FutureTask<Boolean>(p9);
		FutureTask<Boolean> task10 = new FutureTask<Boolean>(p10);
		
		//开启线程,加载游戏
		new Thread(task1).start();
		new Thread(task2).start();
		new Thread(task3).start();
		new Thread(task4).start();
		new Thread(task5).start();
		new Thread(task6).start();
		new Thread(task7).start();
		new Thread(task8).start();
		new Thread(task9).start();
		new Thread(task10).start();
		
		//所有Player加载成功后才能开始游戏
//		if (task1.get() && task2.get() && task3.get() && task4.get() && task5.get() 
//			&& task6.get() && task7.get() && task8.get() && task9.get() && task10.get()) {
//			gameService.start();
//		}
		if(task1.get()){
			gameService.start();
		}
		if(task2.get()){
			gameService.start();
		}
		if(task3.get()){
			gameService.start();
		}
		if(task4.get()){
			gameService.start();
		}
		if(task5.get()){
			gameService.start();
		}
		if(task6.get()){
			gameService.start();
		}
		if(task7.get()){
			gameService.start();
		}
		if(task8.get()){
			gameService.start();
		}
		if(task9.get()){
			gameService.start();
		}
		if(task10.get()){
			gameService.start();
		}
	}
}
