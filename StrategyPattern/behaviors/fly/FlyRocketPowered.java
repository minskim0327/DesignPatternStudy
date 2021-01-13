package StrategyPattern.behaviors.fly;

public class FlyRocketPowered implements IFlyBehavior {
  @Override
  public void fly() {
    System.out.println("I’m flying with a rocket!"); 
  }
}