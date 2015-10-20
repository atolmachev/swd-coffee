package coffee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterTest {
  @Test
  public void enoughWaterToPoureOff() throws Exception {
    Water water = new Water(100, 25);
    Water pouredOffWater = water.pourOff();
    assertEquals(100, pouredOffWater.milliliters);
    assertEquals(25, pouredOffWater.celsiusDegrees);
    assertEquals(0, water.milliliters);
  }

  @Test
  public void addWater() throws Exception {
    Water water = new Water(100, 50);
    water.add(new Water(100, 30));
    assertEquals(200, water.milliliters);
    assertEquals(40, water.celsiusDegrees);
  }
}