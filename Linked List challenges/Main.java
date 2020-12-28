public class Main {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // TwoLinkedListIntersection challenge1 = new TwoLinkedListIntersection();
        // RemoveElements challenge2 = new RemoveElements();
        RemoveNode challenge3 = new RemoveNode();

        // ListNode intersectionNode = challenge1.getIntersectionNode(node1, node3);
        // System.out.println(intersectionNode.val);

        /*
         * ListNode head = challenge2.remove(node1, 1);
         * 
         * while (head != null) { System.out.println(head.val); head = head.next; }
         */

        ListNode head = challenge3.removeKFromList(node1, 2);

        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}