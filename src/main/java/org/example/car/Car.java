package org.example.car;

import javax.inject.Inject;
import javax.inject.Singleton;

@DriverScope
public class Car {
    private Driver driver;
    private IEngine engine ;
    private Wheels wheels;

    @Inject
    public Car (IEngine engine, Wheels wheels, Driver driver){
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive(){
        engine.getEngineInfo();
        System.out.println(driver + " Driving ..." + this);
    }
}
