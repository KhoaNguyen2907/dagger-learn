package org.example.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import org.example.car.DieselEngine;
import org.example.car.IEngine;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract IEngine bindEngine(DieselEngine engine);
}
