package org.example.car;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class PetrolEngine_Factory implements Factory<PetrolEngine> {
  private final Provider<Integer> horsePowerProvider;

  private final Provider<Integer> capacityProvider;

  public PetrolEngine_Factory(Provider<Integer> horsePowerProvider,
      Provider<Integer> capacityProvider) {
    this.horsePowerProvider = horsePowerProvider;
    this.capacityProvider = capacityProvider;
  }

  @Override
  public PetrolEngine get() {
    return newInstance(horsePowerProvider.get(), capacityProvider.get());
  }

  public static PetrolEngine_Factory create(Provider<Integer> horsePowerProvider,
      Provider<Integer> capacityProvider) {
    return new PetrolEngine_Factory(horsePowerProvider, capacityProvider);
  }

  public static PetrolEngine newInstance(int horsePower, int capacity) {
    return new PetrolEngine(horsePower, capacity);
  }
}
