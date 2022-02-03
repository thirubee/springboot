package com.main.assessment.job1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLetter {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("aAaA","AaA","aAa","AAaa");
    Collections.sort(list);
    // A to Z => 65 to 90 & a to z => 97 122
    list.stream().forEach(System.out::print);
  }

}
