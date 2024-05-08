/*
 * Problem Link : https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
 * Solution Link : https://leetcode.com/problems/swapping-nodes-in-a-linked-list/solutions/1009918/java-two-pointers-detailed-explanation-o-n-time-o-1-space/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */
public class Q1721_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode first = head, second = head;

        // Put fast (k-1) nodes after slow
        for (int i = 0; i < k - 1; ++i)
            fast = fast.next;

        // Save the node for swapping
        first = fast;

        // Move until the end of the list
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Save the second node for swapping
        // Note that the pointer second isn't necessary: we could use slow for swapping as well
        // However, having second improves readability

        second = slow;

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
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
