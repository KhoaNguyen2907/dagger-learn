package org.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import org.example.car.Driver;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DriverModule_ProvideDriverFactory implements Factory<Driver> {
  @Override
  public Driver get() {
    return provideDriver();
  }

  public static DriverModule_ProvideDriverFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Driver provideDriver() {
    return Preconditions.checkNotNullFromProvides(DriverModule.provideDriver());
  }

  private static final class InstanceHolder {
    private static final DriverModule_ProvideDriverFactory INSTANCE = new DriverModule_ProvideDriverFactory();
  }
}
