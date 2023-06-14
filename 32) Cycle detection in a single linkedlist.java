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
 }

 *****************************************************************/

public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head==null || head.next==null) return false;
        Node i = head;
        Node j = head;
        while(j!=null && j.next!=null){
            i=i.next;
            j=j.next.next;
            if(i==j) return true;
        }
        return false;
    }
}