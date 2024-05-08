public class Q19_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;

        for (int index = 1; index <= n; index++)
            fast = fast.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
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
