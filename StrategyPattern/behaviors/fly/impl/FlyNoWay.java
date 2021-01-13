package StrategyPattern.behaviors.fly.impl;

import StrategyPattern.behaviors.fly.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
	@Override
	public void fly() {
    System.out.println("Can't Fly!");		
	}
}
