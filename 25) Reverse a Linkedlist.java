public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> dummy= null;
		while(head!=null){
			LinkedListNode<Integer> next = head.next;
			head.next = dummy;
			dummy = head;
			head = next;
		}
		return dummy;
    }
}