package lyft.node;

public class ListNode {
  int val;
  ListNode next;

  public ListNode(int x) {
    val = x;
    next = null;
  }

  public void setNext(ListNode l) {
    this.next = l;
  }

  public Integer getVal() {
    return this.val;
  }

  public ListNode getNext() {
    return this.next;
  }
}


