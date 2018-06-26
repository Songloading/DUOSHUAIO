import java.util.Stack;

public class ReverseLinkedList {
	/**
	 * Return the reverse version of the given linked list. Input:
	 * 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		Stack<Integer> myStack = new Stack<Integer>();
		while (head != null) {
			myStack.add(head.val);
			head = head.next;
		}
		ListNode thehead = new ListNode(myStack.pop());
		ListNode toreturn = thehead;
		while (!myStack.isEmpty()) {
			toreturn.next = new ListNode(myStack.pop());
			toreturn = toreturn.next;
		}
		return thehead;
	}

	public ListNode reverseList1(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
/**
 *  Two Methods here:
 *  1 Using a stack to store every element and back storing.
 *  2 Using a traverse method to "rearrange" the list.
 */ 

}
