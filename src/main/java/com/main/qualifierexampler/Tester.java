package com.main.qualifierexampler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Tester {

  @Autowired
  @Qualifier("dog")
  private Animal animal;

  public void tester(){
    animal.run();
  }

}
