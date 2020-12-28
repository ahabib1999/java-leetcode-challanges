public class SearchInBinarySearchTree {

    public TreeNode searchInBST(TreeNode root, int val) {

        if (root == null) {
            return root;
        }

        root = search(root, val);

        if (root.val != val) {
            return null;
        }

        return root;
    }

    private TreeNode search(TreeNode node, int value) {

        if (node.val == value) {
            return node;
        }

        else if (node.left != null) {
            node = search(node.left, value);
        }

        else if (node.right != null) {
            node = search(node.right, value);
        }

        return node;
    }
}