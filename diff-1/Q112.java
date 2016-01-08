/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null || sum <0) return false;
		if(root.val==sum && root.left==null && root.right==null) return true;
		sum = sum - root.val;
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}