package org.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.example.car.Rim;
import org.example.car.Tires;
import org.example.car.Wheels;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WheelsModule_ProvideWheelsFactory implements Factory<Wheels> {
  private final WheelsModule module;

  private final Provider<Rim> rimProvider;

  private final Provider<Tires> tiresProvider;

  public WheelsModule_ProvideWheelsFactory(WheelsModule module, Provider<Rim> rimProvider,
      Provider<Tires> tiresProvider) {
    this.module = module;
    this.rimProvider = rimProvider;
    this.tiresProvider = tiresProvider;
  }

  @Override
  public Wheels get() {
    return provideWheels(module, rimProvider.get(), tiresProvider.get());
  }

  public static WheelsModule_ProvideWheelsFactory create(WheelsModule module,
      Provider<Rim> rimProvider, Provider<Tires> tiresProvider) {
    return new WheelsModule_ProvideWheelsFactory(module, rimProvider, tiresProvider);
  }

  public static Wheels provideWheels(WheelsModule instance, Rim rim, Tires tires) {
    return Preconditions.checkNotNullFromProvides(instance.provideWheels(rim, tires));
  }
}
