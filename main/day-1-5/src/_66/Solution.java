package src._66;

import java.util.Arrays;

class Solution {
  public static int[] plusOne(int[] digits) {
    if (digits[digits.length - 1] != 9) {
      digits[digits.length - 1]++;
    } else {
      for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] == 9) digits[i]++;
        else break;
      }
      if (digits[0] == 10) {
        int[] newArray = new int[digits.length + 1];
        for (int i = 1; i <= digits.length; i++) {
          newArray[i] = digits[i - 1];
        }
        digits = newArray;
      }
      for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] == 10) {
          digits[i] = 0;
        } else {
          digits[i]++;
          break;
        }
      }
    }
    return digits;
  }

  public static void main(String[] args) {
    int[] test = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int[] test1 = {9, 3, 5, 9, 9, 9, 9};
    System.out.println(Arrays.toString(plusOne(test1)));
  }
}
