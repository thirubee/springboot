package com.main.assessment;

public class SampleTestFive {

  public static void main(String[] args) {

    int[] nums = new int[]{1, 3, 5, 6};
    int target = 2;
    binarySearch(nums, target);

  }

  public static int binarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int mid = 0;
    while (left <= right) {
      mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
      System.out.println(left + " " + mid + " " + right);
    }
    if(target > nums[mid])
      return mid + 1;
    else
      return mid;
  }

  public static int reverse(int x) {
    double ans = 0;
    while (x != 0) {

      double rem = x % 10;
      ans = ans * 10 + rem;
      if (ans >= Integer.MAX_VALUE || ans <= Integer.MIN_VALUE) {
        return 0;
      }
      x = x / 10;

    }
    return (int) ans;
  }

}
