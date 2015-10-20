package coffee;

public class Mill {
  public GroundBeans mill(Beans beans) {
    return new GroundBeans(beans.grams);
  }
}
