package com.main.competitive;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingChar {

  public static void main(String[] args) {

    String val = "Thirunavukkarasu";
    char[] charArray = val.toCharArray();
    Set<String> tempSet = new HashSet<>();
    for(int i = 0; i < charArray.length; i++){
      boolean bool = tempSet.add(String.valueOf(charArray[i]));
      System.out.println(bool);
      System.out.println(charArray[i]);
    }


  }

}
