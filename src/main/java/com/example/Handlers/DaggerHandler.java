package com.example.Handlers;

import javax.inject.Inject;
import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;

public class DaggerHandler{
  Gson gson;

  @Inject
  public DaggerHandler(Gson gson){
    this.gson = gson;
  }
  
  public String handleRequest(String request, final Context context) {    
    return "success";
  }
}