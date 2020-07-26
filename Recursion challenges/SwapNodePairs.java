public class SwapNodePairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        head = swap(head, head.next);
        return head;
    }

    private ListNode swap(ListNode node1, ListNode node2) {

        if (node1 == null || node2 == null) {
            return node1;
        }

        ListNode tempNode = node2.next;
        node2.next = node1;

        if (tempNode == null) {
            node1.next = tempNode;
        }

        else {
            node1.next = swap(tempNode, tempNode.next);
        }

        return node2;
    }
}