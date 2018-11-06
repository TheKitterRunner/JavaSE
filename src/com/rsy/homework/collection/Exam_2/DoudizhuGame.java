package com.rsy.homework.collection.Exam_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2.写一个可以给斗地主玩家随机发牌的程序。
	a：牌可以随机发给三个玩家
	b：在控制台打印每个玩家的牌。
	c：对每个玩家手中的牌按照大小排序。
	牌的花色："♠", "♥", "♣", "♦"  思路：
			创建一个容器存储所有的牌，再创建三个容器分别表示三个用户的牌，三个用户轮流从第一个容器中取牌，剩下三张为底牌。
			把大王和小王也算进去。可以封装一个类表示牌 
 * @author Nico
 * @CreateDate 2018年8月12日 下午8:18:50
 */
public class DoudizhuGame {
	public static void main(String[] args) {
		// 构建一个存放花色的字符串数组
		String[] flowerColor = {"♠", "♥", "♣", "♦"};
		// 构建一个存放牌大小的字符串数组
		String[] cardNumber = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		// 创建一个Map来存放花色和数字的组合（将花色和数字拼接成字符串）
		List<String> cardList = new ArrayList<String>();
		// 将牌的组合添加到List中
		for (int i = 0; i < flowerColor.length; i++) {
			for (int j = 0; j < cardNumber.length; j++) {
				cardList.add(flowerColor[i] + cardNumber[j]);
			}
		}
		// 将大小王添加到 List中
		cardList.add("大王");
		cardList.add("小王");
		// 发牌之前先将54张牌洗牌
		Collections.shuffle(cardList);
		// 新建三个玩家的
		List<String> player1 = new ArrayList<>();
		List<String> player2 = new ArrayList<>();
		List<String> player3 = new ArrayList<>();
		// 再将洗好的牌按照循环发给三个玩家
		for (int i = 0; i < cardList.size() - 3; i++) {
			if (i % 3 == 0) {
				player1.add(cardList.get(i));
			}else if (i % 3 == 1) {
				player2.add(cardList.get(i));
			}else {
				player3.add(cardList.get(i));
			}
		}
		// 新建三个list,用来接收每个玩家排好序的牌
		List<String> shufflePlayer1 = new ArrayList<String>();
		List<String> shufflePlayer2 = new ArrayList<String>();
		List<String> shufflePlayer3 = new ArrayList<String>();
		// 将发好的牌进行排序
		shufflePlayer1 = sorting(player1);
		shufflePlayer2 = sorting(player2);
		shufflePlayer3 = sorting(player3);
		// 打印输出排好序的牌
		System.out.println(shufflePlayer1);
		System.out.println(shufflePlayer2);
		System.out.println(shufflePlayer3);
		//保留三张底牌
		System.out.println("底牌" + cardList.subList(cardList.size() - 3, cardList.size()));

	}
	//提供一个方法,对List里面的元素进行排序
	//按照     3,4,5,6,7,8,9,10,J,Q,K,A,2,小王,大王   的顺序进行排列
	// 注意：此排序的方法不包含花色的排序
	public static List<String> sorting(List<String> list){
		List<String> sortingList = new ArrayList<String>();
		sortingList.addAll(select(list, "3"));
		sortingList.addAll(select(list, "4"));
		sortingList.addAll(select(list, "5"));
		sortingList.addAll(select(list, "6"));
		sortingList.addAll(select(list, "7"));
		sortingList.addAll(select(list, "8"));
		sortingList.addAll(select(list, "9"));
		sortingList.addAll(select(list, "10"));
		sortingList.addAll(select(list, "J"));
		sortingList.addAll(select(list, "Q"));
		sortingList.addAll(select(list, "K"));
		sortingList.addAll(select(list, "A"));
		sortingList.addAll(select(list, "2"));
		sortingList.addAll(select(list, "小王"));
		sortingList.addAll(select(list, "大王"));
		
		return sortingList;
	}
	// 对传入的list中的元素含有指定字符的返回，并存在新的list中返回回去
	public static List<String> select (List<String> list,String figure) {
		List<String> selectList = new ArrayList<>();
		for (int i = 0;i < list.size();i++) {
			if (list.get(i).contains(figure)) {
				selectList.add(list.get(i)); // 把还有指定字符串的元素的所有信息添加到新的list中
			}
		}
		return selectList;
	}
	
}
