package com.main.leetcode;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class PlusOne {

  public static void main(String[] args) {
    int[] intArray = new int[]{1, 2, 3};
    StringJoiner sj = new StringJoiner("");
    String str = Arrays.asList(intArray).stream().map(x -> String.valueOf(x))
        .collect(Collectors.joining());
  }

}
