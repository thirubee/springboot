package com.main.qualifierexampler;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal{

  @Override
  public void run() {
    System.out.println("Running Dog");
  }
}
