package com.main.leetcode;

import java.util.ArrayList;
import java.util.List;

public class OccurrancesAfterBigram {

  public static void main(String[] args) {

  }

  public String[] findOcurrences(String text, String first, String second) {
    List<String> list = new ArrayList<String>();
    String[] arr = text.split(" ");
    int len = arr.length;
    String comb = first + second;
    for (int i = 1; i < len - 1; i++) {
      if ((arr[i - 1] + arr[i]).equals(comb)) {
        list.add(arr[i + 1]);
      }
    }
    return list.toArray(new String[list.size()]);
  }

}
