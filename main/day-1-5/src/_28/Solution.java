package src._28;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

class Solution {
  private int strStr(String haystack, String needle) {
    if (needle.equals("")) {
      return 0;
    } else if (haystack.contains(needle)) {
      for (int i = 0; i < haystack.length(); i++) {
        if (needle.equals(haystack.substring(i, i + needle.length()))) {
          return i;
        }
      }
    }
    return -1;
  }
}