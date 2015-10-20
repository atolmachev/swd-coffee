package coffee;

public class FixedVolumeWaterProvider extends WaterProvider {
  int milliliters = 1000;

  @Override
  public Water getWater(int milliliters) {
    System.out.println("Using fixed water provider");
    this.milliliters -= milliliters;
    return new Water(milliliters, 20);
  }
}
