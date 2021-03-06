public class MaxDepth {
	public static int maxDepth(TreeNode root) {
		
		if(root == null)
			return 0;
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode r21 = new TreeNode(2);
		TreeNode r22 = new TreeNode(2);
		TreeNode r31 = new TreeNode(3);
		TreeNode r32 = new TreeNode(3);
		TreeNode r41 = new TreeNode(4);
		TreeNode r42 = new TreeNode(5);
		TreeNode r52 = new TreeNode(6);
		root.left = r21;
		root.right = r22;
		r21.left = r31;
		r22.right = r32;
		r31.left = r41;
		r32.right = r42;
		r42.left = r52;
		int temp = maxDepth(root);
		System.out.print(temp);
	}
}
