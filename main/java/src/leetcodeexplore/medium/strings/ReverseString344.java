package old.string;

import java.util.Arrays;

public class ReverseString344 {
  public static void main(String[] args) {

    char[] charArray = new char[] {'h','e','l','l','o'};
    reverseString(charArray);

  }

  public static void reverseString(char[] s) {
    int endIndex = s.length - 1;

    for (int i = 0; i < s.length / 2; i++) {
      char temp = s[endIndex];
      s[endIndex] = s[i];
      s[i] = temp;
      endIndex--;
    }
    System.out.println(Arrays.toString(s));
  }
}
