
public class MergeTwoSortedLists {
	/**
	 * Merge two sorted LinkedList, keep the new list in order too.
	 * Input: 1->2->4, 1->3->4
	   Output: 1->1->2->3->4->4
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val == l2.val || l1.val < l2.val) {
			ListNode node = new ListNode(l1.val);
			node.next = mergeTwoLists(l1.next, l2);
			return node;
		}

		ListNode node = new ListNode(l2.val);
		node.next = mergeTwoLists(l1, l2.next);
		return node;

	}
/**
 *  Recursively set each "next" and return the top one.
 */
}
