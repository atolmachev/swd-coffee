package coffee.receipts;

import coffee.*;
import com.google.inject.Inject;

public abstract class Receipt {
  @Inject
  BeansContainer beansContainer;
  @Inject
  Mill mill;
  @Inject
  Boiler boiler;

  public abstract Coffee makeCoffee();

  public void fillBeans(Beans beans) {
    beansContainer.fillBeans(beans);
  }
}

