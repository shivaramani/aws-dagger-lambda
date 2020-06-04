package com.example.Handlers;

import javax.inject.Inject;
import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class DaggerHandler{
  Gson gson;
  static Logger logger = LoggerFactory.getLogger(DaggerHandler.class);

  @Inject
  public DaggerHandler(Gson gson){
        this.gson = gson;
  }
  
  public String handleRequest(Map<String,String>  request) {
      logger.info("Received request in the Dagger Service");
      logger.info("Incoming request - " + request);

      return "success";
  }
}