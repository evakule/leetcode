package lyft;

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

}
