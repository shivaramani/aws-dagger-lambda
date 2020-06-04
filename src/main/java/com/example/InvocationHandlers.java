package com.example;

import com.amazonaws.services.lambda.runtime.Context;

public class InvocationHandlers {
    private LambdaHandlers handlers = DaggerLambdaHandlers.create();

    public String handleRequest(String request, final Context context){
        //return "";
        return handlers.daggerHandler().handleRequest(request, context);
    }
}