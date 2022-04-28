package com.main.thread;

public class JoinThread_RaceCondition {

  Runnable r1 = () -> {
    System.out.println(Thread.currentThread().getName());
  };

  public static void main(String[] args) throws InterruptedException {
    JoinThread_RaceCondition joinThread = new JoinThread_RaceCondition();
    joinThread.execute();

  }

  void execute() throws InterruptedException {
    System.out.println(Thread.currentThread().getName() +" Start") ;
    Thread t1 = new Thread(r1, "Thread1");
    Thread t2 = new Thread(r1, "Thread2");

    t1.start();
    t1.join();

    t2.start();
    t2.join();

    System.out.println(Thread.currentThread().getName() + "End");

  }

}
