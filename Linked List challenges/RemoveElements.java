// public class RemoveElements {

// public ListNode remove(ListNode head, int val) {

// ListNode previous = null;
// ListNode current = head;

// while (current != null) {

// if (current.val == val) {
// if (previous == null && current.next == null) {
// return null;
// } else if (previous == null && current.next != null) {
// current = current.next;
// head = current;
// continue;

// } else {
// previous.next = current.next;
// current = current.next;
// }
// }

// else {
// previous = current;
// current = current.next;
// }
// }

// return head;
// }
// }