public class Solution {

    public static Node findMiddle(Node head) 

    {

        Node sp = head; 

        Node fp = head;

        while(fp != null && fp.next != null){

            sp = sp.next; 

            fp = fp.next.next; 

        }

 

        return sp; 

    }

}