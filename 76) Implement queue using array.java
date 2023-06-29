import java.util.* ;

import java.io.*; 

public class Queue {

 

    int front;

    int rear;

    int []q = new int[5000];    

    Queue() {

        

        front = -1;

        rear = -1;

    }

 

    /*----------------- Public Functions of Queue -----------------*/

 

    boolean isEmpty() 

    {

        if( front == rear )

        {

            front = -1;

            rear = -1;

            return true;

        }

        return false;

    }

 

    void enqueue(int data) 

    {

        if( rear == q.length-1 )

        {

            return ;

        }

        rear++;

        q[rear] = data;

    }

 

    int dequeue() 

    {

        if( isEmpty() == true )

        {

            return -1;

        }

        front++;

        return q[front];

    }

 

    int front() 

    {

        if( isEmpty() == true )

        {

            return -1;

        }

        int first = front+1;

        return q[first];

    }

}

