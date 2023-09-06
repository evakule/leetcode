package src.leetcodeexplore.medium.slidingwindow;

public class MaxConsecutiveOnesIII1004 {
  public static void main(String[] args) {
    //[1,1,1,0,0,0,1,1,1,1,0]
    int[] array = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    int k = 3;
    System.out.println(longestOnes(array, k));
  }

  public static int longestOnes(int[] nums, int k) {
    int left = 0;
    int right = 0;
    int maxLength = 0;

    for (right = 0; right < nums.length; right++) {

      if (nums[right] == 0) {
        k--;
      }

      if (k < 0) {
        if (nums[left] == 0) {
          k++;
        }
        left++;
      }
      maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
  }
}
