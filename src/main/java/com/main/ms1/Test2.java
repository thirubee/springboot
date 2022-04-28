package com.main.ms1;

import java.util.PriorityQueue;

public class Test2 {

  public static void main(String[] args) {

    PriorityQueue<String> p = new PriorityQueue<>();
    p.add("carror");
    p.add("apple");
    p.add("banana");
    System.out.println(p.poll() + "." + p.peek());
  }

  class Car<T> {

    void set(T t) {

    }
  }

}
