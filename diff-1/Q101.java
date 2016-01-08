/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // recursively
public class Solution {
	public boolean isSymmetric(TreeNode left, TreeNode right){
		if(left==null && right==null) return true;
		if(left==null || right==null) return false;
		if(left.val != right.val) return false;  //同时不为null, 才可以比较值的大小
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}
	
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
		return isSymmetric(root.left, root.right)
    }
}

//iteratively?