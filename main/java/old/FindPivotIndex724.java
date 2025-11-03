package old;

public class FindPivotIndex724 {
  public static void main(String[] args) {

    int[] array1 = new int[]{1, 7, 3, 6, 5, 6};
    int[] array2 = new int[]{2, 1, -1};

    System.out.println(pivotIndex(array1));


  }

  private static int pivotIndex(int[] nums) {
    int sum = calculateArrayValuesSum(nums);
    int leftSum = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (leftSum == sum - leftSum - nums[i]) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }

  private static int calculateArrayValuesSum(int[] array) {
    int sum = 0;
    for (int j : array) {
      sum += j;
    }
    return sum;
  }
}
