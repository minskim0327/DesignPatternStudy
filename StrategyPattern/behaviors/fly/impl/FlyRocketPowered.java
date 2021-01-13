package StrategyPattern.behaviors.fly.impl;

import StrategyPattern.behaviors.fly.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {
  @Override
  public void fly() {
    System.out.println("I’m flying with a rocket!"); 
  }
}