package src._53;

class Solution {
  public static void main(String[] args) {
    int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int[] array2 = {-2, 1};
    int[] array3 = {-2, -3, -1};
    int[] array4 = {100, -2, -1, 99};
    System.out.println(maxSubArray(array4));
  }


  public static int maxSubArray(int[] nums) {
    int prevSum = 0;
    int biggestSum = Integer.MIN_VALUE;
    for (int num : nums) {
      prevSum = prevSum + num;
      if (num > prevSum)
        prevSum = num;
      if (prevSum > biggestSum)
        biggestSum = prevSum;
    }
    return biggestSum;
  }
}


