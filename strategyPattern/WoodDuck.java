package com.inhanceYself.strategyPattern;

public class WoodDuck extends Duck{
	
	public WoodDuck() {
		super();
		myBehaviourOfFlying = new NoFly();
		myBehaviourOfSwimming = new SwimInPool();

	}
	
	@Override
	public String display() {
		
	return "Hey, am Wood " + this.getName();

	}

}
