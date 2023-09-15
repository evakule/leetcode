package lyft;

import java.util.*;
import java.util.stream.Collectors;

public class ProductOfArrayExceptSelf238 {

  /**
   * Example 1:
   * Input: nums = [1,2,3,4]
   * Output: [24,12,8,6]
   * <p>
   * Example 2:
   * Input: nums = [-1,1,0,-3,3]
   * Output: [0,0,9,0,0]
   */

  public static void main(String[] args) {
    int[] array1 = new int[]{1, 2, 3, 4};
    int[] array2 = new int[]{-1, 1, 0, -3, 3};
    System.out.println(Arrays.toString(productExceptSelf(array2)));

  }

  //my updated solution
  public static int[] productExceptSelf(int[] nums) {
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int[] resultArray = new int[nums.length];

    left[0] = 1;
    right[nums.length - 1] = 1;

    for (int i = 1; i < nums.length; i++) {
      left[i] = nums[i - 1] * left[i - 1];
    }

    for (int i = nums.length - 2; i >= 0; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < nums.length; i++) {
      resultArray[i] = left[i] * right[i];
    }

    return resultArray;
  }
}

