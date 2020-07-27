public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;

        if (head == null || head.next == null) {
            return head;
        }

        head = reverse(previous, head);
        return head;
    }

    private ListNode reverse(ListNode node1, ListNode node2) {

        if (node2 == null) {
            return node1;
        }

        ListNode temp = node2.next;
        node2.next = node1;

        ListNode head = reverse(node2, temp);
        return head;
    }
}