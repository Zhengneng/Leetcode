import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersEachNode {
//	public void connect(TreeLinkNode root) {
//		if(root == null)
//			return;
//		if(root.left != null)
//			root.left.next=root.right;
//		if(root.right != null && root.next != null)
//			root.right.next = root.next.left;
//		connect(root.left);
//		connect(root.right);
//	}
	public void connect(TreeLinkNode root) {
		if(root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.offer(root);
		int leftCount = 1;
		TreeLinkNode last = null;
		while(!queue.isEmpty()){
			if(leftCount == 0){
				leftCount = queue.size();
				last = null;
			}
			TreeLinkNode node = queue.poll();
			leftCount--;
			if(node.left != null)
				queue.offer(node.left);
			if(node.left != null)
				queue.offer(node.right);
			if(last != null)
				last.next = node;
			last = node;
			
		}
	}
}
