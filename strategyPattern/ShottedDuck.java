package com.inhanceYself.strategyPattern;

public class ShottedDuck extends Duck{

	public ShottedDuck() {
		super();
		myBehaviourOfFlying = new FlyWithWings();
		myBehaviourOfSwimming = new SwimInPool();
}
	@Override
	protected String display() {
		return "Hey am a Shotted Duck";
	}
	
	public void gotShotted() {
		this.myBehaviourOfFlying = new NoFly();
	}

}
