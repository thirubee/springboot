package com.main.thread;

public class OddByT1EvenByT2 {

  int max = 20;
  int val = 1;
  Runnable odd = () -> {
    synchronized (this) {
      while (val < max) {
        while (val % 2 == 0) {
          try {
            wait();
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        }
        System.out.println(val);
        val++;
        notify();
      }
    }
  };

  Runnable even = () -> {
    synchronized (this) {
      while (val < max) {
        while (val % 2 == 1) {
          try {
            wait();
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        }
      }
      System.out.println(val);
      val++;
      notify();
    }
  };

  public static void main(String[] args) {

    OddByT1EvenByT2 oddByT1EvenByT2 = new OddByT1EvenByT2();
    oddByT1EvenByT2.test();

  }

  void test() {
    Thread t1 = new Thread(odd);
    Thread t2 = new Thread(even);

    t2.start();
    t1.start();


  }

}
