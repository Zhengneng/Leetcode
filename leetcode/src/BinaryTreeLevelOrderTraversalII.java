import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalII {
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null)
			queue.offer(root);
		int count = 0;
		while (!queue.isEmpty()) {
			if (count == 0) {
				list = new ArrayList<Integer>();
				res.add(list);
				count = queue.size();
			}
			TreeNode node = queue.poll();
			list.add(node.val);
			count--;
			if(node.left != null)
				queue.offer(node.left);
			if(node.right != null)
				queue.offer(node.right);
		}
		Collections.reverse(res);
		return res;
	}
}
