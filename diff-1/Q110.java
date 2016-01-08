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
	public int depth(TreeNode node){
		if(node==null) return 0;
		return Math.max(depth(node.left), depth(node.right))+1;
	}
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
		int left = depth(root.left);
		int right = depth(root.right);
		if(abs(left-right)>1) return false;
		return isBalanced(root.left) && isBalanced(root.right);
    }
}