package com.main.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

  public static void main(String[] args) {

    List<List<Integer>> l1 = new ArrayList();

    List list1 = Arrays.asList(1, 2, 3);
    List list2 = Arrays.asList(2, 3, 4);

    l1.add(list1);
    l1.add(list2);
    l1.stream().flatMap(x -> x.stream().map(y -> y + 20)).collect(Collectors.toList())
        .forEach(System.out::println);

  }

}
