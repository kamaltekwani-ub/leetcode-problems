public class Q143_Reorder_List
{
    class ListNode{
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

    public ListNode reverse(ListNode node){
        ListNode previous = null;
        ListNode current = node;

        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public void reorderList(ListNode head)
    {
        if(head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;

        while(fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = null;

        ListNode nodeA = head;
        ListNode nodeB = reverse(slow);

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while(nodeA != null || nodeB != null){
            if(nodeA != null){
                current.next = nodeA;
                nodeA = nodeA.next;
                current = current.next;
            }

            if(nodeB != null){
                current.next = nodeB;
                nodeB = nodeB.next;
                current = current.next;
            }
        }

        head = dummy.next;
    }
}
