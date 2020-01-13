package com.khoi.dagger2learning.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String version(){
        return "1.0.0";
    }

    @Provides
    static int number(){
        return 123;
    }
}
