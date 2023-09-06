package src._26;

class Solution {
  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int some = removeDuplicates(nums);
    System.out.println(some);
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int current = nums[0];
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != current) {
        index++;
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        current = temp;
      }
    }
    return index + 1;
  }
}
