package algorithms;

public class MaximumSubarraySum {

  public static int maximumSubarraySum(int[] nums) {
    int maxSum = nums[0];
    int currSum = 0;

    for (int num : nums) {
      currSum = Math.max(0, currSum) + num;
      maxSum = Math.max(currSum, maxSum);
    }

    return maxSum;
  }
}
