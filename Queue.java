public class Queue<T>
{
    int front;
    int rear;
    int Max=20;
    T[] Q;
    public Queue()
    {
        Q=(T[]) new Object[Max];
        Max=10;
        front=0;
        rear=-1;
    }

    public Queue(int a)
    {
        Max=a;
        Q=(T[]) new Object[Max];
        front=0;
        rear=-1;
    }

    void enqueue(T a)
    {
        if(rear==Max-1)
        {
            System.out.println("Queue is full! Cannot add elements!");
            return;
        }
        else
        {
            rear++;
            Q[rear]=a;
        }
    }

    T dequeue()
    {
        if(front==rear)
        {
            T temp=Q[front];
            front=0;
            rear=-1;
            return temp;
        }
        else
        {
            T temp=Q[front];
            front++;
            return temp;
        }
    }

    boolean isEmpty()
    {
        if(front==0&&rear==-1)
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
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
        }
        else
        {
            System.out.println("Displaying elements in Queue!");
            for(int i=front;i<=rear;i++)
            {
                System.out.println(Q[i]);
            }
        }
    }

    T peek()
    {
        if(!isEmpty())
        {
            return Q[front];
        }
        else 
        {
            System.out.println("Queue is empty!");
            return null;
        }
    }
}