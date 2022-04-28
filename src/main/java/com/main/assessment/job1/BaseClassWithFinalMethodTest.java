package com.main.assessment.job1;

public class BaseClassWithFinalMethodTest extends BaseClass {

  @Override
  public void display() {
    super.display();
  }
}

class BaseClass {

   protected void display() {
    System.out.println("I'm parent");
  }
}