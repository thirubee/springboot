package com.main.rest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

  @RequestMapping(value = "/one", method = {RequestMethod.GET, RequestMethod.POST})
  public String fallBackOne(){
    return "Routing through fallback one";
  }

  @RequestMapping(value = "*", method = {RequestMethod.GET, RequestMethod.POST})
  public String callFallBack(){
    return "Routing through fallback";
  }

}
