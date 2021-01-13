package StrategyPattern.ducks.impl;

import StrategyPattern.behaviors.fly.impl.FlyWithWings;
import StrategyPattern.behaviors.quack.impl.Quack;
import StrategyPattern.ducks.Duck;

public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am MallardDuck");
  }
}
