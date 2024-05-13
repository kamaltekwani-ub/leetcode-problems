/*
 * Problem Link : https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * Solution Link : https://leetcode.com/problems/count-good-nodes-in-binary-tree/solutions/635555/java-100-simple-easy-code-using-pre-order-tree-traversal/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q1448_Count_Good_Nodes_in_Binary_Tree {
    int count = 0;

    public void findGoodNodes(TreeNode root, int max) {
        if (root == null)
            return;

        if (root.val >= max) {
            max = root.val;
            count++;
        }

        findGoodNodes(root.left, max);
        findGoodNodes(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        findGoodNodes(root, root.val);
        return count;
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
