public class Main {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);
        TreeNode node9 = new TreeNode(9);
        TreeNode node6 = new TreeNode(6);

        node3.left = node1;
        node3.right = node2;
        node2.left = node4;
        node2.right = node5;
        node1.left = node10;
        node1.right = node9;
        node10.left = node11;
        node10.right = node6;

        FindMaxDepth challenge1 = new FindMaxDepth();

        int maxDepth = challenge1.getMaxDepth(node3);
        System.out.println(maxDepth);
    }
}