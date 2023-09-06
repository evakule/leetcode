package src.leetcodeexplore.medium.strings;

public class LongestSubstringWithoutRepeatingCharacters3 {
  public static void main(String[] args) {
    String s1 = "abcabcbb";
    String s2 = "pwwkew";
    System.out.println(lengthOfLongestSubstring(s2));

  }

  // my solution written after Editorial video on leetcode
  public static int lengthOfLongestSubstring(String s) {
    int[] chars = new int[128];
    int maxLength = 0;

    int leftPointer = 0;
    int rightPointer = 0;

    while (rightPointer < s.length()) {
      char c = s.charAt(rightPointer);
      chars[c]++;

      while (chars[c] > 1) {
        char leftChar = s.charAt(leftPointer);
        chars[leftChar]--;
        leftPointer++;
      }
      rightPointer++;
      maxLength = Math.max(maxLength, rightPointer - leftPointer);
    }
    return maxLength;
  }
}
