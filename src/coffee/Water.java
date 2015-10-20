package coffee;

public class Water {
  public int milliliters;
  public int celsiusDegrees;

  public Water() {}

  public Water(Water water) {
    this(water.milliliters, water.celsiusDegrees);
  }

  public Water(int milliliters, int celsiusDegrees) {
    this.milliliters = milliliters;
    this.celsiusDegrees = celsiusDegrees;
  }

  public Water add(Water water) {
    int volume = milliliters + water.milliliters;
    if (volume == 0) return this;
    int degrees = (celsiusDegrees * milliliters + water.celsiusDegrees * water.milliliters) / volume;
    this.milliliters = volume;
    this.celsiusDegrees = degrees;
    return this;
  }

  public Water pourOff() {
    Water water = new Water(milliliters, celsiusDegrees);
    milliliters = 0;
    return water;
  }

  static Water noWater() {
    return new Water();
  }
}
