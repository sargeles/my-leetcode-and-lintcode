package algorithm;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class InvertTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
            return null;
        }
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
	}
}
/*
public class Solution {
    public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;
		TreeNode temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}*/
