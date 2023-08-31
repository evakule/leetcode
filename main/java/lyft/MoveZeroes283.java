package lyft;

import java.util.Arrays;

public class MoveZeroes283 {
  public static void main(String[] args) {

    int[] array1 = new int[]{1, 0, 1};
    int[] array2 = new int[]{0, 1, 0, 3, 12}; // [1,3,12,0,0]
    int[] array3 = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0}; // 4 2 4 3 5 1 0 0 0 0
    moveZeroes(array3);

  }

  //my Solution
  private static void moveZeroes(int[] nums) {

    int zeroIndex = -1;
    int zeroCount = 0;

    //define zero index and count zero's
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0 & zeroIndex == -1) {
        zeroIndex = i;
      }
      if (nums[i] == 0) {
        zeroCount++;
      }
    }


    for (int i = zeroIndex; i < nums.length; i++) {
      //if we have only one elem or we have no zeroes -> exit from loop
      if (nums.length == 1 | zeroCount == 0) {
        break;
      }
      //make swap
      if (nums[i] != 0 & i != 0) {
        nums[zeroIndex] = nums[i];
        nums[i] = 0;
        zeroIndex++;
      }
    }
    System.out.println(Arrays.toString(nums));

  }

  //leetcode Solution
//  public static void moveZeroes(int[] nums) {
//    int snowBallSize = 0;
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] == 0) {
//        snowBallSize++;
//      } else if (snowBallSize > 0) {
//        int t = nums[i];
//        nums[i] = 0;
//        nums[i - snowBallSize] = t;
//      }
//    }
//  }
}
