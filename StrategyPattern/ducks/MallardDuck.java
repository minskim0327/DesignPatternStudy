package StrategyPattern.ducks;

import StrategyPattern.behaviors.fly.FlyWithWings;
import StrategyPattern.behaviors.quack.Quack;

public class MallardDuck extends IDuck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am MallardDuck");
  }
}
