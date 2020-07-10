import java.util.ArrayList;

public class PreOrderTraversal {

    public ArrayList<Integer> traversePreOrder(TreeNode root) {

        ArrayList<Integer> nodeValList = new ArrayList<>();
        traverse(root, nodeValList);

        return nodeValList;
    }

    public void traverse(TreeNode root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}