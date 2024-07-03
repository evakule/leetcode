package lyft;

import java.util.Arrays;

public class MergeStringsAlternately1768 {

  public static void main(String[] args) {
    String word1 = "abc";
    String word2 = "pqr";

    System.out.println(mergeAlternately(word1, word2));
  }

  public static String mergeAlternately(String word1, String word2) {

    int biggestLength = Math.max(word1.length(), word2.length());

    StringBuilder finalString = new StringBuilder();

    for (int i = 0; i < biggestLength; i++) {
      if (i < word1.length()) {
        finalString.append(word1.charAt(i));
      }
      if (i < word2.length()) {
        finalString.append(word2.charAt(i));
      }
    }

    return finalString.toString();
  }

  // one more my solution
//  public static String mergeAlternately(String word1, String word2) {
//    int maxLength = Math.max(word1.length(), word2.length());
//    char[] arr = new char[word1.length() + word2.length()];
//
//    int firstWordCounter = 0;
//    int secondWordCounter = 0;
//    int generalLengthCounter = 0;
//
//    for (int i = 0; i < maxLength; i++) {
//      if (firstWordCounter < word1.length()) {
//        arr[generalLengthCounter] = word1.charAt(firstWordCounter);
//        generalLengthCounter++;
//        firstWordCounter++;
//      }
//      if (secondWordCounter < word2.length()) {
//        arr[generalLengthCounter] = word2.charAt(secondWordCounter);
//        generalLengthCounter++;
//        secondWordCounter++;
//      }
//    }
//    return new String(arr);
//  }

}
