//Write a Java program to calculate the largest gap between sorted elements of an array of integers.  
/*
Example:
Original array: [23, -2, 45, 38, 12, 4, 6]
Largest gap between sorted elements of the said array: 15
*/
import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //int[] nums = {1, 2 ,9, 0, 4, 6};
    int[] nums = {23, -2, 45, 38, 12, 4, 6};
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));

    int result = test(nums);
    System.out.printf("\nLargest gap between sorted elements of the said array: " + result);
  }

  public static int test(int[] nums) {
    Arrays.sort(nums);
    int max_val = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      max_val = Math.max(nums[i + 1] - nums[i], max_val);
    }
    return max_val;
  }
}
