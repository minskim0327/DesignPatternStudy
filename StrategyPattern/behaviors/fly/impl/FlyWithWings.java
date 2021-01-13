package StrategyPattern.behaviors.fly.impl;

import StrategyPattern.behaviors.fly.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

  @Override
  public void fly() {
    System.out.println("Flying!!");
  }
  
}
