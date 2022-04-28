package com.main.string;

public class PrintSubString {

  public static void main(String[] args) {

    String str = "ara";
    int len = str.length();
    for (int i = 0; i <= len; i++) {
      for (int j = i + 1; j <= len; j++) {
        System.out.println(str.substring(i, j));
      }
    }

  }

}
