package StrategyPattern.behaviors.quack.impl;

import StrategyPattern.behaviors.quack.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
  @Override 
  public void quack() {
    System.out.println("<< Silence >>"); 
  }
}