package com.main.string;

public class StringRotate {

  public static void main(String[] args) {

    String value = "codingninjas";
    int left = 2, right = 2;
    System.out.println(value.substring(3, value.length() - 1) + value.substring(0, left));

    String val = "Adrasud";
    System.out.println(val.substring(2));
    System.out.println(val.substring(2).indexOf("d"));

  }

}
