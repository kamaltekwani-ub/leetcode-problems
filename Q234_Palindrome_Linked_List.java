/*
 * Problem Link : https://leetcode.com/problems/palindrome-linked-list/description/
 * Solution Link : https://leetcode.com/problems/palindrome-linked-list/solutions/4908031/interview-approach-4-approach-list-stack-recursion-two-pointer-approach
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q234_Palindrome_Linked_List
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

    public ListNode reverse(ListNode node)
    {
        ListNode current = node;
        ListNode previous = null;

        while(current != null)
        {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public boolean isPalindrome(ListNode head)
    {
        if(head == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = reverse(slow);

        while(first != null && second != null)
        {
            if(first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }
}
