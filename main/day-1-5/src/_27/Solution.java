package src._27;

class Solution {
  public static void main(String[] args) {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2, 5}; // 2
    int[] nums2 = {3, 2, 2, 3}; // 3
    int[] nums3 = {4, 5}; // 4
    int[] nums4 = {2, 2, 3}; // 2
    int[] nums5 = {0, 4, 4, 0, 4, 4, 4, 0, 2}; // 4
    System.out.println(removeElement(nums, 2));
  }

  private static int removeElement(int[] nums, int val) {
    int index = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val && i < index) {
        while (nums[index] == val && index > 0) {
          index--;
        }
        if (index > 0 && index > i) {
          int temp = nums[index];
          nums[index] = nums[i];
          nums[i] = temp;
        }
      }
    }
    return getArraySize(nums, val);
  }

  private static int getArraySize(int[] array, int val) {
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == val) {
        break;
      }
      counter++;
    }
    return counter;
  }

////  int[] nums = {0, 1, 2, 2, 3, 0, 4, 2, 5}; // 2
//  private static int removeElement(int[] nums, int val) {
//    int i = 0;
//    for (int j = 0; j < nums.length; j++) {
//      if (nums[j] != val) {
//        nums[i] = nums[j];
//        i++;
//      }
//    }
//    return i;
//  }
}