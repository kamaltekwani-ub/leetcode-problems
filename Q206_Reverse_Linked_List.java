/*
 * Problem Link : https://leetcode.com/problems/reverse-linked-list/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q206_Reverse_Linked_List
{
    class ListNode
    {
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
