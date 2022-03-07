package com.main.assessment.job3;

public class ThreadTest {

  final int x = 10;

  public static void main(String[] args) {
    ThreadTest threadTest = new ThreadTest();
    threadTest.display();
  }

  void display() {
    int x = 20;
    Runnable r = new Runnable() {
      final int x = 30;

      @Override
      public void run() {
        System.out.println(x);
      }
    };
    r.run();
  }

}
