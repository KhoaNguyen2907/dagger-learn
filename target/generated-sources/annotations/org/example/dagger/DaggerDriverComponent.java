package org.example.dagger;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.example.CarService;
import org.example.CarService_MembersInjector;
import org.example.car.Car;
import org.example.car.Car_Factory;
import org.example.car.DieselEngine;
import org.example.car.DieselEngine_Factory;
import org.example.car.Driver;
import org.example.car.Rim;
import org.example.car.Tires;
import org.example.car.Wheels;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerDriverComponent {
  private DaggerDriverComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static DriverComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    public DriverComponent build() {
      return new DriverComponentImpl();
    }
  }

  private static final class CarComponentBuilder implements CarComponent.Builder {
    private final DriverComponentImpl driverComponentImpl;

    private Integer horsePower;

    private Integer capacity;

    private CarComponentBuilder(DriverComponentImpl driverComponentImpl) {
      this.driverComponentImpl = driverComponentImpl;
    }

    @Override
    public CarComponentBuilder horsePower(int horsePower) {
      this.horsePower = Preconditions.checkNotNull(horsePower);
      return this;
    }

    @Override
    public CarComponentBuilder capacity(int capacity) {
      this.capacity = Preconditions.checkNotNull(capacity);
      return this;
    }

    @Override
    public CarComponent build() {
      Preconditions.checkBuilderRequirement(horsePower, Integer.class);
      Preconditions.checkBuilderRequirement(capacity, Integer.class);
      return new CarComponentImpl(driverComponentImpl, new WheelsModule(), horsePower, capacity);
    }
  }

  private static final class CarComponentImpl implements CarComponent {
    private final DriverComponentImpl driverComponentImpl;

    private final CarComponentImpl carComponentImpl = this;

    private Provider<Integer> horsePowerProvider;

    private Provider<Integer> capacityProvider;

    private Provider<DieselEngine> dieselEngineProvider;

    private Provider<Rim> provideRimProvider;

    private Provider<Tires> provideTiresProvider;

    private Provider<Wheels> provideWheelsProvider;

    private Provider<Car> carProvider;

    private CarComponentImpl(DriverComponentImpl driverComponentImpl,
        WheelsModule wheelsModuleParam, Integer horsePowerParam, Integer capacityParam) {
      this.driverComponentImpl = driverComponentImpl;

      initialize(wheelsModuleParam, horsePowerParam, capacityParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final WheelsModule wheelsModuleParam, final Integer horsePowerParam,
        final Integer capacityParam) {
      this.horsePowerProvider = InstanceFactory.create(horsePowerParam);
      this.capacityProvider = InstanceFactory.create(capacityParam);
      this.dieselEngineProvider = DieselEngine_Factory.create(horsePowerProvider, capacityProvider);
      this.provideRimProvider = WheelsModule_ProvideRimFactory.create(wheelsModuleParam);
      this.provideTiresProvider = WheelsModule_ProvideTiresFactory.create(wheelsModuleParam);
      this.provideWheelsProvider = WheelsModule_ProvideWheelsFactory.create(wheelsModuleParam, provideRimProvider, provideTiresProvider);
      this.carProvider = DoubleCheck.provider(Car_Factory.create(((Provider) dieselEngineProvider), provideWheelsProvider, driverComponentImpl.provideDriverProvider));
    }

    @Override
    public Car getCar() {
      return carProvider.get();
    }

    @Override
    public void inject(CarService carService) {
      injectCarService(carService);
    }

    @CanIgnoreReturnValue
    private CarService injectCarService(CarService instance) {
      CarService_MembersInjector.injectCar1(instance, carProvider.get());
      CarService_MembersInjector.injectCar2(instance, carProvider.get());
      return instance;
    }
  }

  private static final class DriverComponentImpl implements DriverComponent {
    private final DriverComponentImpl driverComponentImpl = this;

    private Provider<Driver> provideDriverProvider;

    private DriverComponentImpl() {

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideDriverProvider = DoubleCheck.provider(DriverModule_ProvideDriverFactory.create());
    }

    @Override
    public CarComponent.Builder getCarComponentBuilder() {
      return new CarComponentBuilder(driverComponentImpl);
    }
  }
}
