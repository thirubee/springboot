package com.main.assessment.job1;

import java.util.TreeSet;

public class CollectionSetTestOne {

  public static void main(String[] args) {
    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(20);
    numbers.add(50);
    numbers.add(40);
    numbers.add(60);
    System.out.println("Values " + numbers.headSet(50));
  }

}
