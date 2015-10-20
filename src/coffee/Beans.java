package coffee;

public class Beans {
  public int grams;

  public Beans(int grams) {
    this.grams = grams;
  }

  public static Beans inGrams(int grams) {
    return new Beans(grams);
  }

  public static Beans noBeans() {
    return inGrams(0);
  }

  public Beans add(Beans beans) {
    this.grams += beans.grams;
    return this;
  }

  public Beans pourOff(int grams) {
    if (grams > this.grams) throw new IllegalStateException("not enough beans to pour off");
    this.grams -= grams;
    return new Beans(grams);
  }
}
