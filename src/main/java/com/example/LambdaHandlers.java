package com.example;

import javax.inject.Singleton;

import com.example.Handlers.DaggerHandler;
import com.example.modules.UtilityModule;

import dagger.Component;

@Singleton
@Component(modules={
    UtilityModule.class
})

public interface LambdaHandlers {
    DaggerHandler daggerHandler();
}