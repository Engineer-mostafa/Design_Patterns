package com.inhanceYself.strategyPattern;

public class BlueDuck extends Duck{
	
	
	public BlueDuck() {
		super();
		myBehaviourOfFlying = new FlyWithWings();
		myBehaviourOfSwimming = new SwimInSea();
	}

	@Override
	protected String display() {
		
		return "Hey, am Blue " + this.getName();
	}

}
