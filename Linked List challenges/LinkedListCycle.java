import java.util.HashSet;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> nodeSet = new HashSet<>();

        ListNode current = head;

        while (current != null) {

            if (nodeSet.contains(current)) {
                return true;
            }

            nodeSet.add(current);
        }
        return false;
    }
}