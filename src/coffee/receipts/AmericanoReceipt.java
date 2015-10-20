package coffee.receipts;

import coffee.Beans;
import coffee.Coffee;
import coffee.GroundBeans;
import coffee.Water;

public class AmericanoReceipt extends Receipt {
  @Override
  public Coffee makeCoffee() {
    Beans beans = beansContainer.dispenseBeans(7);
    GroundBeans groundBeans = mill.mill(beans);
    Water hotWater = boiler.boil(30).getHotWater();
    Coffee coffee = new Coffee(hotWater, groundBeans);
    coffee.add(boiler.boil(30).getHotWater());
    return coffee;
  }
}
