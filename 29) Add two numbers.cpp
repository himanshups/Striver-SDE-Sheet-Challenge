#include <bits/stdc++.h> 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
            int data;
	        Node *next;
            Node(int data)
            {
                this->data = data;
                this->next = NULL;
            }
        };

*****************************************************************/
Node*reverse(Node*&head)
{
    Node*curr=head;
    Node*prev=NULL;
    Node*next=NULL;
    while(curr!=NULL)
    {
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
void insertAtTail(Node*&head,Node*&tail,int val)
{
    Node*temp=new Node(val);
    if(head==NULL)
    {
        head=temp;
        tail=temp;
        return;
    }
    else
    {
        tail->next=temp;
        tail=temp;
    }
}
//function for add
Node*add(Node*&first,Node*&second)   
{
   Node*ansHead=NULL;
    Node*ansTail=NULL;
    int carry=0;
    while(first!=NULL || second !=NULL || carry!=0)       
    {
        int val1=0;
        if(first!=NULL)
        {
            val1=first->data;
        } 
          int val2=0;
        if(second!=NULL)
        {
            val2=second->data;
        } 
        int sum=carry + val1+val2;;
        int digit=sum%10;
        //creating node to store ans
        insertAtTail(ansHead,ansTail,digit);
        carry=sum/10;
      if(first!=NULL)
        first=first->next;
      if(second!=NULL)
        second=second->next;  
    }
    return ansHead;
    }
Node *addTwoNumbers(Node *first, Node *second)
{
    //step 1 -> Reverse input Linked list 
   // first=reverse(first);
   // second=reverse(second);
    
    //step 2 -> Add 2 Linked list
    Node *ans=add(first,second);
        
      // ans=reverse(ans);
      
//     while(ans->data == 0 && ans->next !=NULL){
//         ans=ans->next;
//     } 
          return ans;
}