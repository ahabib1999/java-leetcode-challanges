public class Main {

    public static void main(String[] args) {

        ReverseString challenge1 = new ReverseString();
        SwapNodePairs challenge2 = new SwapNodePairs();
        ReverseLinkedList challenge3 = new ReverseLinkedList();

        char[] charArr = { 'H', 'a', 'n', 'n', 'a', 'h' };

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        // challenge1.reverseString(charArr);

        // ListNode head = challenge2.swapPairs(node1);

        ListNode head = challenge3.reverseList(node1);
    }
}