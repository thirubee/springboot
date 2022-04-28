package com.main.thread;

public class DeadLock {

  Runnable r1 = () -> {
    synchronized (this) {
      try {
        wait();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  };
  Runnable r2 = () -> {
    synchronized (this) {
      try {
        wait();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  };

  public static void main(String[] args) {
    DeadLock deadLock = new DeadLock();
    deadLock.execute();
  }

  void execute() {
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
  }
}

