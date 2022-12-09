package org.example;

import org.example.car.Car;
import org.example.car.PetrolEngine;
import org.example.dagger.CarComponent;
import org.example.dagger.DieselEngineModule;
import org.example.dagger.PetrolEngineModule;

import javax.inject.Inject;

public class CarService {
    @Inject
    Car car1;

    @Inject
    Car car2;

    public void driveCar(){
        // Singleton scope test
//        CarComponent carComponent1 = CarComponentProvider.GET_INSTANCE();
//        CarComponent carComponent2 = CarComponentProvider.GET_INSTANCE();
//
//        car1 = carComponent1.getCar();
//        car2 = carComponent2.getCar();
//
//        car1.drive();
//        car2.drive();

        // DriverScope: Both Car component use the same Driver component
        // because they are in the same scope @DriverScope which mean
        // they use the same Driver component instance
        // Car change but Driver don't;

        //Subcomponent: Subcomponent just only called from its parents component.
        // This is the second way to connect 2 component instead of using dependencies in component.

        CarComponent carComponent1 = DriverComponentProvider.GET_INSTANCE().getCarComponentBuilder().capacity(3).horsePower(8).build();
        CarComponent carComponent2 = DriverComponentProvider.GET_INSTANCE().getCarComponentBuilder().capacity(4).horsePower(10).build();

        car1 = carComponent1.getCar();
        car2 = carComponent2.getCar();

        car1.drive();
        car2.drive();


    }
}
