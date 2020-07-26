import java.util.HashSet;

public class TwoLinkedListIntersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        HashSet<ListNode> nodeSet = new HashSet<>();

        while (currentNodeA != null) {
            nodeSet.add(currentNodeA);
            currentNodeA = currentNodeA.next;
        }

        while (currentNodeB != null) {
            if (nodeSet.contains(currentNodeB)) {
                return currentNodeB;
            }

            else {
                currentNodeB = currentNodeB.next;
            }
        }

        return null;
    }
}