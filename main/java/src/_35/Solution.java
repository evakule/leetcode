package src._35;

// Best Solution))
class Solution {
  public static void main(String[] args) {
    int[] nums = {1, 3, 5, 6};
    System.out.println(searchInsert(nums, 5));
  }


  public static int searchInsert(int[] nums, int target) {
    int value = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        value = i;
        break;
      } else if (nums[i] > target) {
        value = i;
        break;
      }
    }
    if (nums[nums.length - 1] < target) {
      value = nums.length;
    }
    return value;
  }
}
