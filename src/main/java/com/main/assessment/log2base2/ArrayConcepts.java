package com.main.assessment.log2base2;

import java.util.Arrays;

public class ArrayConcepts {

  public static void main(String[] args) {

    int[] array = new int[10];

    Arrays.stream(array).forEach(x -> System.out.println(x));

    System.out.println(Arrays.stream(array).max());



  }

}
