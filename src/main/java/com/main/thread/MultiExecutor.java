package com.main.thread;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

  Runnable r1 = () -> {
    System.out.println(Thread.currentThread().getName());
  };

  public static void main(String[] args) {

    MultiExecutor multiExecutor = new MultiExecutor();
    multiExecutor.execute();
  }

  void execute() {
    List<Thread> thread = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      thread.add(new Thread(r1, "Worker Thread" + i));
    }

    for (Thread t : thread) {
      t.start();
    }
  }

}
