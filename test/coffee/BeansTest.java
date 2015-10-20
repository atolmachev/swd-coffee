package coffee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeansTest {
  @Test
  public void enoughBeansToPoureOff() throws Exception {
    Beans beans = Beans.inGrams(10);
    Beans pouredOffBeans = beans.pourOff(5);
    assertEquals(5, pouredOffBeans.grams);
  }

  @Test(expected = IllegalStateException.class)
  public void notEnoughBeansToPoureOff() throws Exception {
    Beans beans = Beans.inGrams(10);
    beans.pourOff(15);
  }

  @Test
  public void addBeans() throws Exception {
    Beans beans = Beans.inGrams(10);
    beans.add(new Beans(5));
    assertEquals(15, beans.grams);
  }
}