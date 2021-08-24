package com.inhanceYself.strategyPattern;


public abstract class Duck {
	
	private int id;
	private String name;
	private static int counter = 0;
	FlyBehaviour myBehaviourOfFlying;
	SwimBehaviour myBehaviourOfSwimming;
	
	public Duck() {
		setId(counter++);
		setName("Duck #" + id);
	}

	
	
	protected abstract String display();
	
	
	public void perform() {
		System.out.println("Hey, i am " + this.name);
		System.out.println(this.myBehaviourOfSwimming.swim());
		System.out.println(this.display());
		System.out.println(this.myBehaviourOfFlying.fly());
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
