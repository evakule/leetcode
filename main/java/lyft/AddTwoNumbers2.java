package lyft;


public class AddTwoNumbers2 {
  /**
   * [9,9,9,9,9,9,9], l2 = [9,9,9,9]
   * @param args
   */


  public static void main(String[] args) {

    ListNode l1 = new ListNode(9);
    ListNode l2 = new ListNode(9);
    ListNode l3 = new ListNode(9);
    ListNode l4 = new ListNode(9);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;

    ListNode l5 = new ListNode(9);
    ListNode l6 = new ListNode(9);
    ListNode l7 = new ListNode(9);
    ListNode l8 = new ListNode(9);
    ListNode l9 = new ListNode(9);
    ListNode l10 = new ListNode(9);
    ListNode l11 = new ListNode(9);

    l5.next = l6;
    l6.next = l7;
    l7.next = l8;
    l8.next = l9;
    l9.next = l10;
    l10.next = l11;

    printListNodes(addTwoNumbers(l1, l5));


  }

  private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head1 = l1;
    ListNode head2 = l2;

    //create main node
    ListNode currNode = new ListNode();

    //checking size and entering loop
    for (int i = 0; i < checkSize(l1, l2); i++) {
      ListNode prev = new ListNode();

      //get two values and add to each other
      int currVal = head1.val + head2.val;

      //1 in mind on prev step
      if (currNode.val != 0) {
        currVal = currVal + 1;
      }

      //calculation
      if (currVal > 9) {
        currNode.val = currVal % 10;
        prev.val = 1;
      } else {
        currNode.val = currVal;
      }

      //assign nodes
      prev.next = currNode;
      currNode = prev;

      //assign head nodes
      if (head1.next == null) {
        head1 = new ListNode();
      } else {
        head1 = head1.next;
      }

      if (head2.next == null) {
        head2 = new ListNode();
      } else {
        head2 = head2.next;
      }
    }

    //return reversed
    if (currNode.val != 0) {
      return reverseLinkedList(currNode);
    } else {
      return reverseLinkedList(currNode.next);
    }
  }

  private static int checkSize(ListNode l1, ListNode l2) {
    ListNode head1 = l1;
    ListNode head2 = l2;

    int firstCounter = 0;
    int secondCounter = 0;

    while (head1 != null) {
      head1 = head1.next;
      firstCounter++;
    }
    while (head2 != null) {
      head2 = head2.next;
      secondCounter++;
    }
    return Math.max(firstCounter, secondCounter);
  }


  private static ListNode reverseLinkedList(ListNode l) {
    ListNode head = l;
    ListNode forward = null;
    ListNode prev = null;

    while (head != null) {
      forward = head.next;
      head.next = prev;
      prev = head;
      head = forward;
    }
    return prev;
  }

  private static void printListNodes(ListNode l1) {
    ListNode head1 = l1;

    while (head1 != null) {
      System.out.println(head1.val);
      head1 = head1.next;
    }
  }

  private static class ListNode {
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
  }
}


