package com.main.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TestS {

  public static void main(String[] args) {
    Map<String, Integer> rowMap = new HashMap<>();
    String[] inputArray = new String[]{"D2", "B3", "B2", "A12", "C4"};
    rowMap.put("A", 0);
    rowMap.put("B", 1);
    rowMap.put("C", 2);
    rowMap.put("D", 3);
    String[][] valueArray = new String[12][4];
    for (String val : inputArray) {
      valueArray[Integer.parseInt(val.substring(1)) - 1][rowMap.get(val.substring(0, 1))] = val;
    }
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 4; j++) {
        if (valueArray[i][j] != null) {
          System.out.println(valueArray[i][j]);
        }
      }
    }

   /* Comparator<String> c1 = (x, y) -> {
      Integer d1 = Integer.parseInt(x.substring(1, x.length()));
      Integer d2 = Integer.parseInt(y.substring(1, y.length()));
      return d1.compareTo(d2);
    };

    Comparator<String> c2 = (x, y) -> {
      String d1 = x.substring(1, x.length());
      String d2 = y.substring(1, y.length());
      return d1.compareTo(d2);
    };

    String[][] arr = new String[array.length][array.length];
    List<String> list = Arrays.asList(array);
    Collections.sort(list, c1);
    System.out.println(list);*/

  }

}
