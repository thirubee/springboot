package com.main.assessment.job4;

public class KadaneAlgorithms {

  public static void main(String[] args) {

    int[] subArray = {-2, -3, 4, -1, -2, 1, 5, -3};
    int global_sum = 0, local_sum = 0;
    for (int i = 0; i < subArray.length; i++) {
      local_sum = Math.max(0, local_sum + subArray[i]);
      global_sum = Math.max(global_sum, local_sum);
    }

    System.out.println(global_sum);


  }

}
