package com.main.string;

public class PalindromeCheck {

  public static void main(String[] args) {
    String value = "Thiru";
    boolean flag = false;
    int len = value.length();
    for (int i = 0; i < len / 2; i++) {
      System.out.println(value.charAt(i));
      System.out.println(value.charAt(len - i - 1));
      if (value.charAt(i) != value.charAt(len - i - 1)) {
        break;
      }
    }
    flag = true;

    System.out.println(flag);
  }

}
