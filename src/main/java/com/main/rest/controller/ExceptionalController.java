package com.main.rest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/exceptional")
public class ExceptionalController {

  @RequestMapping(value = {"/f1", "/f2", "/f3"}, method = {RequestMethod.GET, RequestMethod.POST})
  public String ping(WebRequest webRequest) {
    return "Ping Pong Session :: " + webRequest.getSessionId();
  }

}
