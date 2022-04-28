package com.main.thread;


import java.util.concurrent.atomic.AtomicInteger;

public class OddByT1EvenByT2 {

  static AtomicInteger atomicInteger = new AtomicInteger(1);

  public static void main(String[] args) {
    Runnable runnable = () -> {
      while (atomicInteger.get() < 20) {
        synchronized (atomicInteger) {
          if (atomicInteger.get() % 2 == 0 && "Even".equals(Thread.currentThread().getName())) {
            System.out.println("Even : " + atomicInteger.getAndIncrement());
          } else {
            System.out.println("Odd : " + atomicInteger.getAndIncrement());
          }
        }
      }
    };

    Thread t1 = new Thread(runnable);
    t1.setName("Even");
    t1.start();

    Thread t2 = new Thread(runnable);
    t2.setName("Odd");
    t2.start();

  }


}
