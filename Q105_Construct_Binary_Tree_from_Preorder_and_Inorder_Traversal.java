/*
 * Problem Link : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    int preOrderIndex = 0;

    public int findInOrderIndex(int inOrder[], int left, int right, int target) {
        while (left <= right) {
            if (inOrder[left] == target)
                return left;
            left++;
        }
        return -1;
    }

    public TreeNode buildBinarySearchTree(int preOrder[], int inOrder[], int left, int right) {
        if (preOrderIndex >= preOrder.length)
            return null;
        else {
            TreeNode root = new TreeNode(preOrder[preOrderIndex]);

            int inOrderIndex = findInOrderIndex(inOrder, left, right, preOrder[preOrderIndex]);

            if (inOrderIndex == -1)
                return null;

            preOrderIndex++;

            root.left = buildBinarySearchTree(preOrder, inOrder, left, inOrderIndex - 1);
            root.right = buildBinarySearchTree(preOrder, inOrder, inOrderIndex + 1, right);

            return root;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0 || preorder.length == 0)
            return null;

        return buildBinarySearchTree(preorder, inorder, 0, preorder.length - 1);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int x) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
