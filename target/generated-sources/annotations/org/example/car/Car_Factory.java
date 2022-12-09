package org.example.car;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata("org.example.car.DriverScope")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Car_Factory implements Factory<Car> {
  private final Provider<IEngine> engineProvider;

  private final Provider<Wheels> wheelsProvider;

  private final Provider<Driver> driverProvider;

  public Car_Factory(Provider<IEngine> engineProvider, Provider<Wheels> wheelsProvider,
      Provider<Driver> driverProvider) {
    this.engineProvider = engineProvider;
    this.wheelsProvider = wheelsProvider;
    this.driverProvider = driverProvider;
  }

  @Override
  public Car get() {
    return newInstance(engineProvider.get(), wheelsProvider.get(), driverProvider.get());
  }

  public static Car_Factory create(Provider<IEngine> engineProvider,
      Provider<Wheels> wheelsProvider, Provider<Driver> driverProvider) {
    return new Car_Factory(engineProvider, wheelsProvider, driverProvider);
  }

  public static Car newInstance(IEngine engine, Wheels wheels, Driver driver) {
    return new Car(engine, wheels, driver);
  }
}
