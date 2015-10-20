package coffee;

public class Coffee extends Water {
  int coffeeGrams;

  public Coffee(Water water, GroundBeans groundBeans) {
    super(water);
    coffeeGrams = groundBeans.grams;
  }

  @Override
  public String toString() {
    return "Coffee{" +
        "coffeeGrams=" + coffeeGrams +
        '}';
  }
}
