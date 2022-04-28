package com.main.problem;

public class FindPairClosestToZeroInArray {

  static int[] findClosetToZero(int[] array) {
    int min = array[0] + array[1];
    int start = 0, end = 0;
    int len = array.length;
    if (array.length == 2) {
      return new int[]{array[0], array[1]};
    }
    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {
        int tempSum = array[i] + array[j];
        if (Math.abs(min) > Math.abs(tempSum)) {
          min = tempSum;
          start = array[i];
          end = array[j];
        }
      }
    }
    return new int[]{start, end};
  }

  public static void main(String[] args) {

    int[] array = {1, 2, -5, -6, -3, 5, 6, 8};

    int[] temp = findClosetToZero(array);

    System.out.println(temp[0] + "  " + temp[1]);

  }

}
