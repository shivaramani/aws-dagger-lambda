package com.example.modules;

import javax.inject.Singleton;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilityModule {
    @Provides
    @Singleton
    public Gson providesGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}