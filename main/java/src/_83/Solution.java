package src._83;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * <p>
 * ListNode(int x) {
 * val = x;
 * }
 * }
 */
class Solution {
//  public static ListNode deleteDuplicates(ListNode head) {
//    if (head == null) return null;
//    List<Integer> list = new ArrayList<>();
//    list.add(head.val);
//    while (head.next != null) {
//      if (list.get(list.size() - 1) != head.next.val) {
//        list.add(head.next.val);
//      }
//      head = head.next;
//    }
//    Collections.reverse(list);
//    ListNode ls = new ListNode(list.get(0));
//    for (int i = 1; i < list.size(); i++) {
//      ListNode current = new ListNode(list.get(i));
//      current.next = ls;
//      ls = current;
//    }
//    return ls;
//  }

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.next.val == current.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode ls = new ListNode(1);
    ListNode ls1 = new ListNode(1);
    ListNode ls2 = new ListNode(2);
    ListNode ls3 = new ListNode(2);
    ListNode ls4 = new ListNode(3);
    ListNode ls5 = new ListNode(3);
    ls.next = ls1;
    ls1.next = ls2;
    ls2.next = ls3;
    ls3.next = ls4;
    ls4.next = ls5;

    System.out.println(deleteDuplicates(ls));
  }
}
