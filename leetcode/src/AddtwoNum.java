public class AddtwoNum {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode p1 = l1, p2 = l2;
		boolean b = false;
		int i = 0, j = 0;
		while (p1 != null) {
			i++;
			p1 = p1.next;
		}
		p1 = l1;
		while (p2 != null) {
			j++;
			p2 = p2.next;
		}
		p2 = l2;
		if (i > j) {
			while (p2 != null) {
				if (!b)
					p1.val = p1.val + p2.val;
				else{
					p1.val = p1.val + p2.val + 1;
					b = false;
				}
				if (p1.val >= 10) {
					p1.val = p1.val - 10;
					b = true;
				}
				if (b && p2.next == null) {
					p1.next.val++;
					p1 = p1.next;
					while (p1.val > 9 && p1.next != null) {
						p1.val = p1.val - 10;
						p1 = p1.next;
						p1.val++;
					}
					if (p1.val > 9) {
						p1.val = p1.val - 10;
						ListNode lnew = new ListNode(1);
						p1.next = lnew;
					}
				} else {
					p1 = p1.next;
				}
				p2 = p2.next;
			}
			return l1;
		} else if (i < j) {
			while (p1 != null) {
				if (!b)
					p2.val = p2.val + p1.val;
				else{
					p2.val = p2.val + p1.val + 1;
					b=false;
				}
				if (p2.val >= 10) {
					p2.val = p2.val - 10;
					b = true;
				}
				if (b && p1.next == null) {
					p2.next.val++;
					p2 = p2.next;
					while (p2.val > 9 && p2.next != null) {
						p2.val = p2.val - 10;
						p2 = p2.next;
						p2.val++;
					}
					if (p2.val > 9) {
						p2.val = p2.val - 10;
						ListNode lnew = new ListNode(1);
						p2.next = lnew;
					}
				} else {
					p2 = p2.next;
				}
				p1 = p1.next;
			}
			return l2;
		} else {
			while (p1 != null) {
				if (!b)
					p2.val = p2.val + p1.val;
				else{
					p2.val = p2.val + p1.val + 1;
					b = false;
				}
				b = false;
				if (p2.val >= 10) {
					p2.val = p2.val - 10;
					b = true;
				}
				if (b && p1.next == null) {
					ListNode lnew = new ListNode(1);
					p2.next = lnew;
				} else
					p2 = p2.next;
				p1 = p1.next;
			}
			return l2;
		}

	}

	public static void main(String[] args) {
		ListNode l11 = new ListNode(0);
		ListNode l12 = new ListNode(8);
		ListNode l13 = new ListNode(6);
//		ListNode l14 = new ListNode(0);
//		ListNode l15 = new ListNode(1);
//		ListNode l16 = new ListNode(9);
//		ListNode l17 = new ListNode(0);
//		ListNode l18 = new ListNode(1);
//		ListNode l19 = new ListNode(6);
//		ListNode l20 = new ListNode(1);
		l11.next = l12;
		l12.next = l13;
//		l13.next = l14;
//		l14.next = l15;
//		l15.next = l16;
//		l16.next = l17;
//		l17.next = l18;
//		l18.next = l19;
//		l19.next = l20;
		ListNode l21 = new ListNode(6);
		ListNode l22 = new ListNode(7);
		ListNode l23 = new ListNode(8);
//		ListNode l24 = new ListNode(6);
//		ListNode l25 = new ListNode(2);
//		ListNode l26 = new ListNode(5);
//		ListNode l27 = new ListNode(8);
//		ListNode l28 = new ListNode(2);
//		ListNode l29 = new ListNode(6);
//		ListNode l30 = new ListNode(1);
		l21.next = l22;
		l22.next = l23;
//		l23.next = l24;
//		l24.next = l25;
//		l25.next = l26;
//		l26.next = l27;
//		l27.next = l28;
//		l28.next = l29;
//		l29.next = l30;

		ListNode h = addTwoNumbers(l11, l21);
		while (h != null) {
			System.out.print(h.val);
			h = h.next;
		}
	}
}
