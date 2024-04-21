/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q83_Remove_Duplicates_from_Sorted_List
{
    class ListNode{
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

    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
            return null;

        ListNode current = head;

        while(current.next != null)
        {
            if(current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }

        return head;
    }
}
