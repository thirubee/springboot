package com.main.leetcode;

public class LongestSubstringWithoutRepeatingCharacter {


  public static void main(String[] args) {

    String input = "arasu";
    char[] temp = input.toCharArray();
    int max = 0;
    for (int i = 0; i <= temp.length; i++) {
      go:
      for (int j = i + 1; j <= temp.length; j++) {
        String str = input.substring(i, j);
        boolean[] visited = new boolean[26];
        for (int l = 0; l <= temp.length; l++) {
          if (visited[temp[l] - 'a'] == true) {
            continue go;
          } else {
            visited[temp[l] - 'a'] = true;
          }
        }
        if(max < str.length())
          max = str.length();
      }
    }
    System.out.println(max);
  }

}
