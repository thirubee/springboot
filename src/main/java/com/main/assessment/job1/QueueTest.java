package com.main.assessment.job1;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

  public static void main(String[] args) {
    Queue product = new ArrayDeque<>();
    product.add("p1");
    product.add("p2");
    product.add("p3");

    System.out.println(product.peek());
    System.out.println(product.poll());
    product.stream().forEach(System.out::println);
  }

}
