package com.main.assessment.job1;

import java.util.Arrays;
import java.util.List;

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

    list.forEach(System.out::println);

  }

}
