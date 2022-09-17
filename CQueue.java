import java.util.Scanner;
public class CQueue<T>
{
    int Max = 5;
    int front, rear;
    T[] CQ;
    CQueue(int a) 
    {
        Max=a;
        CQ=(T[]) new Object[Max];
        front = -1;
        rear = -1;
    }

    boolean isFull() 
    {
        if (front == 0 && rear == Max - 1) 
        {
            return true;
        }
        if (front == rear + 1) 
        {
            return true;
        }
        return false;
    }

    boolean isEmpty()
    {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(T element) 
    {
        if (isFull()) 
        {
            System.out.println("Queue is full");
        } else 
        {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % Max;
            CQ[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    T deQueue() 
    {
        T element;
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return null;
        } 
        else
        {
            element = CQ[front];
            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else 
            {
                front = (front + 1) % Max;
            }
            return element;
        }
    }

    void display() 
    {

        int i;
        if (isEmpty())
        {
            System.out.println("Empty Queue");
        } 
        else 
        {
            System.out.println("Front -> " + front);
            System.out.println("CQ -> ");
            for (i = front; i != rear; i = (i + 1) % Max)
            {
                System.out.print(CQ[i] + " ");
            }
            System.out.println(CQ[i]);
            System.out.println("Rear -> " + rear);
        }
    }
    T peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return null;
        }
        else
        {
            return CQ[front];
        }
    }
    public static void main(String[] args) 
    {
        Scanner S=new Scanner(System.in);
        int c=0;
        System.out.println("Enter size of circular Queue : ");
        CQueue <Integer> q = new <Integer> CQueue(S.nextInt());
        do
        {
            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.isEmpty");
            System.out.println("4.display");
            System.out.println("5.peek");
            System.out.println("6.exit");
            c=S.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter value to Enqueue :");
                    int a=S.nextInt();
                    q.enQueue(a);
                    break;
                case 2:
                    System.out.println("Element deleted is : "+q.deQueue());
                    break;
                case 3:
                    System.out.println(q.isEmpty());
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Value at front = "+q.peek());
                    break;
                case 6:
                    System.out.println("Exit Prompt!");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
        while(c!=6);
    }

}