package com.main.thread;

public class ActiveCountThread {

  Runnable r1 = () -> {
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.activeCount());
  };

  public static void main(String[] args) {
    ActiveCountThread activeCountThread = new ActiveCountThread();
    activeCountThread.execute();
  }

  void execute() {
    Thread t1 = new Thread(r1, "Thread1");
    Thread t2 = new Thread(r1, "Thread2");
    Thread t3 = new Thread(r1, "Thread3");

    t1.start();
    t2.start();
    t3.start();
  }

}
