// Generated by Dagger (https://dagger.dev).
package com.example.laundry_demo.repository.splash;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SplashNavigatorImpl_Factory implements Factory<SplashNavigatorImpl> {
  @Override
  public SplashNavigatorImpl get() {
    return newInstance();
  }

  public static SplashNavigatorImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SplashNavigatorImpl newInstance() {
    return new SplashNavigatorImpl();
  }

  private static final class InstanceHolder {
    private static final SplashNavigatorImpl_Factory INSTANCE = new SplashNavigatorImpl_Factory();
  }
}
