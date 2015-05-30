public class SumRootToLeaf {
	public int sumNumbers(TreeNode root) {
		return sumNumbers(root, 0);
	}

	public int sumNumbers(TreeNode root, int presentSum) {
		if (root == null)
			return 0;
		int nodeSum = presentSum * 10 + root.val;
		if (root.left == null && root.right == null)
			return nodeSum;
		else
			return sumNumbers(root.left, nodeSum)
					+ sumNumbers(root.right, nodeSum);
	}
}
