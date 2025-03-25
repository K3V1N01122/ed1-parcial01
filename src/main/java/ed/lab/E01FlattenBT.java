//Kevin Palencia
package ed.lab;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null) return;

        TreeNode<Integer> current = root;

        while (current != null) {
            if (current.left != null) {
                TreeNode<Integer> righMost = current.left;

                while (righMost.right != null) {
                    righMost = righMost.right;
                }
                righMost.right = current.right;

                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

}
