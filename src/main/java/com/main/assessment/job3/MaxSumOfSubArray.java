package com.main.assessment.job3;

public class MaxSumOfSubArray {

  public static void main(String[] args) {

    int[] array = new int[]{-2, -3, -1, -2, -3};

    int max_so_far = Integer.MIN_VALUE;
    int current_max = 0;
    for(int i = 0 ; i < array.length; i++){
      current_max = current_max + array[i];
      if(max_so_far < current_max)
        max_so_far = current_max;
      if(current_max < 0)
        current_max = 0;
    }
    System.out.println(max_so_far);
  }
}
