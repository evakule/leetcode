package src.leetcodeexplore.medium.linkedlist;

public class DeleteTheMiddleNodeOfALinkedList2095 {
  public static void main(String[] args) {

    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(1);
    ListNode l3 = new ListNode(2);
    ListNode l4 = new ListNode(3);
    ListNode l5 = new ListNode(4);

    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;

    System.out.println(deleteMiddle(l1));
  }

  public static ListNode deleteMiddle(ListNode head) {
    if (head.next == null) return null;

    ListNode pointer = head;

    int middleIndex = calculateLength(head) / 2;

    for (int i = 0; i < middleIndex - 1; ++i) {
      pointer = pointer.next;
    }

    pointer.next = pointer.next.next;
    return head;
  }

  private static int calculateLength(ListNode head) {
    ListNode dupHead = head;
    int length = 0;
    if (dupHead == null) {
      return length;
    } else {
      while (dupHead != null) {
        dupHead = dupHead.next;
        length++;
      }
    }
    return length;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  String show() {
    return String.valueOf(val);
  }
}
