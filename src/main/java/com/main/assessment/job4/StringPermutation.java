package com.main.assessment.job4;

public class StringPermutation {

  public static void main(String[] args) {
    String val = "Arasu";
    StringPermutation stringPermutation = new StringPermutation();
    stringPermutation.perm(val, "");

  }

  public void perm(String str, String prefix) {
    int len = str.length();
    if (len == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < len; i++) {
          perm(str.substring(0,i)+str.substring(i+1, len), prefix+ str.charAt(i));
      }
    }


  }

}
