// Generated by Dagger (https://dagger.dev).
package com.example.laundry_demo.presenter;

import com.example.laundry_demo.repository.splash.PaymentNavigator;
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
public final class PaymentViewModel_Factory implements Factory<PaymentViewModel> {
  private final Provider<PaymentNavigator> paymentNavigatorProvider;

  public PaymentViewModel_Factory(Provider<PaymentNavigator> paymentNavigatorProvider) {
    this.paymentNavigatorProvider = paymentNavigatorProvider;
  }

  @Override
  public PaymentViewModel get() {
    return newInstance(paymentNavigatorProvider.get());
  }

  public static PaymentViewModel_Factory create(
      Provider<PaymentNavigator> paymentNavigatorProvider) {
    return new PaymentViewModel_Factory(paymentNavigatorProvider);
  }

  public static PaymentViewModel newInstance(PaymentNavigator paymentNavigator) {
    return new PaymentViewModel(paymentNavigator);
  }
}
