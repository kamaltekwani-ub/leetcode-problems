public class Q230_Kth_Smallest_Element_in_a_BST {
    int k;
    int element;

    public void findKtheSmallest(TreeNode root) {
        if (root == null)
            return;

        findKtheSmallest(root.left);
        if (--k == 0)
            element = root.val;
        findKtheSmallest(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        findKtheSmallest(root);
        return element;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
