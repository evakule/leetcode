package lyft;

import java.util.*;

public class IsSubsequence392 {

  /**
   *
   * Input: s = "abc", t = "ahbgdc"
   * Output: true
   *
   * Input: s = "axc", t = "ahbgdc"
   * Output: false
   *
   */

  public static void main(String[] args) {

    String s1 = "acb";
    String t1 = "ahbgdc";

    String s2 = "axc";
    String t2 = "ahbgdc";

    System.out.println(isSubsequence(s1, t1));

  }

  //my Solution
  public static boolean isSubsequence(String s, String t) {

    if (s.length() == 0) {
      return true;
    }

    String[] splittedS = s.split("");
    String[] splittedT = t.split("");

    Queue<String> sQueue = new LinkedList<>();
    Collections.addAll(sQueue, splittedS);

    for (String value : splittedT) {
      if (value.equals(sQueue.peek())) {
        sQueue.poll();
      }
    }
    return sQueue.size() == 0;
  }
}

