package coffee;

import javax.inject.Singleton;

@Singleton
public class UnlimitedWaterProvider extends WaterProvider {

  @Override
  public Water getWater(int milliliters) {
    System.out.println(this.hashCode());
    return new Water(milliliters, 20);
  }
}
