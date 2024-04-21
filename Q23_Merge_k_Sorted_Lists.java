public class Q23_Merge_k_Sorted_Lists
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

    public ListNode mergeKLists(ListNode[] lists)
    {
        return mergeKLinkedList(lists, 0, lists.length-1);
    }

    private ListNode mergeKLinkedList(ListNode[] lists, int left, int right)
    {
        if(left == right)
            return lists[left];
        else if(left < right)
        {
            int mid = left + (right - left)/2;
            ListNode l1 = mergeKLinkedList(lists, left, mid);
            ListNode l2 = mergeKLinkedList(lists, mid + 1, right);
            return mergeLinkedList(l1, l2);
        }
        else
            return null;
    }

    private ListNode mergeLinkedList(ListNode l1, ListNode l2)
    {
        if(l1 == null && l2 == null)
            return null;

        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        if(l1.val < l2.val)
        {
            l1.next = mergeLinkedList(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeLinkedList(l1, l2.next);
            return l2;
        }
    }
}
