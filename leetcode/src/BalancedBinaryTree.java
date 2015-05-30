
public class BalancedBinaryTree {
//	 public boolean isBalanced(TreeNode root) {
//	        return (getTreeHeight(root) != -1);
//	    }
//	 public int getTreeHeight(TreeNode root){
//		 if (root == null) 
//			 return 0;
//		 int lh = getTreeHeight(root.left);
//		 if(lh == -1) return -1;
//		 int rh = getTreeHeight(root.right);
//		 if(rh == -1) return -1;
//		 
//		 if((lh - rh)>1 || (rh - lh)>1)
//			 return -1;
//		 return (Math.max(lh, rh) + 1);
//	 }
	public boolean isBalanced(TreeNode root){
		if (root == null)
			return true;
		if(Math.abs(deph(root.left)-deph(root.right))>1)
			return false;
		return isBalanced(root.left) && isBalanced(root.right);
	}
	private int deph(TreeNode root){
		if(root == null)
			return 0;
		return 1 + Math.max(deph(root.left), deph(root.right));
	}
}
