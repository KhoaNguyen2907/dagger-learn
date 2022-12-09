package org.example.dagger;

import dagger.Module;
import dagger.Provides;
import org.example.car.Rim;
import org.example.car.Tires;
import org.example.car.Wheels;

@Module
public class WheelsModule {
    @Provides
    Rim provideRim(){
        return new Rim();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    Wheels provideWheels(Rim rim, Tires tires){
        return new Wheels(rim,tires);
    }
}
