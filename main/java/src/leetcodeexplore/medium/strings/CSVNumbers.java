package old.string;

class CSVNumbers {

  public static void main(String[] args) {
    //677 - error (ZA)
//    System.out.println(getLetters(78, ""));
//    System.out.println(getLetters(79, ""));
//    System.out.println(convertToTitle(80, ""));
//    System.out.println(getLetters(676, ""));
//    System.out.println(getLetters(677, ""));
//    System.out.println(getLetters(5, ""));
//    System.out.println(getLetters(1000, ""));
//    System.out.println(getLetters(1020, ""));
    char s = ((char) 64 + 25);

    System.out.println(s);
  }


  private static String convertToTitle(int number, String in) {
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    if (number <= 0) {
      return in;
    } else {
      if (number / 26 == 0) {
        return abc.charAt(number - 1) + in;
      }

      int res;
      if (number % 26 == 0) {
        res = number / 26 - 1;
        in = abc.charAt(25) + in;
      } else {
        res = number / 26;
        in = abc.charAt(number % 26 - 1) + in;
      }

      return convertToTitle(res, in);
    }
  }


  //leetcode
  private String convertToTitle(int columnNumber) {
    int n = columnNumber;
    StringBuilder b = new StringBuilder("");

    while (n > 0) {
      int r = n % 26;
      if (r == 0) {
        b.append("Z");
        n = (n - 26) / 26;
      } else {
        b.append((char) (64 + r));
        n = (n - r) / 26;
      }

    }
    return b.reverse().toString();
  }


}
