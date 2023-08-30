package algorithms;

public class FindSubstring {
  private static int stringInString(String str1, String str2) {

    int patLength = str1.length(); //pat
    int txtLength = str2.length(); //txt

    for (int i = 0; i < txtLength - patLength; i++) {
      int j;
      for (j = 0; j < patLength; j++) {
        if (str2.charAt(i + j) != str1.charAt(j)) {
          break;
        }
      }
      if (j == patLength) {
        return i;
      }
    }
    return -1;

  }
}
