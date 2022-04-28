package com.main.leetcode;

public class Record {

  public static void main(String[] args) {
  }
  private static void check(Tower ex, int h){
    if(ex.istoo(h, 100))
      System.out.println("YEs");
    else
      System.out.println("No");
  }

  interface Tower{
    boolean istoo(int h, int x);
  }
}
