package coffee;

import com.google.inject.Inject;

public class Boiler {
  @Inject WaterProvider waterProvider;
  @Inject WaterProvider reserveWaterProvider;
  Water water = Water.noWater();

  public Boiler boil(int milliliters) {
    if (water.milliliters < milliliters) {
      water.add(reserveWaterProvider.getWater((milliliters - water.milliliters)/2));
      water.add(waterProvider.getWater((milliliters - water.milliliters)/2));
    }
    if (water.milliliters == 0) throw new IllegalStateException("no water to boil");
    water.celsiusDegrees = 91;
    return this;
  }

  public Water getHotWater() {
    if (water.celsiusDegrees < 91) throw new IllegalStateException("Water temperature is %s degrees celsius. boil() me!");
    return water.pourOff();
  }
}
