package src.leetcodeexplore.medium.backtracking;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderOfAttack {
  public static void main(String[] args) {
    OrderOfAttack o = new OrderOfAttack();
    o.calculateOrder();

    List<String> result = o.getUniqueItems();
    Collections.sort(result);

    AtomicInteger number = new AtomicInteger();
    result.forEach(x -> System.out.println(x + ": " + number.incrementAndGet()));

  }

  private final Set<String> ordering = new HashSet<>();
  private final char[] heroNames = new char[]{'A', 'S', 'V', 'D', 'B'};


  public void calculateOrder() {
    backtrack(0, new StringBuilder());
  }

  private List<String> getUniqueItems() {
    List<String> result = new ArrayList<>();
    for (String item : ordering) {
      Set<Character> set = getCharSet(item);
      if (set.size() == 5) {
        result.add(item);
      }
    }
    return result;
  }

  private Set<Character> getCharSet(String s) {
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
      set.add(c);
    }
    return set;
  }


  private void backtrack(int counter, StringBuilder path) {

    if (counter == 5) {
      String toAdd = path.toString();
      if (!ordering.contains(toAdd)) {
        ordering.add(path.toString());
      } else {
        System.out.println("Repeats: " + toAdd);
      }
      return;
    }

    for (char someChar : heroNames) {
      path.append(someChar);
      backtrack(counter + 1, path);
      path.deleteCharAt(path.length() - 1);
    }
  }
}
