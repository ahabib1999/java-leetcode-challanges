import java.util.ArrayList;

public class PostOrderTraversal {

    public ArrayList<Integer> traversePostOrder(TreeNode root) {

        ArrayList<Integer> nodeValList = new ArrayList<>();
        traverse(root, nodeValList);

        return nodeValList;
    }

    private void traverse(TreeNode root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        traverse(root.left, list);
        traverse(root.right, list);
        list.add(root.val);
    }
}