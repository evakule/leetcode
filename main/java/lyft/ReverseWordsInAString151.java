package lyft;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString151 {
  public static void main(String[] args) {
    String example = "a good   example";

    System.out.println(reverseWords(example));

  }

  private static String reverseWords(String s) {
    String[] wordArray = s.split(" ");
    List<String> wordList = new ArrayList<>();

    for (int i = wordArray.length - 1; i >= 0; i--) {
      String word = wordArray[i];
      if (word.length() >= 1) {
        wordList.add(word);
      }
    }
    return buildString(wordList);
  }

  private static String buildString(List<String> list) {
    StringBuilder sb = new StringBuilder();

    for (String s : list) {
      sb.append(s).append(" ");
    }
    return sb.toString().trim();
  }
}
