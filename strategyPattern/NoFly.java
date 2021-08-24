package com.inhanceYself.strategyPattern;

public class NoFly implements FlyBehaviour{

	@Override
	public String fly() {
		return "I can't Fly";
	}
}
