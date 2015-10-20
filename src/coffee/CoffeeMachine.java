package coffee;

import coffee.receipts.Receipt;

public class CoffeeMachine {


  Coffee makeCoffee(Receipt receipt) {
    return receipt.makeCoffee();
  }
}
