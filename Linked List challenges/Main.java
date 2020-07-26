public class Main {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node5;
        node3.next = node4;
        node4.next = node5;

        TwoLinkedListIntersection challenge1 = new TwoLinkedListIntersection();

        ListNode intersectionNode = challenge1.getIntersectionNode(node1, node3);
        System.out.println(intersectionNode.val);
    }
}