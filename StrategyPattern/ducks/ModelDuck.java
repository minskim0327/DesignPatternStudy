package StrategyPattern.ducks;

import StrategyPattern.behaviors.fly.FlyNoWay;
import StrategyPattern.behaviors.quack.Quack;

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
