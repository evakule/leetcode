package old;

public class MaximumSubarray53 {
  public static void main(String[] args) {
    int[] array1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}; // 6
    int[] array2 = new int[]{5, 4, -1, 7, 8}; //
    int[] array3 = new int[]{-2, 1}; //
    int[] array4 = new int[]{-2, -3, -4}; //
    System.out.println(maxSubArray(array4));
  }


  //if currSum < 0: -> start from this cell of array, otherwise update curSum.
  //Then update max.
  public static int maxSubArray(int[] nums) {
    if (nums.length == 1) return nums[0];
    int maxSum = nums[0];
    int currSum = 0;

    for (int num : nums) {
      if (currSum <= 0) {
        currSum = num;
      } else {
        currSum = currSum + num;
      }
      maxSum = Math.max(currSum, maxSum);
    }

    return maxSum;
  }

}

