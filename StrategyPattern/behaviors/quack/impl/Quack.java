package StrategyPattern.behaviors.quack.impl;

import StrategyPattern.behaviors.quack.IQuackBehavior;

public class Quack implements IQuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack!!");
  }
  
}
