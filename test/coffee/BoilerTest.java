package coffee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BoilerTest {
  Boiler boiler = new Boiler();

  @Before
  public void setUp() throws Exception {
    boiler.waterProvider = mock(WaterProvider.class);
  }

  @Test(expected = IllegalStateException.class)
  public void cantBoilIfNoWater() throws Exception {
    when(boiler.waterProvider.getWater(anyInt())).thenReturn(Water.noWater());
    boiler.boil(100);
  }

  @Test
  public void providesHotWaterAfterBoiling() throws Exception {
    when(boiler.waterProvider.getWater(100)).thenReturn(new Water(100, 25));
    Water boiledWater = boiler.boil(100).getHotWater();
    assertEquals(100, boiledWater.milliliters);
    assertEquals(91, boiledWater.celsiusDegrees);
  }
}