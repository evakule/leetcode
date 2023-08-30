package src._206;


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
}

class Solution {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        ListNode list = leetCodeSolution(first);
    }

    private static ListNode reverseList(ListNode head) {
        ListNode node = new ListNode();

        if (head == null || head.next == null) return head;
        while (head.next != null) {
            ListNode current = new ListNode(node.val, node.next);
            node.val = head.next.val;

            if (current.next != null) {
                node.next = current;
            } else {
                node.next = new ListNode(head.val);
            }

            head = head.next;
        }
        return node;
    }

    private static ListNode leetCodeSolution(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
