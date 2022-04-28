package com.main.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlpahNumeric {
  public static int comparator(String s1, String s2) {

    String[] pt1 = s1.split("((?<=[a-z])(?=[0-9]))|((?<=[0-9])(?=[a-z]))");
    String[] pt2 = s2.split("((?<=[a-z])(?=[0-9]))|((?<=[0-9])(?=[a-z]))");
//pt1 and pt2 arrays will have the string split in alphabets and numbers

    int i=0;
    if(Arrays.equals(pt1, pt2))
      return 0;
    else{
      for(i=0;i<Math.min(pt1.length, pt2.length);i++)
        if(!pt1[i].equals(pt2[i])) {
          if(!isNumber(pt1[i],pt2[i])) {
            if(pt1[i].compareTo(pt2[i])>0)
              return 1;
            else
              return -1;
          }
          else {
            int nu1 = Integer.parseInt(pt1[i]);
            int nu2 = Integer.parseInt(pt2[i]);
            if(nu1>nu2)
              return 1;
            else
              return -1;
          }
        }
    }

    if(pt1.length>i)
      return 1;
    else
      return -1;
  }

  private static Boolean isNumber(String n1, String n2) {
    // TODO Auto-generated method stub
    try {
      int nu1 = Integer.parseInt(n1);
      int nu2 = Integer.parseInt(n2);
      return true;
    }
    catch(Exception x) {
      return false;
    }

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String[] examples = {"D2", "B3", "B2", "C4", "A12"};
    List<String> values = new ArrayList<String>(Arrays.asList(examples));

    System.out.println(values);
    Comparator<String> com = (o1,o2) -> {return comparator(o1,o2);}; //lambda expression

    Collections.sort(values,com);
    System.out.println(values);
  }
}
