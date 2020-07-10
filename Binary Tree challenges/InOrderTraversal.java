import java.util.ArrayList;

public class InOrderTraversal {

    public ArrayList<Integer> traverseInOrder(TreeNode root) {

        ArrayList<Integer> nodeValList = new ArrayList<>();
        traverse(root, nodeValList);

        return nodeValList;
    }

    private void traverse(TreeNode root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }
}