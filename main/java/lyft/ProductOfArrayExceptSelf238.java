package lyft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

  public static int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int total = 1;
    for (int i = 1; i < nums.length; i++) {
      total *= nums[i];
    }
    result[0] = total;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == 0) {
        total = 1;
        for (int j = 0; j < i; j++) {
          total *= nums[j];
        }
        for (int j = i + 1; j < nums.length; j++) {
          total *= nums[j];
        }
        result[i] = total;
      } else {
        total = (total / nums[i]) * nums[i - 1];
        result[i] = total;
      }
    }
    return result;
  }
}

