package src._20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s = "((()))";
        Solution sol = new Solution();
//        boolean is = sol.isValid(s);
        boolean is2 = sol.isValidLeetCode(s);
        System.out.println(is2);
    }

    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        Character last = null;
        for (int i = 0; i < s.length(); i++) {
            char elem = s.charAt(i);
            if (elem == '(' || elem == '[' || elem == '{') {
                stack.push(elem);
            }
            if (elem == ')' || elem == ']' || elem == '}') {
                if (stack.size() != 0) last = stack.pop();
                else stack.push(elem);
            }
            if (last != null) {
                String concat = String.valueOf(last)  + elem;
                if (last == '{' && !concat.equals("{}")) return false;
                if (last == '(' && !concat.equals("()")) return false;
                if (last == '[' && !concat.equals("[]")) return false;
                if (last == '}' && !concat.equals("}{")) return false;
                if (last == ')' && !concat.equals(")(")) return false;
                if (last == ']' && !concat.equals("][")) return false;
                last = null;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidLeetCode(String s) {
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
