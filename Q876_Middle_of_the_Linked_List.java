/*
 * Problem Link : https://leetcode.com/problems/middle-of-the-linked-list/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
