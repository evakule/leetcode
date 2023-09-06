package src.leetcodeexplore.easy.arrays;

import java.util.*;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in
 * the order they were present in nums initially. The remaining elements of nums are not important
 * as well as the size of nums.
 *
 * Return k.
 */

class RemoveDuplicates {

  public static void main(String[] args) {
//    System.out.println(removeDuplicates(new int[]{1, 2, 2, 3, 3, 4}));
    String s = "abcabcdfg";
    System.out.println(s.contains("abc"));
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int current = nums[0];
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != current) {
        index++;
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        current = temp;
      }
    }
    return index + 1;
  }

}
