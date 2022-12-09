package org.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import org.example.car.Tires;

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
public final class WheelsModule_ProvideTiresFactory implements Factory<Tires> {
  private final WheelsModule module;

  public WheelsModule_ProvideTiresFactory(WheelsModule module) {
    this.module = module;
  }

  @Override
  public Tires get() {
    return provideTires(module);
  }

  public static WheelsModule_ProvideTiresFactory create(WheelsModule module) {
    return new WheelsModule_ProvideTiresFactory(module);
  }

  public static Tires provideTires(WheelsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTires());
  }
}
