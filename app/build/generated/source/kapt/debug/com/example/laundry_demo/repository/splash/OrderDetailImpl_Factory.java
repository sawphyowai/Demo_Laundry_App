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
public final class OrderDetailImpl_Factory implements Factory<OrderDetailImpl> {
  @Override
  public OrderDetailImpl get() {
    return newInstance();
  }

  public static OrderDetailImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OrderDetailImpl newInstance() {
    return new OrderDetailImpl();
  }

  private static final class InstanceHolder {
    private static final OrderDetailImpl_Factory INSTANCE = new OrderDetailImpl_Factory();
  }
}
