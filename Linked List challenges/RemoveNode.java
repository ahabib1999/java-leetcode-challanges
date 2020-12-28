public class RemoveNode {

    public ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        if (l == null) {
            return null;
        }

        ListNode<Integer> current = l;
        ListNode<Integer> previous = null;
        Integer kVal = Integer.valueOf(k);
        while (current != null) {

            if (current.value == kVal) {
                System.out.println("hhhhhhh");
                if (previous == null && current.next == null) {
                    return null;
                } else if (previous == null && current.next != null) {
                    current = current.next;
                    l = current;
                    continue;

                } else {
                    previous.next = current.next;
                    current = current.next;
                }
            }

            else {
                previous = current;
                current = current.next;
            }
        }
        return l;
    }
}