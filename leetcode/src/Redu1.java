
public class Redu1 {
	public static ListNode deleteDuplicates(ListNode head){
		if(head == null){
			return null;
		}
		ListNode p1=head, p2=head;
		p2 = p2.next;
		while(p2 != null){
			if(p1.val == p2.val){
				p2 = p2.next;
			}
			else
			{
				p1.next = p2;
				p1 = p2;
				p2 = p2.next;
			}
			}
		if(p1 !=null)
		p1.next = null;
		return head;
	}
	public static void main(String[] args){
		ListNode head = new ListNode(1);
//		ListNode n2 = new ListNode(1);
//		ListNode n3 = new ListNode(1);
//		ListNode n4 = new ListNode(1);
//		ListNode n5 = new ListNode(1);
//		head.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
		ListNode h1 = deleteDuplicates(head);
		while(h1 != null)
		{
			System.out.print(h1.val);
			h1 = h1.next;
		}
		
		
	}
}
