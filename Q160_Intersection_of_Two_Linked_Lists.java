/*
 * Problem Link : https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */


public class Q160_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != currentB) {
            currentA = currentA == null ? headB : currentA.next;
            currentB = currentB == null ? headA : currentB.next;
        }

        return currentA;
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
