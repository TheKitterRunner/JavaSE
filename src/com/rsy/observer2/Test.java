package com.rsy.observer2;

public class Test {
	public static void main(String[] args) {
		GameService service = new GameService("LOL");
		//  初始化10个玩家
		GamePlayer p1 = new GamePlayer("Nico 1");
		GamePlayer p2 = new GamePlayer("Nico 2");
		GamePlayer p3 = new GamePlayer("Nico 3");
		GamePlayer p4 = new GamePlayer("Nico 4");
		GamePlayer p5 = new GamePlayer("Nico 5");
		GamePlayer p6 = new GamePlayer("Nico 6");
		GamePlayer p7 = new GamePlayer("Nico 7");
		GamePlayer p8 = new GamePlayer("Nico 8");
		GamePlayer p9 = new GamePlayer("Nico 9");
		GamePlayer p10 = new GamePlayer("Nico 10");
		
		//主线程
		p1.addObserver(service);
		p2.addObserver(service);
		p3.addObserver(service);
		p4.addObserver(service);
		p5.addObserver(service);
		p6.addObserver(service);
		p7.addObserver(service);
		p8.addObserver(service);
		p9.addObserver(service);
		p10.addObserver(service);
		
		// 上面p1-p10先执行完再执行下面的字线程
		// 为了避免在游戏还没有添加到服务器的时候游戏已经开启了，这里暂停500ms,让用户都添加游戏
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 使用线程让每个用户分别去开启游戏，不用排队等待开启
		//子线程; .start()本来就是同步的,所以加载的时候进入代码块也是随机的
		new Thread(new ReadyRunable(p1)).start();
		new Thread(new ReadyRunable(p2)).start();
		new Thread(new ReadyRunable(p3)).start();
		new Thread(new ReadyRunable(p4)).start();
		new Thread(new ReadyRunable(p5)).start();
		new Thread(new ReadyRunable(p6)).start();
		new Thread(new ReadyRunable(p7)).start();
		new Thread(new ReadyRunable(p8)).start();
		new Thread(new ReadyRunable(p9)).start();
		new Thread(new ReadyRunable(p10)).start();

	}
}
