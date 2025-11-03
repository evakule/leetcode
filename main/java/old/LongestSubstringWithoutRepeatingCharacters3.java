package old;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {

  public static void main(String[] args) {
//    System.out.println(lengthOfLongestSubstring("abcabcbb"));
//    System.out.println(lengthOfLongestSubstring("bbbbbb"));
//    System.out.println(lengthOfLongestSubstring(" "));
//    System.out.println(lengthOfLongestSubstring("dvdf"));
    System.out.println(lengthOfLongestSubstring("asjrgapa")); //6
  }

  public static int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      Character take = s.charAt(i);
      if (set.contains(take)) {
        set.clear();
      }
      set.add(take);
      max = Math.max(max, set.size());
    }

    for (int i = s.length() - 1; i >= 0; i--) {
      Character take = s.charAt(i);
      if (set.contains(take)) {
        set.clear();
      }
      set.add(take);
      max = Math.max(max, set.size());
    }
    return max;
  }


}
