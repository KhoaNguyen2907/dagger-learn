package org.example.dagger;

import dagger.Module;
import dagger.Provides;
import org.example.car.Driver;

import javax.inject.Singleton;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
