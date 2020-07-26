public class FindMaxDepth {

    public int getMaxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int maxDepth = 0;

        maxDepth = findMaxDepth(root, maxDepth);

        return maxDepth;
    }

    private int findMaxDepth(TreeNode node, int maxDepth) {
        if (node == null) {
            return 0;
        }

        int maxLeftDepth = findMaxDepth(node.left, maxDepth);
        int maxRightDepth = findMaxDepth(node.right, maxDepth);

        maxDepth += Math.max(maxLeftDepth, maxRightDepth) + 1;

        return maxDepth;
    }
}