/*
 * Problem Link : https://leetcode.com/problems/remove-linked-list-elements/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q203_Remove_Linked_List_Elements
{
    class ListNode
    {
        int val;
        ListNode next;

        ListNode(){ }

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null)
            if(current.next.val == val)
                current.next = current.next.next;
            else
                current = current.next;

        return dummy.next;
    }
}
