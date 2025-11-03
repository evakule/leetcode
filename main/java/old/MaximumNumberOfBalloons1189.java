package old;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons1189 {
  public static void main(String[] args) {
    MaximumNumberOfBalloons1189 m = new MaximumNumberOfBalloons1189();
    int max0 = m.maxNumberOfBalloons("ballon");
    int max1 = m.maxNumberOfBalloons("nlaebolko");

    int max2 = m.maxNumberOfBalloons("loonbalxballpoon");
    System.out.println(max0);
    System.out.println(max1);
    System.out.println(max2);
  }

  public int maxNumberOfBalloons(String text) {
    char[] input = text.toCharArray();
    Map<Character, Integer> map = new HashMap<>();

    map.put('b', 0);
    map.put('a', 0);
    map.put('l', 0);
    map.put('o', 0);
    map.put('n', 0);

    for (int i = 0; i < input.length; i++) {
      if (map.containsKey(input[i])) {
        int counter = map.get(input[i]);
        counter = counter + 1;
        map.put(input[i], counter);
      }
    }

    int lowest = map.get('b');

    for (Map.Entry entry : map.entrySet()) {
      if (entry.getKey().equals('l') | entry.getKey().equals('o')) {
        if ((int) entry.getValue() / 2 <= lowest) {
          lowest = (int) entry.getValue() / 2;
        }
      } else {
        if ((int) entry.getValue() <= lowest) {
          lowest = (int) entry.getValue();
        }
      }
    }
    return lowest;

  }
}
