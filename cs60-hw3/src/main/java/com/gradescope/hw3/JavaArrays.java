package com.gradescope.hw3;

import java.util.Arrays;

public class JavaArrays {
  // arrayCount9
  public static int arrayCount9(int[] nums) {
    int count = 0;
    
    // Count each 9
    for (int num : nums) {
      if (num == 9) {
        count++;
      }
    }
    
    return count;
  }

  // arrayFront9
  public static boolean arrayFront9(int[] nums) {
    // Check first 4 (or all if shorter)
    int end = Math.min(4, nums.length);
    
    for (int i = 0; i < end; i++) {
      if (nums[i] == 9) {
        return true;
      }
    }
    
    return false;
  }

  // array123
  public static boolean array123(int[] nums) {
    // Check  for 1, 2, 3 
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
        return true;
      }
    }
    
    return false;
  }

  // array667
  public static int array667(int[] nums) {
    int count = 0;
    
    // Check adjacent 
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 6) {
        if (nums[i + 1] == 6 || nums[i + 1] == 7) {
          count++;
        }
      }
    }
    
    return count;
  }

  // noTriples
  public static boolean noTriples(int[] nums) {
    // Check for any 3 in a row
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
        return false;
      }
    }
    
    return true;
  }

  // firstLast6
  public static boolean firstLast6(int[] nums) {
    // Check if 6 is first or last
    return nums[0] == 6 || nums[nums.length - 1] == 6;
  }

  // sameFirstLast
  public static boolean sameFirstLast(int[] nums) {
    // Check if first and last are equal
    return nums.length > 0 && nums[0] == nums[nums.length - 1];
  }

  // makePi
  public static int[] makePi() {
    // Return first 3 digits of pi
    return new int[]{3, 1, 4};
  }

  // commonEnd
  public static boolean commonEnd(int[] a, int[] b) {
    // Check if first elements or last elements are equal
    return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
  }

  // sum3
  public static int sum3(int[] nums) {
    int sum = 0;

    // Add each element to sum
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    return sum;
  }

  // rotateLeft3
  public static int[] rotateLeft3(int[] nums) {
    // Create new array and rotate elements left
    int[] result = new int[3];
    result[0] = nums[1]; 
    result[1] = nums[2]; 
    result[2] = nums[0]; 
    
    return result;
  }

  // countEvens
  public static int countEvens(int[] nums) {
    int count = 0;
    
    // Count even numbers
    for (int num : nums) {
      if (num % 2 == 0) {
        count++;
      }
    }
    
    return count;
  }

  // bigDiff
  public static int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    
    // Find min and max values
    for (int num : nums) {
      min = Math.min(min, num);
      max = Math.max(max, num);
    }
    
    return max - min;
  }

  // centeredAverage
  public static int centeredAverage(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    int sum = 0;
    
    // Find min and max, calculate sum
    for (int num : nums) {
      min = Math.min(min, num);
      max = Math.max(max, num);
      sum += num;
    }
    
    // Subtract min and max, then divide by (length - 2)
    return (sum - min - max) / (nums.length - 2);
  }

  // main
  public static void main(String[] args) {
    // You can add debugging statements here to test your methods!
  }

  // JavaArrays
  private JavaArrays() {
  }
}
