package org.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import org.example.car.Rim;

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
public final class WheelsModule_ProvideRimFactory implements Factory<Rim> {
  private final WheelsModule module;

  public WheelsModule_ProvideRimFactory(WheelsModule module) {
    this.module = module;
  }

  @Override
  public Rim get() {
    return provideRim(module);
  }

  public static WheelsModule_ProvideRimFactory create(WheelsModule module) {
    return new WheelsModule_ProvideRimFactory(module);
  }

  public static Rim provideRim(WheelsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRim());
  }
}
