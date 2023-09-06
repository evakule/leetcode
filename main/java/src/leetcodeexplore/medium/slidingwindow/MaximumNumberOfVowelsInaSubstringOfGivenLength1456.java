package src.leetcodeexplore.medium.slidingwindow;

public class MaximumNumberOfVowelsInaSubstringOfGivenLength1456 {
  public static void main(String[] args) {
    String s1 = "ibpbhixfiouhdljnjfflpapptrxgcomvnb"; // k = 33; length = 34
    System.out.println(s1.length());
    System.out.println(maxVowels(s1, 33));


  }


  //my solution
  public static int maxVowels(String s, int k) {
    int leftIndex = 0;
    int rightIndex = 0;
    int counter = 0;
    int maxLength = 0;

    String sub = s.substring(0, k);

    for (int i = 0; i < k; i++) {
      char c = sub.charAt(i);
      if (isVowel(c)) {
        counter++;
        if (counter == k) return counter;
      }
    }

    maxLength = Math.max(maxLength, counter);

    rightIndex = k - 1;

    for (int i = k; i < s.length(); i++) {
      if (isVowel(s.charAt(leftIndex))) {
        counter--;
      }
      leftIndex++;
      rightIndex++;
      if (isVowel(s.charAt(rightIndex))) {
        counter++;
      }
      maxLength = Math.max(maxLength, counter);
      if (maxLength == k) return maxLength;
    }
    return maxLength;

  }

  private static boolean isVowel(char c) {
    return c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u';
  }

//  public static int maxVowels(String s, int k) {
//    int leftIndex = 0;
//    int rightIndex = k;
//    int counter = 0;
//    int maxLength = 0;
//
//    while (rightIndex <= s.length()) {
//      String sub = s.substring(leftIndex, rightIndex);
//      for (int i = 0; i < sub.length(); i++) {
//        char c = sub.charAt(i);
//        if (isVowel(c)) {
//          counter++;
//          if (counter == k) {
//            return counter;
//          }
//        }
//      }
//
//      maxLength = Math.max(maxLength, counter);
//      counter = 0;
//
//      leftIndex++;
//      rightIndex++;
//    }
//    return maxLength;
//
//  }


}
