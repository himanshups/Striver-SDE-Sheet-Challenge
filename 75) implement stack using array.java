import java.util.* ;
import java.io.*; 

public class Stack {
    int[] stk;
    int i,j,cap;
    Stack(int capacity)
    {
     this.stk = new int[capacity]; 
     this.cap = capacity;
     this.i = 0;
     this.j = 0;
    }
    void push(int num) {
        
       if(j-i!=cap)
       {
           stk[j++] = num;
       }
      
    }
    int pop() {
        
        if(i!=j)
        {
            j--;
            return stk[j];
        }
        return -1;
    }
    int top() {
     
        if(i!=j)return stk[j-1];
        return -1;
        
    }
    int isEmpty() {
    
        
        if(i==j )return 1;
        return 0;
    }
    int isFull() {
        if(j-i==cap)return 1;
        return 0;
    }

    
}
