package lyft.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {
  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));

  }

  private static int romanToInt(String s) {
    Map<String, Integer> map = getNumbers();
    int total = 0;
    Integer currNumber = 0;

    int i = 0;
    while (i < s.length()) {
      if (i + 2 <= s.length()) {
        String doubleLetter = s.substring(i, i + 2);
        if (map.containsKey(doubleLetter)) {
          currNumber = map.get(doubleLetter);
          total = total + currNumber;
          i = i + 2;
          continue;
        }
      }
      String singleLetter = s.substring(i, i + 1);
      currNumber = map.get(singleLetter);
      i = i + 1;
      total = total + currNumber;
    }
    return total;
  }

  private static Map<String, Integer> getNumbers() {
    Map<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
    map.put("IV", 4);
    map.put("IX", 9);
    map.put("XL", 40);
    map.put("XC", 90);
    map.put("CD", 400);
    map.put("CM", 900);
    return map;
  }
}
