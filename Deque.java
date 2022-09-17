class Deque<T>
{
    int Max = 100;
    T[] Dq;
    int front;
    int rear;
    int size;

    public Deque(int s) 
    {
        Max=s;
        Dq = (T[])new Object[Max];
        front = -1;
        rear = 0;
        this.size = s;
    }

    boolean isFull() 
    {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty()
    {
        return (front == -1);
    }

    void insertFront(T a) 
    {
        if (isFull()) 
        {
            System.out.println("Overflow");
            return;
        }

        if (front == -1)
        {
            front = 0;
            rear = 0;
        }

        else if (front == 0)
        {
            front = size - 1;
        }

        else
        {
            front = front - 1;
        }

        Dq[front] = a;
    }

    void insertRear(T a)
    {
        if (isFull()) 
        {
            System.out.println(" Overflow ");
            return;
        }

        if (front == -1)
        {
            front = 0;
            rear = 0;
        }

        else if (rear == size - 1)
        {
            rear = 0;
        }

        else
        {
            rear = rear + 1;
        }

        Dq[rear] = a;
    }

    void deleteFront()
    {
        
        if (isEmpty())
        {
            System.out.println("Queue Underflow\n");
            return;
        }
        System.out.println("Deleted element is : "+peekFront());
        if (front == rear) 
        {
            front = -1;
            rear = -1;
        } 
        else if (front == size - 1)
        {
            front = 0;
        }

        else
        {
            front = front + 1;
        }
        
    }

    void deleteRear()
    {
        
        if (isEmpty()) 
        {
            System.out.println(" Underflow");
            return;
        }
        System.out.println("Deleted element is : "+peekRear());
        if (front == rear) 
        {
            front = -1;
            rear = -1;
        } 
        else if (rear == 0)
        {
            rear = size - 1;
        }
        else
        {
            rear = rear - 1;
        }
    }

    T peekFront() 
    {
        if (isEmpty()) 
        {
            System.out.println(" Underflow");
            return null;
        }
        return Dq[front];
    }

    T peekRear() 
    {
        if (isEmpty() || rear < 0)
        {
            System.out.println(" Underflow\n");
            return null;
        }
        return Dq[rear];
    }
    void display()
    {
        System.out.println("!");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(Dq[i]);
        }
    }
}