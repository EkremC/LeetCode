package Algorithms.Easy;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class _104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}

    	int leftDepth = maxDepth(root.left);
    	int rightDepth = maxDepth(root.right);

    	if(leftDepth > rightDepth){
    		return leftDepth + 1;
    	}else{
    		return rightDepth + 1;
    	}
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
