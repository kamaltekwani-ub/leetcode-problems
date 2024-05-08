/*
 * Problem Link : https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q2130_Maximum_Twin_Sum_of_a_Linked_List {
    public ListNode reverse(ListNode node) {
        ListNode current = node;
        ListNode previous = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public int pairSum(ListNode head) {
        int result = 0;

        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = null;

        ListNode nodeA = head;
        ListNode nodeB = reverse(slow);

        while (nodeA != null && nodeB != null) {
            result = Math.max(result, nodeA.val + nodeB.val);
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return result;
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
