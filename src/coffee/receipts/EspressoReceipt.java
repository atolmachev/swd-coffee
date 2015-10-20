package coffee.receipts;

import coffee.*;

public class EspressoReceipt extends Receipt {

  @Override
  public Coffee makeCoffee() {
    Beans beans = beansContainer.dispenseBeans(7);
    GroundBeans groundBeans = mill.mill(beans);
    Water hotWater = boiler.boil(30).getHotWater();
    return new Coffee(hotWater, groundBeans);
  }
}
