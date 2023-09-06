package src._2;



class Solution {
    boolean firstNull = false;
    public static void main(String[] args) {
        ListNode firstFirst = new ListNode(2);
        ListNode firstSecond = new ListNode(4);
        ListNode firstThird = new ListNode(3);

        ListNode secondFirst = new ListNode(5);
        ListNode secondSecond = new ListNode(6);
        ListNode secondThird = new ListNode(4);

        ListNode testZero = new ListNode(0);
//        [5, 6, 4, 5, 9, 3]
//        [2,4,3]




//        firstFirst.next = firstSecond;
//        firstSecond.next = firstThird;
//
//        secondFirst.next = secondSecond;
//        secondSecond.next = secondThird;

//        ListNode fiveOne = new ListNode(5);
//        ListNode six = new ListNode(6);
//        ListNode fiveTwo = new ListNode(5);
//        ListNode four = new ListNode(4);
//        ListNode nine = new ListNode(9);
//
//        fiveOne.next = six;
//
//        fiveTwo.next = four;
//        four.next = nine;

        ListNode a = new ListNode(9);

        ListNode ba = new ListNode(1);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(9);
        ListNode d = new ListNode(9);
        ListNode e = new ListNode(9);
        ListNode f = new ListNode(9);
        ListNode g = new ListNode(9);
        ListNode h = new ListNode(9);
        ListNode l = new ListNode(9);
        ListNode m = new ListNode(9);
        ListNode n = new ListNode(9);
        ListNode o = new ListNode(9);

        ba.next = b;

        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = l;
        l.next = m;
        m.next = n;

        ListNode result = addTwoNumbers(a, ba);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(Long.MAX_VALUE);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = reverseListNode(l1);
        ListNode second = reverseListNode(l2);
        long firstNumber = getValueFromListNode(first);
        long secondNumber = getValueFromListNode(second);
        long finalNumber = firstNumber + secondNumber;
        ListNode node = splitNumberToListNode(finalNumber);
        return reverseListNode(node);

    }

    public static ListNode reverseListNode(ListNode head) {
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

    public static Long getValueFromListNode(ListNode node) {
        long value = 0;
        while (node != null) {
            value = value * 10;
            value = value + node.val;
            node = node.next;
        }
        return value;
    }

    public static ListNode splitNumberToListNode(Long numberToSplit) {
        ListNode resultNode = new ListNode();
        while (numberToSplit != 0) {
            resultNode.val = (int) (numberToSplit % 10);
            numberToSplit = numberToSplit / 10;
            ListNode temp = new ListNode();
            temp.next = resultNode;
            resultNode = temp;
        }
        if (resultNode.next != null) {
            resultNode = resultNode.next;
        } else {
            resultNode = new ListNode(0);
        }
        return resultNode;
    }
 }
