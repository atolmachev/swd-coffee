package coffee;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {
  @Override
  protected void configure() {
    bind(WaterProvider.class).to(UnlimitedWaterProvider.class);
  }
}
