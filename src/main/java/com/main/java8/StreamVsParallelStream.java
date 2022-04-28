package com.main.java8;

import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStream {

  public static void main(String[] args) throws InterruptedException {

    List<String> list = Arrays.asList("1","2","3","4");

    int cores = Runtime. getRuntime(). availableProcessors();

    System.out.println(cores);

    list.stream().forEach(x -> {
      System.out.println(x + " " + Thread.currentThread().getName());
    });

    Thread.sleep(1000);

    list.parallelStream().forEach(x -> {
      System.out.println(x + " " + Thread.currentThread().getName());
    });


  }

}
