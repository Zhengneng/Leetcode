public class SwapNote {
	public static ListNode swapPairs(ListNode head) {
		if(head == null)
			return head;
		else if(head.next == null)
			return head;
		
		ListNode p1 = head, p2 = head, p3 = null;
		p2 = p2.next;

		while(p2 != null){
			p1.next = p2.next;
			p2.next = p1;
			p3 = p1;
			if(head == p1)
				head = p2;
			if(p1.next != null){
			p1 = p1.next;
			p2 = p1.next;
			if(p2 != null)
			p3.next = p2;
			else
				p3.next = p1;
			}
			else break;
		}
		return head;
	}

public static void main(String[] args){
	ListNode h = new ListNode(1);
	ListNode n2 = new ListNode(2);
	ListNode n3 = new ListNode(3);
	ListNode n4 = new ListNode(4);
	ListNode n5 = new ListNode(5);
//	ListNode n6 = new ListNode(6);
	h.next = n2;
	n2.next = n3;
	n3.next = n4;
	n4.next = n5;
//	n5.next = n6;
	ListNode h1 = swapPairs(h);
	while(h1 != null)
	{
		System.out.print(h1.val);
		h1 = h1.next;
	}
}
	}
