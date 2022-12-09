package org.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.example.car.IEngine;
import org.example.car.PetrolEngine;

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
public final class PetrolEngineModule_ProvideEngineFactory implements Factory<IEngine> {
  private final PetrolEngineModule module;

  private final Provider<PetrolEngine> engineProvider;

  public PetrolEngineModule_ProvideEngineFactory(PetrolEngineModule module,
      Provider<PetrolEngine> engineProvider) {
    this.module = module;
    this.engineProvider = engineProvider;
  }

  @Override
  public IEngine get() {
    return provideEngine(module, engineProvider.get());
  }

  public static PetrolEngineModule_ProvideEngineFactory create(PetrolEngineModule module,
      Provider<PetrolEngine> engineProvider) {
    return new PetrolEngineModule_ProvideEngineFactory(module, engineProvider);
  }

  public static IEngine provideEngine(PetrolEngineModule instance, PetrolEngine engine) {
    return Preconditions.checkNotNullFromProvides(instance.provideEngine(engine));
  }
}
