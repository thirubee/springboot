package com.main.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nextgen")
public class HotelRestController {

  @RequestMapping(path = "/hotel/{version}", method = RequestMethod.GET)
  public String combineParam(@PathVariable("version") String version,
      @RequestParam(value = "name") String name,
      @RequestParam(value = "address", required = false) String address) {
    return "Hey " + name + " Welcome to Rest Controller and your version : " + version;
  }
}