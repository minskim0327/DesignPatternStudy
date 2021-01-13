package StrategyPattern;

import StrategyPattern.behaviors.fly.impl.FlyRocketPowered;
import StrategyPattern.ducks.IDuck;
import StrategyPattern.ducks.impl.MallardDuck;
import StrategyPattern.ducks.impl.ModelDuck;

public class MiniDuckSimulater {
  public static void main(String[] args) {
    IDuck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    IDuck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered()); 
    model.performFly();
  }
}
