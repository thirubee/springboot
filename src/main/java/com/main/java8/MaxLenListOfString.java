package com.main.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxLenListOfString {

  public static void main(String[] args) {

    List<String> tempList = Arrays.asList("ARasu", "thir", "a");
    Comparator<String> c = Comparator.comparingInt(x -> x.length());
    int len = tempList.stream().max(c).get().length();
    System.out.println(len);

    /*Optional<String> maxString = tempList.stream().max(Comparator.comparingInt(x -> x.length()));
    if(maxString.isPresent()){
       maxString.get().length();
    }*/


  }

}
