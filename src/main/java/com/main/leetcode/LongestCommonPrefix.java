package com.main.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

  public static void main(String[] args) {

    String[] array = new String[]{"flower", "flow", "flight"};
    Arrays.asList(array).stream().mapToInt(x -> x.length()).min().getAsInt();

    StringBuilder sb = new StringBuilder();
    int count = Arrays.asList(array).stream().mapToInt(x -> x.length()).min().getAsInt();
    go:
    for (int i = 0; i < count; i++) {
      char ch = array[0].charAt(i);
      sb.append(ch);
      for (String s : array) {
        if (s.charAt(i) != ch) {
          sb.deleteCharAt(sb.length() - 1);
          break go;
        }
      }
    }
    System.out.print(sb);

  }

}
