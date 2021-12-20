package com.main.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/traditional")
public class HotelTraditionalController {

  @RequestMapping(path = "/hotel/{version}", method = RequestMethod.GET)
  public @ResponseBody
  String combineParam(@PathVariable("version") String version,
      @RequestParam(value = "name") String name,
      @RequestParam(value = "address", required = false) String address) {
    return "Hey " + name + " Welcome to traditional Controller and Your Version :" + version;
  }


}
