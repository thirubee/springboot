package com.main.competitive.string;

import java.util.Arrays;

public class WordSplitter {

  public static void main(String[] args) {
    String str = "arasu:magizh-mithra;nilan";
    String[] arr = str.split("[:;-]");
    Arrays.stream(arr).forEach(System.out::println);


  }

}
