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
public class Solution 

{

    public static Node firstNode(Node head) 

    {

        if(head==null || head.next==null) return null;

        Node slow = head;

        Node fast = head;

        Node ans = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;

            fast = fast.next.next;

            if(slow == fast){

                while(ans!=slow){

                    ans =ans.next;

                    slow = slow.next;

                }

                return ans;

            }

        }

        return null; 

    }

}