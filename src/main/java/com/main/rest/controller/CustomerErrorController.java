package com.main.rest.controller;

import com.main.rest.handler.HotelException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerErrorController {

  @RequestMapping(path = "/customError", method = RequestMethod.GET)
  public String getError() {
    throw new HotelException("Customer Error has thrown");
  }

}
