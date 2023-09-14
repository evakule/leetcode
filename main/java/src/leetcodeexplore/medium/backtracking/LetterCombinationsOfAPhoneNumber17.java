package src.leetcodeexplore.medium.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber17 {
  public static void main(String[] args) {
    LetterCombinationsOfAPhoneNumber17 some = new LetterCombinationsOfAPhoneNumber17();
    List<String> list = some.letterCombinations("23");
    list.forEach(System.out::println);
  }

  private List<String> combinations = new ArrayList<>();

  private Map<Character, String> letters = Map.of(
      '2', "abc",
      '3', "def",
      '4', "ghi",
      '5', "jkl",
      '6', "mno",
      '7', "pqrs",
      '8', "tuv",
      '9', "wxyz"
  );

  private String phoneDigits;

  public List<String> letterCombinations(String digits) {
    // If the input is empty, immediately return an empty answer array
    if (digits.length() == 0) return combinations;

    // Initiate backtracking with an empty path and starting index of 0
    phoneDigits = digits;
    backtrack(0, new StringBuilder());
    return combinations;
  }

  private void backtrack(int index, StringBuilder path) {

    if (path.length() == phoneDigits.length()) {
      combinations.add(path.toString());
      return; // Backtrack
    }


    char digitFromInputString = phoneDigits.charAt(index);
    String possibleLetters = letters.get(digitFromInputString);
    char[] inChars = possibleLetters.toCharArray();

    for (char letter: inChars) {

      path.append(letter);

      backtrack(index + 1, path);

      path.deleteCharAt(path.length() - 1);
    }
  }


}
