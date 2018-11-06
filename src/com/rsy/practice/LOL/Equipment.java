package com.rsy.practice.LOL;
/**
 *   英雄的装备类
 * @author Nico
 * @createDate 2018年8月3日 下午12:53:22
 */
public class Equipment {
	   //装备名称
		private String equipmentName;
		//装备价格
		private int price;
		//装备描述
		private String description;
		//提升攻击力
		private int ariseOffensivePower;
		//提升血量值
		private double ariseBloodVolue;
		//暴击率
		private double doubleDamageRate;
		//减少伤害址
		private double decreaseDamage;
				
		//所有属性的构造器
		public Equipment(String equipmentName, int price, String description, int ariseOffensivePower,
				double ariseBloodVolue, double doubleDamageRate, double decreaseDamage) {
			this.equipmentName = equipmentName;
			this.price = price;
			this.description = description;
			this.ariseOffensivePower = ariseOffensivePower;
			this.ariseBloodVolue = ariseBloodVolue;
			this.doubleDamageRate = doubleDamageRate;
			this.decreaseDamage = decreaseDamage;
		}
		public String getEquipmentName() {
			return equipmentName;
		}
		public void setEquipmentName(String equipmentName) {
			this.equipmentName = equipmentName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getAriseOffensivePower() {
			return ariseOffensivePower;
		}
		public void getAriseOffensivePower(int ariseOffensivePower) {
			this.ariseOffensivePower = ariseOffensivePower;
		}
		public double getAriseBloodVolue() {
			return ariseBloodVolue;
		}
		public void setAriseBloodVolue(double ariseBloodVolue) {
			this.ariseBloodVolue = ariseBloodVolue;
		}
		public double getDoubleDamageRate() {
			return doubleDamageRate;
		}
		public void setDoubleDamageRate(double doubleDamageRate) {
			this.doubleDamageRate = doubleDamageRate;
		}
		public double getDecreaseDamage() {
			return decreaseDamage;
		}
		public void setDecreaseDamage(double decreaseDamage) {
			this.decreaseDamage = decreaseDamage;
		}

}
