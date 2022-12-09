package org.example;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.example.car.Car;

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
public final class CarService_MembersInjector implements MembersInjector<CarService> {
  private final Provider<Car> car1Provider;

  private final Provider<Car> car2Provider;

  public CarService_MembersInjector(Provider<Car> car1Provider, Provider<Car> car2Provider) {
    this.car1Provider = car1Provider;
    this.car2Provider = car2Provider;
  }

  public static MembersInjector<CarService> create(Provider<Car> car1Provider,
      Provider<Car> car2Provider) {
    return new CarService_MembersInjector(car1Provider, car2Provider);
  }

  @Override
  public void injectMembers(CarService instance) {
    injectCar1(instance, car1Provider.get());
    injectCar2(instance, car2Provider.get());
  }

  @InjectedFieldSignature("org.example.CarService.car1")
  public static void injectCar1(CarService instance, Car car1) {
    instance.car1 = car1;
  }

  @InjectedFieldSignature("org.example.CarService.car2")
  public static void injectCar2(CarService instance, Car car2) {
    instance.car2 = car2;
  }
}
