package com.main.competitive;

import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args) {

    int arr[] = {1, 2, 4, 6, 3, 7, 8};
    int len = arr.length + 1;

    int sum = len * ( len + 1 ) / 2;
    int total = Arrays.stream(arr).sum();
    System.out.println(sum - total);

  }

}
