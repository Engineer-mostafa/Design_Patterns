package com.inhanceYself.strategyPattern;

public class MyApp {

	public static void main(String[] args) {
		
		Duck flyableDuck = new BlueDuck();
		flyableDuck.perform();
		
		System.out.println("------------------------------------");
		
		Duck duckThatCantFlyDuck = new WoodDuck();
		duckThatCantFlyDuck.perform();
		
		System.out.println("------------Befor Shotting-------------");

		Duck shottedDuck = new ShottedDuck();
		shottedDuck.perform();
		System.out.println("--------------- After shotting -------------");
		((ShottedDuck)shottedDuck).gotShotted();
		shottedDuck.perform();

		
	}

}
