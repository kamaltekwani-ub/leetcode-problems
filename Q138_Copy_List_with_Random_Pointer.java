/*
 * Problem Link : https://leetcode.com/problems/copy-list-with-random-pointer/
 * Solution Link : https://leetcode.com/problems/copy-list-with-random-pointer/solutions/43632/java-very-simple-and-clean-solution-with-o-n-time-o-1-space-with-algorithm/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q138_Copy_List_with_Random_Pointer
{
    class Node
    {
        int val;
        Node next;
        Node random;

        Node(){ }

        Node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head)
    {
        if(head == null)
            return null;

        Node current = head;
        while(current != null)
        {
            Node next = current.next;
            current.next = new Node(current.val);
            current.next.next = next;
            current = next;
        }

        current = head;

        while(current != null)
        {
            if(current.random != null)
                current.next.random = current.random.next;
            current = current.next.next;
        }

        current = head;
        Node copy = head.next;
        Node temp = copy;

        while(current != null && temp != null)
        {
            current.next = (current.next != null) ? current.next.next : null;
            temp.next = (temp.next != null) ? temp.next.next : null;
            current = current.next;
            temp = temp.next;
        }

        return copy;
    }
}
