package StrategyPattern.behaviors.quack;

public class MuteQuack implements IQuackBehavior { 
  @Override 
  public void quack() {
    System.out.println("<< Silence >>"); 
  }
}