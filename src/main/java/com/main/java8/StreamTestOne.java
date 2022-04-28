package com.main.java8;

import java.util.Arrays;
import java.util.List;

public class StreamTestOne {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(100,24,13,44,114,200,40,112);
    list.stream().map( x -> Math.sqrt(x)).filter( x -> x > 100).mapToInt(x -> x.intValue()).average();
  }

}
