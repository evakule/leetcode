package lyft;

import java.util.Arrays;

public class ReverseVowelsOfAString345 {
  /**
   * Example 1:
   * Input: s = "hello"
   * Output: "holle"
   * <p>
   * Example 2:
   * Input: s = "leetcode"
   * Output: "leotcede"
   */
  public static void main(String[] args) {
    //laotcede
    System.out.println(leetcodeReverse("leetcoda"));

  }

  private static String reverseVowels(String s) {
    char[] charArray = s.toCharArray();
    int fromTheEnd = charArray.length - 1;

    for (int i = 0; i < charArray.length / 2; i++) {

      if (isVowel(charArray[i])) {
        for (int j = fromTheEnd; j >= charArray.length / 2; j--) {

          if (isVowel(charArray[j])) {

            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            if (fromTheEnd != j) {
              fromTheEnd = fromTheEnd - (fromTheEnd - j);
            } else {
              fromTheEnd = fromTheEnd - 1;
            }
            break;
          }
        }
      }
    }
    return new String(charArray);
  }



  private static String leetcodeReverse(String s) {
    int start = 0;
    int end = s.length() - 1;
    // Convert String to char array as String is immutable in Java
    char[] sChar = s.toCharArray();

    // While we still have characters to traverse
    while (start < end) {
      // Find the leftmost vowel
      while (start < s.length () && !isVowel(sChar[start])) {
        start++;
      }
      // Find the rightmost vowel
      while (end >= 0 && !isVowel(sChar[end])) {
        end--;
      }
      // Swap them if start is left of end
      if (start < end) {
        swap(sChar, start++, end--);
      }
    }

    // Converting char array back to String
    return new String(sChar);

  }

  private static void swap(char[] chars, int x, int y) {
    char temp = chars[x];
    chars[x] = chars[y];
    chars[y] = temp;
  }

  private static boolean isVowel(char v) {
    char ch = Character.toLowerCase(v);
    return ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u';
  }


}
