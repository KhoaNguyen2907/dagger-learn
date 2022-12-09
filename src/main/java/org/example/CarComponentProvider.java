package org.example;

import org.example.dagger.CarComponent;

public class CarComponentProvider {
private static CarComponent carComponent;

private CarComponentProvider(){
}

//public static CarComponent GET_INSTANCE(){
////    if (carComponent == null){
////        carComponent = DaggerCarComponent.builder().capacity(4).horsePower(10).driverComponent(DriverComponentProvider.GET_INSTANCE()).build();
////    }
////    return carComponent;
//}

}
