public class MergeList {
/*
    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode midNode = geMidNode(A);
        ListNode s2 = midNode.next;
        midNode.next = null;
        ListNode l1 = sortList(A);
        ListNode l2 = sortList(s2);

        ListNode ans = mergeSortedList(l1, l2);
        return ans;

    }

    public ListNode geMidNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeSortedList(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        } else if (node2 == null) {
            return node1;
        }
        ListNode head;
        ListNode h1;
        ListNode h2;

        if (node1.val > node2.val) {
            head = node2;
            h1 = node2;
            h2 = node1;
        } else {
            head = node1;
            h1 = node1;
            h2 = node2;
        }

        ListNode temp = head;
        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                temp.next = h1;
                temp = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                temp = h2;
                h2 = h2.next;
            }
        }
        if (h1 == null) {
            temp.next = h2;
        } else {
            temp.next = h1;
        }

        return head;
    }*/
}
