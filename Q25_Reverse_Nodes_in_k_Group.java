/*
 * Problem Link : https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q25_Reverse_Nodes_in_k_Group
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

    public ListNode reverseKGroup(ListNode head, int k)
    {
        if(head == null || head.next == null)
            return head;

        ListNode previous = null;
        ListNode next = null;
        ListNode current = head;
        ListNode tempNode = head;

        int tempCount = 0;

        while(tempNode != null && tempCount < k)
        {
            tempNode = tempNode.next;
            tempCount++;
        }

        if(tempCount < k)
            return head;

        int count = 0;
        while(current != null && count < k)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }

        if(count < k)
            return head;

        if(next != null)
            head.next = reverseKGroup(next, k);

        return previous;
    }
}
