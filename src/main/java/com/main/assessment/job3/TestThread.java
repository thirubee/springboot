package com.main.assessment.job3;

public class TestThread extends Thread{

  public void start(){
    System.out.println("Start");
  }
  public void run(){
    System.out.println("run");
  }

  public static void main(String[] args) {
    TestThread t1 = new TestThread();
    TestThread t2 = new TestThread();

    t1.start();
    t2.start();
  }

}
