package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.example.LambdaHandlers;
import java.util.Map;

public class InvocationHandlers {
    private LambdaHandlers handlers = DaggerLambdaHandlers.create();

    public String handleDaggerRequest(Map<String,String> request, final Context context){
        return handlers.daggerHandler().handleRequest(request);
    }
}