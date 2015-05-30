
public class RemoveNth {
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode p = head;
	        if(head == null || p.next == null)
	        	return null;

	        int i=0, j=0;

	        while(p.next != null){
	        	i++;
	        	p=p.next;
	        }
	        if(n>i+1 || n == 0)
	        	return head;
	        p = head;
	        if(n==i+1)
	        	return head = p.next;
	        while(j<i-n){
	        	p = p.next;
	        	j++;
	        }
	        if (n != 1)
	        	p.next = p.next.next;
	        else 
	        	p.next = null;
	        return head;
	    }
	 
	 
	 public static void main(String[] args){
			ListNode head = new ListNode(1);
			ListNode n2 = new ListNode(2);
			ListNode n3 = new ListNode(3);
			ListNode n4 = new ListNode(4);
			ListNode n5 = new ListNode(5);
			head.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n5;
			ListNode h1 = removeNthFromEnd(head, 6);
			while(h1 != null)
			{
				System.out.print(h1.val);
				h1 = h1.next;
			}
	 }
}
