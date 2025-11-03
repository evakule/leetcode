package old;

public class GreatestCommonDivisorOfStrings1071 {
  public static void main(String[] args) {
    String txt = "ABBA";
    String pat = "BBAA";

    System.out.println(gcd(pat, txt));
  }


  private static String gcd(String str1, String str2) {

    //pre-check
    if (!(str1 + str2).equals(str2 + str1))
      return "";


    int gcd = gcd(str1.length(), str2.length());

    return str1.substring(0, gcd);

  }

  private static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

}
