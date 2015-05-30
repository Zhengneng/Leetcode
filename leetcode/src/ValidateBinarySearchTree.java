public class ValidateBinarySearchTree {
	public static boolean isValidBST(TreeNode root) {  
        return validate(root, 0, 0, false, false);  
    }  
      
    public static boolean validate(TreeNode root, int max, int min, boolean hash_min, boolean hash_max){  
        if(root == null) {  
            return true;  
        }  
          
        if(hash_min && root.val <= min){  
            return false;  
        }  
        if(hash_max && root.val >= max){  
            return false;  
        }   
        return validate(root.left, root.val, min, hash_min, true) && validate(root.right, max, root.val, true, hash_max);  
    }   

	public static void main(String[] args) {
		TreeNode root = new TreeNode(100);
		TreeNode r21 = new TreeNode(50);
		TreeNode r22 = new TreeNode(200);
		TreeNode r31 = new TreeNode(25);
		TreeNode r32 = new TreeNode(75);
		TreeNode r33 = new TreeNode(150);
		TreeNode r34 = new TreeNode(250);
		root.left = r21;
		root.right = r22;
		r21.left = r31;
		r21.right = r32;
		r22.left = r33;
		r22.right = r34;
		if (isValidBST(root))
			System.out.print("True!");
		else
			System.out.print("False!");
	}
}
