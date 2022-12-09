package org.example.dagger;

import dagger.Component;
import org.example.car.Driver;
import org.example.car.PetrolEngine;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DriverModule.class})
public interface DriverComponent {
    CarComponent.Builder getCarComponentBuilder();

}
