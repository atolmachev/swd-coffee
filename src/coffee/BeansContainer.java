package coffee;

public class BeansContainer {
  private Beans beans = Beans.noBeans();

  public void fillBeans(Beans beans) {
    this.beans.add(beans);
  }

  public Beans dispenseBeans(int grams) {
    return beans.pourOff(grams);
  }
}
