public class MgtwoSortedLs {


	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		ListNode head, p1 = l1, p2 = l2, h;
		if(p1.val <= p2.val){
			head = l1;
			p1 = p1.next;
		}
		else {
			head = l2;
			p2 = p2.next;
		}
		h = head;
		while(p1 !=null && p2 != null){
			if(p1.val <= p2.val){
				h.next = p1;
				p1 = p1.next;
				h = h.next;
			}
				else{
					h.next = p2;
					p2 = p2.next;
					h = h.next;
				}
			
		}
		if(p1 == null)
			h.next = p2;
		if(p2 == null)
			h.next = p1;
		return head;
	}
	public static void main(String[] args){
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(3);
		ListNode l13 = new ListNode(5);
		ListNode l14 = new ListNode(7);
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		ListNode l21 = new ListNode(2);
		ListNode l22 = new ListNode(4);
		ListNode l23 = new ListNode(6);
		ListNode l24 = new ListNode(8);
		l21.next = l22;
		l22.next = l23;
		l23.next = l24;
		ListNode h = mergeTwoLists(l11,l21);
		while(h != null){
			System.out.print(h.val);
			h = h.next;
		}
	}
}
