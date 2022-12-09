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
public final class PetrolEngineModule_ProvideHorsePowerFactory implements Factory<Integer> {
  private final PetrolEngineModule module;

  public PetrolEngineModule_ProvideHorsePowerFactory(PetrolEngineModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideHorsePower(module);
  }

  public static PetrolEngineModule_ProvideHorsePowerFactory create(PetrolEngineModule module) {
    return new PetrolEngineModule_ProvideHorsePowerFactory(module);
  }

  public static int provideHorsePower(PetrolEngineModule instance) {
    return instance.provideHorsePower();
  }
}
