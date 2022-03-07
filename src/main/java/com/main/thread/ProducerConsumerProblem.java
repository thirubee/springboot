package com.main.thread;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerProblem {

  public static void main(String[] args) {

    BlockingQueue<String> queue = new LinkedBlockingDeque<>();

    Runnable producer = () -> {
      while (true) {
        Random r = new Random();
        Double d = r.nextDouble();
        System.out.println("Produced : " + d);
        try {
          queue.put(String.valueOf(d));
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Runnable consumer = () -> {
      while (true) {
        try {
          System.out.println("Consumed " + queue.take());
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Thread t1 = new Thread(producer);
    t1.start();

    Thread t2 = new Thread(consumer);
    t2.start();


  }


}
