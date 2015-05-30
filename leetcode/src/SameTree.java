public class SameTree {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p.val == q.val)
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false;
	}

	public static void main(String[] args) {
		TreeNode r11 = new TreeNode(1);
		TreeNode r21 = new TreeNode(2);
		TreeNode r22 = new TreeNode(3);
		TreeNode r31 = new TreeNode(4);
		r11.left = r21;
		r11.right = r22;
		r21.left = r31;
		TreeNode l11 = new TreeNode(1);
		TreeNode l21 = new TreeNode(2);
		TreeNode l22 = new TreeNode(3);
		TreeNode l31 = new TreeNode(4);
		l11.left = l21;
		l11.right = l22;
		l21.left = l31;
		if (isSameTree(l11, r11))
			System.out.print("True!");
		else
			System.out.print("False!");
	}
}
