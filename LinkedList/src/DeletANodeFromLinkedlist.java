
public class DeletANodeFromLinkedlist {
	/**
	 * Given the pointer of a node in a linkedlist, delet it from the list.
	 * Input: head = [4,5,1,9], node = 5 Output: [4,1,9] Explanation: You are
	 * given the second node with value 5, the linked list should become 4 -> 1
	 * -> 9 after calling your function.
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val; //change its value
		node.next = node.next.next; //delete its original next and linked the remaining list.
	}
/**
 * Notice we cannot use node = node.next to delete the node because we just change its pointer inside of the
 * function.
 * 
 */
}
