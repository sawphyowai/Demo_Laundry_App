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
public final class CheckoutImpl_Factory implements Factory<CheckoutImpl> {
  @Override
  public CheckoutImpl get() {
    return newInstance();
  }

  public static CheckoutImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CheckoutImpl newInstance() {
    return new CheckoutImpl();
  }

  private static final class InstanceHolder {
    private static final CheckoutImpl_Factory INSTANCE = new CheckoutImpl_Factory();
  }
}
