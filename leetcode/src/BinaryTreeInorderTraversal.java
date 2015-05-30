import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> inorder = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.isEmpty() || root!=null){
			if(root != null){
				stack.push(root);
				root = root.left;
			}else{
				root = stack.pop();
				inorder.add(root.val);
				root=root.right;
			}
		}
		return inorder;
	}
}
