
/*
 * Problem Link : https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
 * Solution Link : https://www.youtube.com/watch?v=t9GTh7uLZCA
 *
 * Time Complexity :
 * Space Complexity :
*/

public class Q1372_Longest_ZigZag_Path_in_a_Binary_Tree
{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val){ this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left.left;
            this.right = right;
        }
    }

    int length = 0;

    public void findlongestZigZagPath(TreeNode root, boolean direction, int currentLength)
    {
        if(root == null)
            return;

        length = Math.max(length, currentLength);

        if(direction)
        {
            findlongestZigZagPath(root.left, false, currentLength + 1);
            findlongestZigZagPath(root.right, true, 1);
        }
        else
        {
            findlongestZigZagPath(root.right, true, currentLength + 1);
            findlongestZigZagPath(root.left, false, 1);
        }
    }

    public int longestZigZag(TreeNode root)
    {
        findlongestZigZagPath(root, false, 0);
        findlongestZigZagPath(root, true, 0);
        return length;
    }
}
