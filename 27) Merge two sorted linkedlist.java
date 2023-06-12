public class Solution {

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {

        LinkedListNode<Integer> head = new LinkedListNode(0);

        LinkedListNode<Integer> p = head;

        while(first!=null && second!=null){

            if(first.data < second.data){

                p.next=first;

                first=first.next;

            }

            else{

                p.next=second;

                second=second.next;

            }

            p=p.next;

        }

        if(first!=null){

            p.next=first;

            first=first.next;

            p=p.next;

        }

        if(second!=null){

            p.next=second;

            second=second.next;

            p=p.next;

        }

        return head.next;

    }

}