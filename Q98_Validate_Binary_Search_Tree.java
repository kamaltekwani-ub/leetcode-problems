/*
 * Problem Link : https://leetcode.com/problems/validate-binary-search-tree/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q98_Validate_Binary_Search_Tree {
    public boolean isValidBinarySearchTree(TreeNode root, long minimum, long maximum) {
        if (root == null)
            return true;

        if (minimum < root.val && root.val < maximum)
            return isValidBinarySearchTree(root.left, minimum, root.val) && isValidBinarySearchTree(root.right, root.val, maximum);

        return false;
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBinarySearchTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
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
