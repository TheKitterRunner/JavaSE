package com.rsy.homework.collection.Exam_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *  老师的Demo
 * @author Nico
 * @CreateDate 2018年8月12日 下午9:15:26
 */
public class TestCard2 {
	public static void main(String[] args) {
		String[] cardColor = {"黑桃","红桃","梅花","方块"};
		String[] figures = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		List<String> cardList = new ArrayList<>();
		for (int i = 0; i < cardColor.length; i++) {
			for (int j = 0; j < figures.length; j++) {
				cardList.add(cardColor[i] + figures[j]);
			}
		}
		cardList.add("大王");
		cardList.add("小王");
		//此时牌堆里54张牌
		//洗牌操作
		Collections.shuffle(cardList);
		//将洗好的牌发出去,分为3个玩家
		List<String> player1 = new ArrayList<>();
		List<String> player2 = new ArrayList<>();
		List<String> player3 = new ArrayList<>();
		List<String> new_player1 = new ArrayList<>();
		List<String> new_player2 = new ArrayList<>();
		List<String> new_player3 = new ArrayList<>();
		for (int i = 0 ;i < cardList.size();i++) {
			//3人依次摸牌
			if (i % 3 == 0) {
				player1.add(cardList.get(i));
			} else if (i % 3 == 1) {
				player2.add(cardList.get(i));
			} else {
				player3.add(cardList.get(i));
			}
		}
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		new_player1 = sort(player1);
		new_player2 = sort(player2);
		new_player3 = sort(player3);
		System.out.println(new_player1);
		System.out.println(new_player2);
		System.out.println(new_player3);
	}
	
	//提供一个方法,对List里面的元素进行排序
	//按照大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3的顺序进行排列
	public static List<String> sort(List<String> list) {
		List<String> newList = new ArrayList<>();
		newList.addAll(select(list, "大王"));
		newList.addAll(select(list, "小王"));
		newList.addAll(select(list, "2"));
		newList.addAll(select(list, "A"));
		newList.addAll(select(list, "K"));
		newList.addAll(select(list, "Q"));
		newList.addAll(select(list, "J"));
		newList.addAll(select(list, "10"));
		newList.addAll(select(list, "9"));
		newList.addAll(select(list, "8"));
		newList.addAll(select(list, "7"));
		newList.addAll(select(list, "6"));
		newList.addAll(select(list, "5"));
		newList.addAll(select(list, "4"));
		newList.addAll(select(list, "3"));
		return newList;
	}
	
	public static List<String> select (List<String> list,String figure) {
		List<String> newList = new ArrayList<>();
		for (int i = 0;i < list.size();i++) {
			if (list.get(i).contains(figure)) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
}

