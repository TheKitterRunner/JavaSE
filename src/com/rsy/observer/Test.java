package com.rsy.observer;

public class Test {
	public static void main(String[] args) {
		GameService service = new GameService("LOL");
		
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
		
		p1.ready();
		p2.ready();
		p3.ready();
		p4.ready();
		p5.ready();
		p6.ready();
		p7.ready();
		p8.ready();
		p9.ready();
		p10.ready();
	}
}
