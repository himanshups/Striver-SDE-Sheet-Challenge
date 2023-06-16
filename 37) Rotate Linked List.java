/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
     public static int lengthOfLL(Node head){
        if(head==null){
            return 0;
        }
        Node cur = head;
        int h=0;
        while(cur!=null){
            h++;
            cur=cur.next;
        }
        return h;
     }
    public static Node rotate(Node head, int k) {
        // Write your code here.
         if(head==null || k==0){
            return head;
        }

        int l = lengthOfLL(head);
        if(k>=l){
            k=k%l;
        }
        if(k==0){
            return head;
        }

        int h=l-k;
        Node prev = null;
        Node cur = head;
        int i=0;
        while(i<h){
            i++;
            prev=cur;
            cur=cur.next;
        }
        prev.next = null;
        Node newHead = cur;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next = head;
        head = newHead;
        return head;
    }
}