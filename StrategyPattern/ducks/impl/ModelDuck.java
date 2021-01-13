package StrategyPattern.ducks.impl;

import StrategyPattern.behaviors.fly.impl.FlyNoWay;
import StrategyPattern.behaviors.quack.impl.Quack;
import StrategyPattern.ducks.Duck;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");

  }
  
}
