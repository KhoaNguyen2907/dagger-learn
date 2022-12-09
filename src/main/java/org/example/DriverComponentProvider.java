package org.example;

import org.example.dagger.DaggerDriverComponent;
import org.example.dagger.DriverComponent;

public class DriverComponentProvider {
    private static DriverComponent driverComponent;

    private DriverComponentProvider(){
    }

    public static DriverComponent GET_INSTANCE(){
        if (driverComponent == null){
            driverComponent = DaggerDriverComponent.create();
        }
        return driverComponent;
    }
}
