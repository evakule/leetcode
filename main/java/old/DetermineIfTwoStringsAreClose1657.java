package old;

import java.util.*;

public class DetermineIfTwoStringsAreClose1657 {
  public static void main(String[] args) {
    String word1 = "cabbba";
    String word2 = "abbccc";

    String word3 = "aaabbbbccddeeeeefffff";
    String word4 = "aaaaabbcccdddeeeeffff";

    String word5 = "abc";
    String word6 = "bca";

    System.out.println(closeStrings(word5, word6));


  }

  public static boolean closeStrings(String word1, String word2) {

    Map<Character, Integer> firsMap = new HashMap<>();
    Map<Character, Integer> secondMap = new HashMap<>();

    Set<Character> firstSet = new HashSet<>();
    Set<Character> secondSet = new HashSet<>();

    if (word1.length() != word2.length()) {
      return false;
    }

    for (int i = 0; i < word1.length(); i++) {
      Integer firstValueCounter = firsMap.get(word1.charAt(i));
      Integer secondValueCounter = secondMap.get(word2.charAt(i));
      firstSet.add(word1.charAt(i));
      secondSet.add(word2.charAt(i));

      if (firstValueCounter == null) {
        firsMap.put(word1.charAt(i), 1);
      } else {
        firstValueCounter = firstValueCounter + 1;
        firsMap.put(word1.charAt(i), firstValueCounter);
      }

      if (secondValueCounter == null) {
        secondMap.put(word2.charAt(i), 1);
      } else {
        secondValueCounter = secondValueCounter + 1;
        secondMap.put(word2.charAt(i), secondValueCounter);
      }
    }

    Set<Character> firstSetDuplicated = new HashSet<>(firstSet);

    firstSet.removeAll(secondSet);
    secondSet.removeAll(firstSetDuplicated);


    List<Integer> firstList = new ArrayList<>(firsMap.values());
    List<Integer> secondList = new ArrayList<>(secondMap.values());

    if ((firstSet.size() != 0 & secondSet.size() != 0) || (firstList.size() != secondList.size())) {
      return false;
    }

    Collections.sort(firstList);
    Collections.sort(secondList);

    for (int i = 0; i < firstList.size(); i++) {
      if (!firstList.get(i).equals(secondList.get(i))) {
        return false;
      }
    }

    return true;
  }
}
