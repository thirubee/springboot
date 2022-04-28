package com.main.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  Map<Character, Integer> romanToInteger = new HashMap<>();
  {
    romanToInteger.put('I', 1);
    romanToInteger.put('V', 5);
    romanToInteger.put('X', 10);
    romanToInteger.put('L', 50);
    romanToInteger.put('C', 100);
    romanToInteger.put('D', 500);
    romanToInteger.put('M', 1000);
  }

  public static void main(String[] args) {
    RomanToInteger romanToInteger = new RomanToInteger();
    int value = romanToInteger.romanToInt("LVIII");
    System.out.println(value);
  }

  public int romanToInt(String s) {
    int result = 0;
    for (int i = 0; i < s.toCharArray().length; i++) {
      if (i > 0 && romanToInteger.get(s.charAt(i)) > romanToInteger.get(s.charAt(i - 1))) {
        result += romanToInteger.get((s.charAt(i)) - 2 )* (romanToInteger.get(s.charAt(i - 1)));
      } else {
        result += romanToInteger.get(s.charAt(i));
      }
    }
    return result;
  }

}
