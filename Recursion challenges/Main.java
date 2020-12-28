public class Main {

    public static void main(String[] args) {

        ReverseString challenge1 = new ReverseString();
        SwapNodePairs challenge2 = new SwapNodePairs();
        ReverseLinkedList challenge3 = new ReverseLinkedList();
        SearchInBinarySearchTree challenge4 = new SearchInBinarySearchTree();
        CutOffRanks challenge5 = new CutOffRanks();

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

        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node6.right = node8;
        node8.left = node7;
        node8.right = node9;

        // challenge1.reverseString(charArr);

        // ListNode head = challenge2.swapPairs(node1);

        // ListNode head = challenge3.reverseList(node1);

        /* TreeNode root = challenge4.searchInBST(node6, 8);
        System.out.println(root.val); */

        int count = challenge5.cutOffRank(4, 5, {2, 2, 3, 4, 5});
    }
}