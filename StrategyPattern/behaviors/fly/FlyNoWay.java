package StrategyPattern.behaviors.fly;

public class FlyNoWay implements IFlyBehavior {
	@Override
	public void fly() {
    System.out.println("Can't Fly!");		
	}
}
