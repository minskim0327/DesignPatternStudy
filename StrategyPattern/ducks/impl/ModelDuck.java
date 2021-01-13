package StrategyPattern.ducks.impl;

import StrategyPattern.behaviors.fly.impl.FlyNoWay;
import StrategyPattern.behaviors.quack.impl.Quack;
import StrategyPattern.ducks.IDuck;

public class ModelDuck extends IDuck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }
  @Override
  public void display() {
    System.out.println("I'm a model duck");

  }
  
}
