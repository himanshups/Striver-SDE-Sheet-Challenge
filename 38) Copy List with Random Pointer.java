import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/
public class Solution {

    public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {

        HashMap<LinkedListNode,LinkedListNode> map = new HashMap<>();

        LinkedListNode tem = head;

        while(tem!=null){

            LinkedListNode node = new LinkedListNode(tem.data);

            map.put(tem,node);

            tem= tem.next;

        }

        tem = head;

        while(tem!=null){

            LinkedListNode p = map.get(tem);

            p.next = map.get(tem.next)!=null?map.get(tem.next):null;

            p.random = map.get(tem.random)!=null?map.get(tem.random):null;

            tem=tem.next;

        }

        return map.get(head);

    }

}
