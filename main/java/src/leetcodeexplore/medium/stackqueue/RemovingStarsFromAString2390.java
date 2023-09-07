package src.leetcodeexplore.medium.stackqueue;

import java.util.Stack;

public class RemovingStarsFromAString2390 {

  public static void main(String[] args) {
    System.out.println(removeStars("leet**cod*e"));
  }


  public static String removeStars(String s) {
    Stack<Character> stack = new Stack<>();

    int length = s.length();

    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);

      if (c != '*') stack.push(c);
      else stack.pop();

    }
    return buildString(stack);
  }

  private static String buildString(Stack<Character> stack) {
    StringBuilder sb = new StringBuilder();
    stack.forEach(sb::append);
    return sb.toString();
  }
}
