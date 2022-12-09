package org.example.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import org.example.car.DieselEngine;
import org.example.car.IEngine;
import org.example.car.PetrolEngine;

import javax.inject.Named;

@Module
public class PetrolEngineModule {
    private int horsePower;
    private int capacity;
    public PetrolEngineModule(int horsePower, int capacity){
        this.horsePower = horsePower;
        this.capacity = capacity;
    }


    @Provides
    @Named("hp")
   int provideHorsePower(){
        return this.horsePower;
    }
//
    @Provides
    @Named("cp")
    int provideCapacity(){
        return this.capacity;
    }
//
    @Provides
    IEngine provideEngine(PetrolEngine engine){
        return engine;
    }
}
