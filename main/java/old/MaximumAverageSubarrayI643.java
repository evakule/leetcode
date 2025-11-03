package old;

public class MaximumAverageSubarrayI643 {
  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(findMaxAverage(arr1, 4));
  }

  public static double findMaxAverage(int[] nums, int k) {
    double sum = 0;

    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    double res = sum;
    for (int i = k; i < nums.length; i++) {
      sum = sum + nums[i] - nums[i - k];
      res = Math.max(res, sum);
    }
    return res / k;
  }

}
