package org.example.dagger;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;
import org.example.CarService;
import org.example.car.Car;
import org.example.car.DriverScope;

import javax.inject.Named;
import javax.inject.Singleton;

@DriverScope
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(CarService carService);

    @Subcomponent.Builder
    interface Builder {

        CarComponent build();

        @BindsInstance
        Builder horsePower(@Named("hp") int horsePower);

        @BindsInstance
        Builder capacity(@Named("cp") int capacity);

    }
}
