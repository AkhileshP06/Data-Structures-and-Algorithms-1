import java.util.Scanner;

class Stack<T> 
{
    T[] s ;
    int top;
    int Max=20;
	Stack () // constructor
    {
        s = (T[]) new Object[Max];
        top=-1;
    }
    Stack(int m) // 1-arg constructor
    {
        s = (T[]) new Object[m];
        top=-1;
        Max=m;
    }

    void push(T e)
    {
        if (top==9)
            System.out.println("Stack is full");
        else
        {
            top++;
            s[top]=e; // s[++top]= e;
        }
    }

    T pop()
    { 
        if (top==-1)
        {
            System.out.println("no elements to del");
            return null;
        }
        else
        {
            T temp= s[top];
            --top;
            return temp;
        }
    }

    boolean isEmpty()
    {
        if (top==-1)
            return true;
        else
            return false;
    }

    T peek()
    {
        if (isEmpty())
        { 
            System.out.println("empty");
            return null;
        }
        else
            return s[top];

    }

    void display()
    {
        int i;
        for (i=0;i<=top;i++)
            System.out.println(s[i]+" ");

    }
	public static void main (String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter size of Stack : ");
		Stack <Integer> Stk=new <Integer> Stack(S.nextInt());
        int c=0;
        do
        {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.isEmpty");
            System.out.println("4.display");
            System.out.println("5.peek");
            System.out.println("6.exit");
            c=S.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter value to push :");
                    int a=S.nextInt();
                    Stk.push(a);
                    break;
                case 2:
                    System.out.println("Element deleted is : "+Stk.pop());
                    break;
                case 3:
                    System.out.println(Stk.isEmpty());
                    break;
                case 4:
                    Stk.display();
                    break;
                case 5:
                    System.out.println(Stk.peek());
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