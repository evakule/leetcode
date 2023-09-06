package src._205;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public static void main(String[] args) {
    String s = "paper", t = "title";
    boolean is = isIsomorphic(s, t);
    System.out.println(is);

  }

  public static boolean isIsomorphic(String s, String t) {
    Map<Character, Character> firstMap = new HashMap<>();
    Map<Character, Character> secondMap = new HashMap<>();
    boolean isIsomorphic = true;
    for (int i = 0; i < s.length(); i++) {
      firstMap.put(s.charAt(i), t.charAt(i));
      secondMap.put(t.charAt(i), s.charAt(i));
    }
    if (firstMap.size() != secondMap.size()) {
      return false;
    } else {
      for (int i = 0; i < s.length(); i++) {
        if (firstMap.get(s.charAt(i)) != t.charAt(i)) {
          isIsomorphic = false;
          break;
        }
      }
    }
    return isIsomorphic;
  }
}
