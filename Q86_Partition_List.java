/*
 * Problem Link : https://leetcode.com/problems/partition-list/
 * Solution Link : https://leetcode.com/problems/partition-list/solutions/2315494/java-c-detailed-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q86_Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode leftTail = left;
        ListNode rightTail = right;

        while (head != null) {
            if (head.val < x) {
                leftTail.next = head;
                leftTail = leftTail.next;
            } else {
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }

        leftTail.next = right.next;
        rightTail.next = null;

        return left.next;
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
    }
}
