/*
 * Problem Link : https://leetcode.com/problems/swap-nodes-in-pairs/
 * Solution Link : https://leetcode.com/problems/swap-nodes-in-pairs/solutions/11111/java-simple-recursive-solution/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q24_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPairs(third);

        return second;
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
