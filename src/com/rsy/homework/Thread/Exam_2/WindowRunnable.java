package com.rsy.homework.Thread.Exam_2;

public class WindowRunnable implements Runnable {
	// 总的票数
	public static int totalTicket = 100;
	// 已经售卖的票数
	public static int count = 0;

	@Override
	public void run() {
		while (true) {
			if (totalTicket > 0) {
				count++;
				totalTicket--;
				System.out.println(
						Thread.currentThread().getName() + "售卖了一张票,总共售卖了" + count + "张票,还剩" + totalTicket + "张票");
			} else {
				break;
			}
		}
	}
}
