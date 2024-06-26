// Generated by Dagger (https://dagger.dev).
package com.example.laundry_demo.presenter;

import com.example.laundry_demo.repository.splash.RegisterNavigator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<RegisterNavigator> registerNavigatorProvider;

  public RegisterViewModel_Factory(Provider<RegisterNavigator> registerNavigatorProvider) {
    this.registerNavigatorProvider = registerNavigatorProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(registerNavigatorProvider.get());
  }

  public static RegisterViewModel_Factory create(
      Provider<RegisterNavigator> registerNavigatorProvider) {
    return new RegisterViewModel_Factory(registerNavigatorProvider);
  }

  public static RegisterViewModel newInstance(RegisterNavigator registerNavigator) {
    return new RegisterViewModel(registerNavigator);
  }
}
