package coffee;

import coffee.receipts.EspressoReceipt;
import coffee.receipts.Receipt;
import com.google.inject.Guice;

public class Main {
  public static void main(String[] args) {
    Receipt receipt = Guice.createInjector(new Module()).getInstance(EspressoReceipt.class);

    receipt.fillBeans(new Beans(400));
    Coffee coffee = receipt.makeCoffee();
    System.out.println(coffee);
  }
}
