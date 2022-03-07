package com.main.competitive;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 7};
    int target = 7;

    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      if (arr[start] + arr[end] == target) {
        System.out.println(start + " " + end);
        break;
      } else if (arr[start] + arr[end] < target) {
        start++;
      } else {
        end--;
      }
    }

  }
}
