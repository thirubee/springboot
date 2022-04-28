package com.main.thread;

public class BasicThread {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    BasicThread basicThread = new BasicThread();
    basicThread.execute();
  }

  void execute(){
    Thread t1 = new Thread(r1);
    t1.start();
  }

  Runnable r1 = () -> {
    System.out.println(Thread.currentThread().getName());
  };

}
