package com.example.laundry_demo.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = LaundryDemoApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface LaundryDemoApplication_GeneratedInjector {
  void injectLaundryDemoApplication(LaundryDemoApplication laundryDemoApplication);
}
