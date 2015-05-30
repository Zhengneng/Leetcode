import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		int n = Math.max(lists.size(), 1);
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(n,
				new Comparator<ListNode>() {
					public int compare(ListNode a, ListNode b) {
						return a.val - b.val;
					}
				});

		for (ListNode node : lists)
			if (node != null)
				pq.offer(node);
		
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		while(!pq.isEmpty()){
			ListNode midNode = pq.poll();
			if(midNode.next != null)
				pq.offer(midNode.next);
			p.next = midNode;
			p = p.next;
		}
		return dummy.next;
	}
}
