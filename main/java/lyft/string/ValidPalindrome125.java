package lyft.string;

import java.util.Locale;

public class ValidPalindrome125 {
  public static void main(String[] args) {
    ValidPalindrome125 v = new ValidPalindrome125();

    System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));

  }

  public boolean isPalindrome(String s) {
    String withoutNonAlphaNumeric = s.replaceAll("[^a-zA-Z0-9\\s]+", "").toLowerCase().trim().replaceAll(" ", "");

    int backIndex = withoutNonAlphaNumeric.length() - 1;

    for (int i = 0; i < withoutNonAlphaNumeric.length(); i++) {
      char head = withoutNonAlphaNumeric.charAt(i);
      char tail = withoutNonAlphaNumeric.charAt(backIndex);
      if (head != tail) {
        return false;
      }
      backIndex--;
    }

    return true;
  }
}
