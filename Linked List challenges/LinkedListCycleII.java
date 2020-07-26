public class LinkedListCycleII {

    public ListNode getCycleStartNode(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != slow) {

            if (fast.next.next == null || fast.next == null) {
                return null;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return fast;
    }
}