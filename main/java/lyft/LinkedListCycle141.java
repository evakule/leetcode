package lyft;

import lyft.node.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListCycle141 {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);
    l1.setNext(l2);
    l2.setNext(l3);
    l3.setNext(l4);
    l4.setNext(l2);

    System.out.println(hasCycle(l1));
  }

  public static boolean hasCycle(ListNode head) {
    Set<ListNode> set = new HashSet<>();
    while (head != null) {
      set.add(head);
      if (set.contains(head.getNext())) {
        return true;
      }
      set.add(head);
      head = head.getNext();
    }
    return false;
  }
}

