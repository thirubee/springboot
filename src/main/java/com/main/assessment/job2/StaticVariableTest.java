package com.main.assessment.job2;

public class StaticVariableTest {

  static int x = 10;

  public static void main(String[] args) {
    for(x = 1; x < 3; x++){
      System.out.println(x);
    }
    System.out.println(x);
  }

}
