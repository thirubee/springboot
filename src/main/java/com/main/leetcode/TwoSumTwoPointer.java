package com.main.leetcode;

public class TwoSumTwoPointer {

  public static void main(String[] args) {
    int[] numArray = new int[]{3, 2, 4};
    int target = 6;
    int left = 0;
    int right = numArray.length - 1;
    while (left < right) {
      int temp = numArray[left] + numArray[right];
      if (temp == target) {
        break;
      } else if (temp < target) {
        left++;
      } else {
        right--;
      }
    }
    System.out.println(left + " - " + right);
  }

}
