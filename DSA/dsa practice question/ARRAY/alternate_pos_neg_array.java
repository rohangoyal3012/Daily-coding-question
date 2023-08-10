// Write a Java program that checks whether an array of integers alternates between positive and negative values.  
/*
Example:
Original array: [1, -2, 5, -4, 3, -6]
Check the said array of integers alternates between positive and negative values!true
*/

     //code


import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {
      1,
      -2,
      5,
      -4,
      3,
      -6
    };
    //int[] nums = {1, 2 ,5, 4, 3, 6};
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));

    boolean result = test(nums);
    System.out.printf("\nCheck the said array of integers alternates between positive and negative values!" + result);
  }

  public static boolean test(int[] nums) {
    for (int n: nums) {
      if (n == 0)
        return false;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > 0 && nums[i] > 0) {
        return false;
      } else if (nums[i - 1] < 0 && nums[i] < 0) {
        return false;
      }
    }
    return true;
  }
}
