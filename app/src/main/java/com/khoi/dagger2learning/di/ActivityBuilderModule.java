package com.khoi.dagger2learning.di;

import com.khoi.dagger2learning.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeAuthActivity();
}
