package src.leetcodeexplore.medium.stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString394 {
  public static void main(String[] args) {
//    System.out.println(decodeString("3[a]2[bc]"));
//    System.out.println(decodeString("3[a2[cbt]]"));
//    System.out.println(decodeString("3[a2[c]]"));
//    System.out.println(decodeString("2[abc]3[cd]ef"));
//    System.out.println(decodeString("abc3[cd]xyz"));
    System.out.println(decodeString("100[leetcode]"));

  }

  //my solution TODO: update it for operations with 3 digits
  public static String decodeString(String s) {
    Stack<Integer> operations = new Stack<>();
    Stack<Character> values = new Stack<>();

    StringBuilder res = new StringBuilder();


    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ']') {
        try {
          int number = Integer.parseInt(String.valueOf(s.charAt(i)));
          operations.push(number);
        } catch (NumberFormatException e) {
          values.push(s.charAt(i));
        }
      } else {
        String result = "";
        while (values.contains('[')) {

          int length = operations.pop();
          StringBuilder sb = new StringBuilder();

          while (values.peek() != '[') {
            sb.append(values.pop());
          }
          values.pop();

          String toAdd = sb.reverse().toString();
          toAdd = toAdd + result;
          result = "";
          for (int j = 0; j < length; j++) {
            result = toAdd + result;
          }
        }

        res.append(appendToMain(values));
        res.append(result);
      }
    }

    res.append(appendToMain(values));
    return res.toString();
  }

  private static StringBuilder appendToMain(Stack<Character> st) {
    StringBuilder last = new StringBuilder();
    while (!st.isEmpty()) {
      last.append(st.pop());
    }
    return last.reverse();
  }

  //leetcode solution
//  public static String decodeString(String s) {
//    Stack<Character> stack = new Stack<>();
//    for (int i = 0; i < s.length(); i++) {
//      if (s.charAt(i) == ']') {
//        List<Character> decodedString = new ArrayList<>();
//        // get the encoded string
//        while (stack.peek() != '[') {
//          decodedString.add(stack.pop());
//        }
//        // pop [ from the stack
//        stack.pop();
//        int base = 1;
//        int k = 0;
//        // get the number k
//        while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
//          k = k + (stack.pop() - '0') * base;
//          base *= 10;
//        }
//        // decode k[decodedString], by pushing decodedString k times into stack
//        while (k != 0) {
//          for (int j = decodedString.size() - 1; j >= 0; j--) {
//            stack.push(decodedString.get(j));
//          }
//          k--;
//        }
//      }
//      // push the current character to stack
//      else {
//        stack.push(s.charAt(i));
//      }
//    }
//    // get the result from stack
//    char[] result = new char[stack.size()];
//    for (int i = result.length - 1; i >= 0; i--) {
//      result[i] = stack.pop();
//    }
//    return new String(result);
//
//
//  }


}
