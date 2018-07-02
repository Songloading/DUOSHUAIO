public class RemoveLinkedlistElements {
	/**
	 * Remove the elements with certain value in a linkedlist
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		ListNode pointer = head;
		while (pointer.next != null) {
			if (pointer.next.val == val)
				pointer.next = pointer.next.next;
			else
				pointer = pointer.next;
		}
		return head.val == val ? head.next : head;
	}

	public ListNode removeElements1(ListNode head, int val) {
		if (head == null)
			return head;
		ListNode node = new ListNode(val - 1);
		node.next = head;
		head = node;
		while (node.next != null) {
			if (node.next.val == val) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}

		}
		return head.next;
	}
	public ListNode removeElements2(ListNode head, int val) {
        ListNode pre = null;
        ListNode node = new ListNode(val-1);  
        node.next = head;
        head = node;
        while(node!=null){
            if(node.val == val){
                node = pre;
                node.next = node.next.next;
             }
             pre = node;
             node = node.next;
             
        }
       return head.next;
   }
	/** Two difficults here:
	 * 1. Deal with the last element
	 * 2. Deal with "val appears in first place"
	 * 		Two	 methods deal with "val appears in first place"
	 * 		1. Ignor first element at first place and check if the val appears at 1st place, if so return next.
	 * 		2. Adding a "dummy node" at previous list and check the whole list normally but return the list
	 * 		at 2nd place.
	 * General: Should deal with problem dat "we cant go back when the first element.val==val", so we need to
	 * handle the first element case;
	 */
}
