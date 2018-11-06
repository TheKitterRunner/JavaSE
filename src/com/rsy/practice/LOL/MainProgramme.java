package com.rsy.practice.LOL;


/**
 *   游戏的主进程
 * 
 * @author Nico
 * @createDate 2018年8月3日 上午11:29:30
 */
public class MainProgramme {
	public static void main(String[] args) {
		//准备开始Ban英雄
		System.out.println("请开始Ban英雄:");
		//实例化Team,获取到参加游戏的两支队伍
		Team teamBlue = new Team("Blue","Left",new Players[]{
					new Players("Blue王", "192.168.2.1", 30),
					new Players("Blue张", "192.168.2.2", 30),
					new Players("Blue李", "192.168.2.3", 30),
					new Players("Blue刘", "192.168.2.4", 30),
					new Players("Blue强", "192.168.2.5", 30,"最强王者")
		});
		
		Team teamRed = new Team("Red","Right",new Players[]{
				new Players("Red王", "192.168.2.6", 30),
				new Players("Red张", "192.168.2.7", 30),
				new Players("Red李", "192.168.2.8", 30),
				new Players("Red刘", "192.168.2.9", 30),
				new Players("Red强", "192.168.2.10", 30,"最强王者")
		});
		//为了两支队伍可以轮流ban英雄,先将两支队伍轮流循环成一个新的数组
		Players[] allPlayers = new Players[teamBlue.getPlayer().length + teamRed.getPlayer().length];
		
		for( int i = 0; i < allPlayers.length ; i ++){
			if ( i % 2 == 0) {
				allPlayers[i] = teamBlue.getPlayer()[i / 2];
			}else{
				allPlayers[i] = teamRed.getPlayer()[(i - 1) / 2];
			}
//			System.out.println(allPlayers[i]);
		}
		
		allPlayers[0].ban(new GameCharacter("蛮族之王", "泰达米尔"));
		allPlayers[1].ban(new GameCharacter("迅捷斥候", "提莫"));
		allPlayers[2].ban(new GameCharacter("诺克萨斯之手 ","德莱厄斯"));
		allPlayers[3].ban(new GameCharacter("影流之主", "儿童劫"));
		allPlayers[4].ban(new GameCharacter("疾风剑豪", "亚索"));
		allPlayers[5].ban(new GameCharacter("无极剑圣","易大师"));
		allPlayers[6].ban(new GameCharacter("盲僧","李青"));
		allPlayers[7].ban(new GameCharacter("诡术妖姬","乐芙兰"));
		allPlayers[8].ban(new GameCharacter("虚空掠夺者", "卡兹克"));
		allPlayers[9].ban(new GameCharacter("无双剑姬","菲奥娜"));		
		
		//准备开始选择英雄
		System.out.println("请开始pick您想要的英雄:");
		
		allPlayers[0].pick(new GameCharacter("武器大师", "贾克斯", 78, 598,
				new Skill[]{new Skill("Q", 65, 0),
						new Skill("W", 65, 0),
						new Skill("E", 65, 0),
						new Skill("R", 65, 0),
						new Skill("D", 65, 0),
						new Skill("F", 65, 0),}));
		allPlayers[1].pick(new GameCharacter("荒漠屠夫","雷克顿",79, 578,new Skill[]{}));
		allPlayers[2].pick(new GameCharacter("刀锋舞者", "艾瑞莉娅",77, 558,new Skill[]{}));
		allPlayers[3].pick(new GameCharacter("发条魔灵","奥莉安娜",59, 498,new Skill[]{}));
		allPlayers[4].pick(new GameCharacter("德玛西亚皇子","嘉文四世",78, 798,new Skill[]{}));
		allPlayers[5].pick(new GameCharacter("酒桶","古拉加斯",60, 538,new Skill[]{}));
		allPlayers[6].pick(new GameCharacter("风暴之怒","迦娜",50, 438,new Skill[]{}));
		allPlayers[7].pick(new GameCharacter("幻翎", "洛",60, 498,new Skill[]{}));
		allPlayers[8].pick(new GameCharacter("暗夜猎手", "薇恩",88, 398,new Skill[]{}));
		allPlayers[9].pick(new GameCharacter("逆羽", "霞",78, 498,new Skill[]{}));
		
//		for ( int i = 0 ; i < allPlayers.length ; i ++) {
//			System.out.println(allPlayers[i].getNickName() + "选择了" + allPlayers[i].getGameCharacter().getName()
//							+"[" + allPlayers[i].getGameCharacter().getRealName() +"]");
//		}
		System.out.println("====================================");
		for( Players player: allPlayers){
			System.out.println(player.getNickName() + "选择了" + player.getGameCharacter().getName() + 
					"[" + player.getGameCharacter().getRealName() + "]");
		}
		//执行两个英雄对打的方法
		//创建两个GameCharacter 的实例
		Players play1 = allPlayers[0]; GameCharacter gc1 = play1.getGameCharacter();
		Players play2 = allPlayers[1]; GameCharacter gc2 = play2.getGameCharacter();
	
		//初始化装备
		Equipment sword = new Equipment("多兰剑", 450, "一把宝剑", 8, 80, 0, 0);
		Equipment shield = new Equipment("多兰盾", 450, "护盾", 0, 80, 0, 8);
		//  通过buy 的方法让两个英雄拥有相应的装备
		gc1.buy(sword);
		gc2.buy(shield);
		// 上线对线的时候先实力秀一波(斗嘴)
		gc1.laughAt(gc2, "你真棒!");
		gc2.laughAt(gc1, "那你也很棒哦!");
		// 再开始对线,就是简单的对点,开始之前要判定被攻击的和攻击的对象的血量是不是为0,大于0才调用offensive 方法
		gc1.useSkillQ("Q", 65);
		System.out.println(gc1.getOffensivePower());
		
		while(true){
			if (gc1.getBloodVolume() > 0 ) {
				gc1.offensive(gc2);
			}else{
				break;
			}
			
			if (gc2.getBloodVolume() > 0 ) {
				gc2.offensive(gc1);
			}else{
				break;
			}
		}
		
		System.out.println(gc1.getRealName() + "对战后的血量为 : " + gc1.getBloodVolume());
		System.out.println(gc2.getRealName() + "对战后的血量为 : " + gc2.getBloodVolume());

	}
}
