package StrategyPattern;

import StrategyPattern.behaviors.fly.impl.FlyRocketPowered;
import StrategyPattern.ducks.Duck;
import StrategyPattern.ducks.impl.MallardDuck;
import StrategyPattern.ducks.impl.ModelDuck;

public class MiniDuckSimulater {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered()); 
    model.performFly();
  }
}
