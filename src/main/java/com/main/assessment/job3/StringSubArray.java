package com.main.assessment.job3;

public class StringSubArray {

  public static void main(String[] args) {

    String val = "1234";
    char[] charArray = val.toCharArray();
    for (int i = 0; i <= charArray.length; i++) {
      for (int j = i + 1; j <= charArray.length; j++) {
        System.out.println(val.substring(i, j));
      }
    }

  }

}
