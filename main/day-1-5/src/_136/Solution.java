package src._136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

  public static int singleNumber(int[] nums) {
    int sumOfSet = 0, sumOfNums = 0;
    Set<Integer> set = new HashSet();

    for (int num : nums) {
      if (!set.contains(num)) {
        set.add(num);
        sumOfSet += num;
      }
      sumOfNums += num;
    }
    return 2 * sumOfSet - sumOfNums;
  }

  public static void main(String[] args) {
    int[] nums = {4, 1, 2, 1, 2};
    System.out.println(singleNumber(nums));
  }


}
