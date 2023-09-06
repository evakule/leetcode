package src._137;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
  public static void main(String[] args) {
    int[] array = {0, 1, 0, 1, 0, 1, 99, 99, 99, 2};
//    int[] array = {0, 1, 0, 1, 0, 1, 99};
    System.out.println(Arrays.toString(array));
    int search2 = singleNumber3(array);
    System.out.println(search2);

    int search = singleNumber(array);
    System.out.println(search);
  }

  //My working solution
  public static int singleNumber(int[] nums) {
    Arrays.sort(nums);
    int search = Integer.MAX_VALUE;
    int counter = 0;
    int first = nums[0];
    int second = nums[0];
    try {
      for (int i = 0; i < nums.length; i++) {
        if (first == second) {
          counter++;
        } else if (first != second && counter == 1) {
          search = nums[i - 1];
          break;
        } else {
          first = nums[i];
          counter = 1;
        }
        second = nums[i + 1];
      }
    } catch (Exception e) {
      return nums[nums.length - 1];
    }
    return search;
  }


  //Not my solution, but it is more simple, but principle is the same. I doubted about iteration +3
  public static int singleNumber2(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    while (i < nums.length - 1)
      if (nums[i] == nums[i + 1]) i += 3;
      else return nums[i];

    return nums[nums.length - 1];
  }

  //My Solution
  public static int singleNumber3(int[] nums) {
    long arraySum = 0;
    long setSum = 0;
    HashSet<Long> set = new HashSet<>();

    // Adding elements to set
    for (long num : nums) {
      set.add(num);
    }
    // Looking for a sum of source array
    for (long value : nums) {
      arraySum = value + arraySum;
    }

    //Looking for a sum of a set
    Object[] uniqueElements =  set.toArray();
    for (int i = 0; i < set.size(); i++) {
      setSum = setSum + (Long) uniqueElements[i];
    }

    return (int) (((setSum * 3) - arraySum) / 2);
  }
}
