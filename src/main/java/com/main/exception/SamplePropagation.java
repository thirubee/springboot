package com.main.exception;

public class SamplePropagation {

  public static void main(String[] args) {
    System.out.println(exceptionTest());
  }

  public static int exceptionTest() {
    int i = 6;
    try {
      //return i;
      throw new NullPointerException();
    } catch (NullPointerException npe) {
      i = 45;
      throw npe;
    } finally {
      i = 30;
      System.out.println("Test");
      return i;
    }
  }
}
