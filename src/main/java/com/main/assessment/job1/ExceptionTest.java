package com.main.assessment.job1;

public class ExceptionTest {

  static void testException() throws Error {
    if (true) {
      throw new AssertionError();
    }
    System.out.println("inside test Exception");
  }

  public static void main(String[] args) {
    try {
      testException();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Inside main method");
  }
}
