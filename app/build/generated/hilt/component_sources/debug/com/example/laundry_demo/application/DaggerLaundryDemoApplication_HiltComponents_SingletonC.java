// Generated by Dagger (https://dagger.dev).
package com.example.laundry_demo.application;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.laundry_demo.MainActivity;
import com.example.laundry_demo.presenter.CheckOutViewModel;
import com.example.laundry_demo.presenter.CheckOutViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.HomeViewModel;
import com.example.laundry_demo.presenter.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.LoginViewModel;
import com.example.laundry_demo.presenter.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.OrderDetailViewModel;
import com.example.laundry_demo.presenter.OrderDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.PaymentSuccessViewModel;
import com.example.laundry_demo.presenter.PaymentSuccessViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.PaymentViewModel;
import com.example.laundry_demo.presenter.PaymentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.RegisterViewModel;
import com.example.laundry_demo.presenter.RegisterViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.presenter.SplashViewModel;
import com.example.laundry_demo.presenter.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.laundry_demo.repository.splash.CheckoutImpl;
import com.example.laundry_demo.repository.splash.CheckoutNavigator;
import com.example.laundry_demo.repository.splash.HomeNavigator;
import com.example.laundry_demo.repository.splash.HomeNavigatorImpl;
import com.example.laundry_demo.repository.splash.LoginNavigator;
import com.example.laundry_demo.repository.splash.LoginNavigatorImpl;
import com.example.laundry_demo.repository.splash.OrderDetailImpl;
import com.example.laundry_demo.repository.splash.OrderDetailNavigator;
import com.example.laundry_demo.repository.splash.PaymentNavigator;
import com.example.laundry_demo.repository.splash.PaymentNavigatorImpl;
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigator;
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigatorImpl;
import com.example.laundry_demo.repository.splash.RegisterNavigator;
import com.example.laundry_demo.repository.splash.RegisterNavigatorImpl;
import com.example.laundry_demo.repository.splash.SplashNavigator;
import com.example.laundry_demo.repository.splash.SplashNavigatorImpl;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerLaundryDemoApplication_HiltComponents_SingletonC {
  private DaggerLaundryDemoApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static LaundryDemoApplication_HiltComponents.SingletonC create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public LaundryDemoApplication_HiltComponents.SingletonC build() {
      return new SingletonCImpl();
    }
  }

  private static final class ActivityRetainedCBuilder implements LaundryDemoApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements LaundryDemoApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements LaundryDemoApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements LaundryDemoApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements LaundryDemoApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements LaundryDemoApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements LaundryDemoApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public LaundryDemoApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends LaundryDemoApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends LaundryDemoApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends LaundryDemoApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends LaundryDemoApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(8).add(CheckOutViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(OrderDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PaymentSuccessViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PaymentViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RegisterViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends LaundryDemoApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<CheckoutImpl> checkoutImplProvider;

    private Provider<CheckoutNavigator> bindCheckoutProvider;

    private Provider<CheckOutViewModel> checkOutViewModelProvider;

    private Provider<HomeNavigatorImpl> homeNavigatorImplProvider;

    private Provider<HomeNavigator> bindHomeProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<LoginNavigatorImpl> loginNavigatorImplProvider;

    private Provider<LoginNavigator> bindLoginProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<OrderDetailImpl> orderDetailImplProvider;

    private Provider<OrderDetailNavigator> bindOrderDetailProvider;

    private Provider<OrderDetailViewModel> orderDetailViewModelProvider;

    private Provider<PaymentSuccessNavigatorImpl> paymentSuccessNavigatorImplProvider;

    private Provider<PaymentSuccessNavigator> bindPaymentSuccessProvider;

    private Provider<PaymentSuccessViewModel> paymentSuccessViewModelProvider;

    private Provider<PaymentNavigatorImpl> paymentNavigatorImplProvider;

    private Provider<PaymentNavigator> bindPaymentProvider;

    private Provider<PaymentViewModel> paymentViewModelProvider;

    private Provider<RegisterNavigatorImpl> registerNavigatorImplProvider;

    private Provider<RegisterNavigator> bindRegisterProvider;

    private Provider<RegisterViewModel> registerViewModelProvider;

    private Provider<SplashNavigatorImpl> splashNavigatorImplProvider;

    private Provider<SplashNavigator> bindSplashProvider;

    private Provider<SplashViewModel> splashViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.checkoutImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.bindCheckoutProvider = DoubleCheck.provider((Provider) checkoutImplProvider);
      this.checkOutViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.homeNavigatorImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.bindHomeProvider = DoubleCheck.provider((Provider) homeNavigatorImplProvider);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.loginNavigatorImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.bindLoginProvider = DoubleCheck.provider((Provider) loginNavigatorImplProvider);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.orderDetailImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.bindOrderDetailProvider = DoubleCheck.provider((Provider) orderDetailImplProvider);
      this.orderDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.paymentSuccessNavigatorImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
      this.bindPaymentSuccessProvider = DoubleCheck.provider((Provider) paymentSuccessNavigatorImplProvider);
      this.paymentSuccessViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.paymentNavigatorImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 11);
      this.bindPaymentProvider = DoubleCheck.provider((Provider) paymentNavigatorImplProvider);
      this.paymentViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 10);
      this.registerNavigatorImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 13);
      this.bindRegisterProvider = DoubleCheck.provider((Provider) registerNavigatorImplProvider);
      this.registerViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 12);
      this.splashNavigatorImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 15);
      this.bindSplashProvider = DoubleCheck.provider((Provider) splashNavigatorImplProvider);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 14);
    }

    @Override
    public Map<String, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(8).put("com.example.laundry_demo.presenter.CheckOutViewModel", ((Provider) checkOutViewModelProvider)).put("com.example.laundry_demo.presenter.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.example.laundry_demo.presenter.LoginViewModel", ((Provider) loginViewModelProvider)).put("com.example.laundry_demo.presenter.OrderDetailViewModel", ((Provider) orderDetailViewModelProvider)).put("com.example.laundry_demo.presenter.PaymentSuccessViewModel", ((Provider) paymentSuccessViewModelProvider)).put("com.example.laundry_demo.presenter.PaymentViewModel", ((Provider) paymentViewModelProvider)).put("com.example.laundry_demo.presenter.RegisterViewModel", ((Provider) registerViewModelProvider)).put("com.example.laundry_demo.presenter.SplashViewModel", ((Provider) splashViewModelProvider)).build();
    }

    @Override
    public Map<String, Object> getHiltViewModelAssistedMap() {
      return Collections.<String, Object>emptyMap();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.laundry_demo.presenter.CheckOutViewModel 
          return (T) new CheckOutViewModel(viewModelCImpl.bindCheckoutProvider.get());

          case 1: // com.example.laundry_demo.repository.splash.CheckoutImpl 
          return (T) new CheckoutImpl();

          case 2: // com.example.laundry_demo.presenter.HomeViewModel 
          return (T) new HomeViewModel(viewModelCImpl.bindHomeProvider.get());

          case 3: // com.example.laundry_demo.repository.splash.HomeNavigatorImpl 
          return (T) new HomeNavigatorImpl();

          case 4: // com.example.laundry_demo.presenter.LoginViewModel 
          return (T) new LoginViewModel(viewModelCImpl.bindLoginProvider.get());

          case 5: // com.example.laundry_demo.repository.splash.LoginNavigatorImpl 
          return (T) new LoginNavigatorImpl();

          case 6: // com.example.laundry_demo.presenter.OrderDetailViewModel 
          return (T) new OrderDetailViewModel(viewModelCImpl.bindOrderDetailProvider.get());

          case 7: // com.example.laundry_demo.repository.splash.OrderDetailImpl 
          return (T) new OrderDetailImpl();

          case 8: // com.example.laundry_demo.presenter.PaymentSuccessViewModel 
          return (T) new PaymentSuccessViewModel(viewModelCImpl.bindPaymentSuccessProvider.get());

          case 9: // com.example.laundry_demo.repository.splash.PaymentSuccessNavigatorImpl 
          return (T) new PaymentSuccessNavigatorImpl();

          case 10: // com.example.laundry_demo.presenter.PaymentViewModel 
          return (T) new PaymentViewModel(viewModelCImpl.bindPaymentProvider.get());

          case 11: // com.example.laundry_demo.repository.splash.PaymentNavigatorImpl 
          return (T) new PaymentNavigatorImpl();

          case 12: // com.example.laundry_demo.presenter.RegisterViewModel 
          return (T) new RegisterViewModel(viewModelCImpl.bindRegisterProvider.get());

          case 13: // com.example.laundry_demo.repository.splash.RegisterNavigatorImpl 
          return (T) new RegisterNavigatorImpl();

          case 14: // com.example.laundry_demo.presenter.SplashViewModel 
          return (T) new SplashViewModel(viewModelCImpl.bindSplashProvider.get());

          case 15: // com.example.laundry_demo.repository.splash.SplashNavigatorImpl 
          return (T) new SplashNavigatorImpl();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends LaundryDemoApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends LaundryDemoApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends LaundryDemoApplication_HiltComponents.SingletonC {
    private final SingletonCImpl singletonCImpl = this;

    private SingletonCImpl() {


    }

    @Override
    public void injectLaundryDemoApplication(LaundryDemoApplication arg0) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }
  }
}
