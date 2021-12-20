package com.main.rest.handler;


import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HotelExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(HotelException.class)
  public ResponseEntity<Object> handleInvalidException(Exception exception, WebRequest request){
    Map<String, Object> body = new LinkedHashMap();
    body.put("message", "Invalid param exception");
    return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
  }

}
