package lyft;

import lyft.node.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists160 {

  //[4,1,8,4,5]
  //[5,6,1,8,4,5]

  public static void main(String[] args) {
    ListNode l1 = new ListNode(4);
    ListNode l2 = new ListNode(1);
    ListNode l3 = new ListNode(8);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);
    l1.setNext(l2);
    l2.setNext(l3);
    l3.setNext(l4);
    l4.setNext(l5);

    ListNode l6 = new ListNode(5);
    ListNode l7 = new ListNode(6);
    ListNode l8 = new ListNode(1);
    l6.setNext(l7);
    l7.setNext(l8);
    l8.setNext(l3);


    System.out.println(getIntersectionNode(l1, l6).getVal());


  }

  //my solution
  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Set<ListNode> set = new HashSet<>();

    while (headA != null) {
      set.add(headA);
      headA = headA.getNext();
    }

    while (headB != null) {
      if (set.contains(headB)) {
        return headB;
      } else {
        headB = headB.getNext();
      }
    }

    return null;
  }


}

