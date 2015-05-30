
public class SymmetricTree {
	 public static boolean isSymmetric(TreeNode root) {
		 	if(root == null)
	        return true;
		 	return isSymmetric(root.left, root.right);
		 	}
	 public static boolean isSymmetric(TreeNode a, TreeNode b){
//		 if((a.left == null && b.right != null) || (a.right == null && b.left != null) || 
//				 (a.left != null && b.right == null) || (a.right != null && b.left == null))
//			 return false;
//		 else if(a.left == null && a.right == null && b.left == null && b.right == null)
//			 return true;
//		 else if(a.left != null && b.right != null && a.right == null && b.left == null)
//			 if(a.left.val == b.right.val)
//				 return isSymmetric(a.left, b.right);
//			 else return false;
//		 else if(a.right != null && b.left != null && a.left == null && b.right == null)
//			 if(a.right.val == b.left.val)
//				 return isSymmetric(a.right, b.left);
//			 else return false;
//		 else return false;
		 if(a == null && b == null)
			 return true;
		 else if(a == null || b == null)
			 return false;
		 if(a.val == b.val)
			 return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
		 else
			 return false;

	 }
	    
	 public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			TreeNode r21 = new TreeNode(2);
			TreeNode r22 = new TreeNode(2);
			TreeNode r31 = new TreeNode(3);
			TreeNode r32 = new TreeNode(3);
			TreeNode r41 = new TreeNode(4);
			TreeNode r42 = new TreeNode(5);
			root.left = r21;
			root.right = r22;
			r21.left = r31;
			r22.right = r32;
			r31.left = r41;
			r32.right = r42;
			if (isSymmetric(root))
				System.out.print("True!");
			else
				System.out.print("False!");
		}
}
