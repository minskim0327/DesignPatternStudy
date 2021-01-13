package StrategyPattern.ducks;

import StrategyPattern.behaviors.fly.IFlyBehavior;
import StrategyPattern.behaviors.quack.IQuackBehavior;

public abstract class IDuck {
  protected IFlyBehavior flyBehavior;
  protected IQuackBehavior quackBehavior;

  public IDuck() {
  }

  public void setFlyBehavior(IFlyBehavior fb) {
    this.flyBehavior = fb;
  }

  public void setQuackBehavior(IQuackBehavior qb) {
    this.quackBehavior = qb;
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks can fly");
  }
}