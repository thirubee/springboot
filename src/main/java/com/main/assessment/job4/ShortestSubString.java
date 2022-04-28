package com.main.assessment.job4;

import java.util.ArrayList;
import java.util.List;

public class ShortestSubString {

  public static void main(String[] args) {
    String val = "My Name is Fran";
    char[] array = val.toCharArray();
    int len = array.length;
    List<String> subStringList = new ArrayList<>();
    for (int i = 0; i <= len; i++) {
      for (int j = i + 1; j <= len; j++) {
        subStringList.add(val.substring(i, j));
      }
    }

    subStringList.stream().forEach(x -> System.out.println(x));
  }

}
