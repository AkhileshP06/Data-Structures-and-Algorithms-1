class PQueue<T>
{
    T[] PQ;
    int front;
    int rear;
    int Max=10;
    PQueue()
    {
        front=0;
        rear = -1;
        PQ=(T[]) new Object[Max];
    }

    PQueue(int ss)
    {
        Max= ss;
        front=0;
        rear = -1;
        PQ=(T[]) new Object[Max];
    }

    void enqueue(T a)
    {
        if (rear==-1)
        {
            rear++;
            PQ[rear]=a;
        }
        else
        {
            int i=rear;
            while(i>=0)
            {
                PQ[i+1]=PQ[i];
                i--;
            }
            PQ[i+1]=a;
            rear++;
        }

    }

    T dequeue() 
    {
        if (rear!=-1)
        {
            T temp = PQ[front];
            front++;
            return temp;
        }
        else
        {
            System.out.println("Priority Queue is empty!");
            return null;
        }
    }

    boolean isEmpty() 
    {
        if(front==0 && rear==-1) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void display() 
    {
        for(int i=front; i<=rear; i++) 
        {
            System.out.println(PQ[i]);
        }
    }

    T peek() 
    {
        if(isEmpty()) 
        {
            return null;
        }
        else 
        {
            return PQ[front];
        }
    }
}