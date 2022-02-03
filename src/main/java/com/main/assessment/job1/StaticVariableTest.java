package com.main.assessment.job1;

public class StaticVariableTest {

  static int cnt;

  public static void main(String[] args) {
    new StaticVariableTest().display();
  }

  void display() {
    System.out.print(cnt);
  }

}
