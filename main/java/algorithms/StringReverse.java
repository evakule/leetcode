package algorithms;

public class StringReverse {
  private String reverse(String s) {
    if (s.length() <= 1) return s;
    String a = s.substring(0, s.length() / 2);
    String b = s.substring(s.length() / 2);
    return reverse(b) + reverse(a);
  }

  public static void main(String[] args) {
    System.out.println();
  }
}
