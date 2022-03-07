package com.main.assessment.job1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8MapTest {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Magizh", "Nilan", "Thiru");
    list.stream().map(
        name -> {
          System.out.println(name);
          return name.toUpperCase();
        }
    ).anyMatch(
        name -> {
          System.out.println(name);
          return name.startsWith("T");
        }
    );

    list.stream().reduce( (v1, v2) -> v2 + v1);
    Map<String,String> map = new HashMap<>();

    list.forEach(System.out::println);

  }

}
