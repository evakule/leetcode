package lyft;

public class PalindromeNumber9 {
  public static void main(String[] args) {
    PalindromeNumber9 p = new PalindromeNumber9();
    System.out.println(p.isPalindrome(121));
  }

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    String number = String.valueOf(x);
    int backIndex = number.length() - 1;
    for (int i = 0; i < number.length(); i++) {
      char head = number.charAt(i);
      char tail = number.charAt(backIndex);
      if (head != tail) {
        return false;
      }
      backIndex--;
    }
    return true;
  }
}
