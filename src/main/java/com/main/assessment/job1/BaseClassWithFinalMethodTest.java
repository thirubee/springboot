package com.main.assessment.job1;

public class BaseClassWithFinalMethodTest extends BaseClass {

  /**
   * Can't override final method
   */
  /*void display() {
    System.out.println("Child class");
  }*/
}

class BaseClass {

  final void display() {
    System.out.println("I'm parent");
  }
}