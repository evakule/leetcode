package src._169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
  public static void main(String[] args) {
    int[] arr1 = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(arr1));
  }

  // My solution
  public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int doubled = nums.length / 2;

    for (int elem : nums) {
      Integer take = map.get(elem);
      if (take == null) {
        map.put(elem, 1);
      } else {
        int counter = map.get(elem);
        counter++;
        map.put(elem, counter);
      }
    }
    for (Integer key : map.keySet()) {
      if (map.get(key) > doubled) {
        return key;
      }
    }
    return -1;
  }
}
