package com.main.collectionexample;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

  public static void main(String[] args) {

    String str = "Arasu Thiru One Thiru One One One One";
    String[] array = str.split(" ");
    Map<String, Integer> countMap = new TreeMap<>(Collections.reverseOrder());
    for (String s : array) {
      if(countMap.containsKey(s))
        countMap.put(s, countMap.get(s) + 1);
      else
        countMap.put(s, 1);
    }

    countMap.forEach((k,v) -> System.out.println(k + "---" + v));

  }

}
