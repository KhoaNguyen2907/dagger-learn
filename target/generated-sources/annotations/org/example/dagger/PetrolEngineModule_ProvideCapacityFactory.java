package org.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PetrolEngineModule_ProvideCapacityFactory implements Factory<Integer> {
  private final PetrolEngineModule module;

  public PetrolEngineModule_ProvideCapacityFactory(PetrolEngineModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideCapacity(module);
  }

  public static PetrolEngineModule_ProvideCapacityFactory create(PetrolEngineModule module) {
    return new PetrolEngineModule_ProvideCapacityFactory(module);
  }

  public static int provideCapacity(PetrolEngineModule instance) {
    return instance.provideCapacity();
  }
}
