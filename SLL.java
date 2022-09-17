import java.util.Scanner;
class SLL
{
    Node head=null;
    Node tail=null;
    SLL()
    {
        head=null;
    }

    SLL(int a)
    { 
        head= new Node(a);
    }

    void insertFront(int x)
    {
        if(head==null)
        {
            head=new Node(x);
        }
        else
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
        }
        System.out.println("Displaying List Values after insertion.....");
        display();
    }

    void insertBack(int x)
    {
        if(head==null)
        {
            head=new Node(x);
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            Node tail=new Node(x);
            temp.next=tail;
        }
        System.out.println("Displaying List Values after insertion.....");
        display();
    }

    void deleteFront()
    {
        if(head==null)
        {
            System.out.println("The list is empty!");
        }
        else
        {
            head=head.next;
        }
        System.out.println("Displaying List Values after deletion.....");
        display();
    }

    void deleteBack()
    {
        if(head==null)
        {
            System.out.println("The list is empty!");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        System.out.println("Displaying List Values after deletion.....");
        display();
    }

    int search(int x)
    {
        int pos=1;
        int len=1;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                return pos;
            }
            else
            {
                pos++;
                len++;
                temp=temp.next;
            }
        }
        if(len!=pos)
        {
            return pos;
        }
        else
        {
            System.out.println("Search value not found in list! Please ignore returned value!");
            return -1;
        }
    }

    void removeElement(int x)
    {
        int pos=search(x);
        int i=1;
        Node temp=head;
        while(i<pos-1)
        {
            temp=temp.next;
            ++i;
        }
        temp.next=temp.next.next;
        System.out.println("Displaying List Values after removal.....");
        display();
    }

    void replace(int x,int y)
    {
        int pos=search(x);
        int i=1;
        Node temp=head;
        while(i<pos-1)
        {
            temp=temp.next;
            ++i;
        }
        temp.next.data=y;
        System.out.println("Displaying List Values after replacement.....");
        display();
    }

    void minMax()
    {
        Node temp=head;
        int min=temp.data;
        int max=0;
        while(temp!=null)
        {
            if(temp.data<min)
            {
                min=temp.data;
            }
            if(temp.data>max)
            {
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("Minimum value in list = "+min);
        System.out.println("Maximum value in list = "+max);
    }

    void removeDuplicates()
    {
        Node ptr1 = head, ptr2 = null;
        while (ptr1 != null && ptr1.next != null) 
        {
            ptr2 = ptr1;
            while (ptr2.next != null) 
            {
                if (ptr1.data == ptr2.next.data) 
                {
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else
                {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
        System.out.println("Displaying List Values after removing duplicates.....");
        display();
    }

    void concatenate() throws NullPointerException
    {
        Scanner S=new Scanner(System.in);
        Node temp=head;
        if(head==null)
        {
            System.out.println("List 1 is empty!");
        }
        else
        {
            int ch=0;
            SLL L2=new SLL();
            System.out.println("Creating new List....");
            do
            {
                System.out.println("1.insertFront");
                System.out.println("2.insertBack");
                System.out.println("3.deleteFront");
                System.out.println("4.deleteLast");
                System.out.println("5.Search");
                System.out.println("6.Display");
                System.out.println("7.remove Element");
                System.out.println("8.Replace Element");
                System.out.println("9.Min_Max");
                System.out.println("10.Remove Duplicates");
                System.out.println("11.Exit");
                ch=S.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("Enter the value to insert :");
                        L2.insertFront(S.nextInt());
                        System.out.println("Value has been inserted !");
                        break;
                    case 2:
                        System.out.println("Enter the value to be inserted :");
                        L2.insertBack(S.nextInt());
                        System.out.println("Value has been inserted !");
                        break;
                    case 3:
                        L2.deleteFront();
                        System.out.println("Value has been deleted !");
                        break;
                    case 4:
                        L2.deleteBack();
                        System.out.println("Value has been deleted !");
                        break;
                    case 5:
                        System.out.println("Enter search value :");
                        System.out.println("Location of Search Value is : "+L2.search(S.nextInt()));
                        break;
                    case 6:
                        System.out.println("Displaying list values ....");
                        L2.display();
                        break;
                    case 7:
                        System.out.println("Enter value to be removed : ");
                        L2.removeElement(S.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter element to be replaced : ");
                        int x1=S.nextInt();
                        System.out.println("Enter new value : ");
                        int y1=S.nextInt();
                        L2.replace(x1,y1);
                        L2.display();
                        break;
                    case 9:
                        L2.minMax();
                        break;
                    case 10:
                        L2.removeDuplicates();
                        break;
                    case 11:
                        System.out.println("Exit Prompt!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
            }
            while(ch!=11);
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=L2.head;
        }
    }

    void split(SLL L1)
    {
        SLL L2=new SLL();
        int n=L1.noe();
        Node temp=head;
        for(int i=1;i<n/2;i++)
        {
            temp=temp.next;
        }
        L2.head=temp.next;
        temp.next=null;
        System.out.println("List has been split into two halves....");
        System.out.println("Displaying list 1 :");
        L1.display();
        System.out.println("Displaying list 2 :");
        L2.display();
    }

    void merge()
    {
        System.out.println("Enter list 2 : ");
        Scanner S=new Scanner(System.in);
        if(head==null)
        {
            System.out.println("List 1 is empty!");
        }
        else
        {
            int ch=0;
            SLL L2=new SLL();
            System.out.println("Creating new List....");
            do
            {
                System.out.println("1.insertFront");
                System.out.println("2.insertBack");
                System.out.println("3.deleteFront");
                System.out.println("4.deleteLast");
                System.out.println("5.Search");
                System.out.println("6.Display");
                System.out.println("7.remove Element");
                System.out.println("8.Replace Element");
                System.out.println("9.Min_Max");
                System.out.println("10.Remove Duplicates");
                System.out.println("11.Exit");
                ch=S.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("Enter the value to insert :");
                        L2.insertFront(S.nextInt());
                        System.out.println("Value has been inserted !");
                        break;
                    case 2:
                        System.out.println("Enter the value to be inserted :");
                        L2.insertBack(S.nextInt());
                        System.out.println("Value has been inserted !");
                        break;
                    case 3:
                        L2.deleteFront();
                        System.out.println("Value has been deleted !");
                        break;
                    case 4:
                        L2.deleteBack();
                        System.out.println("Value has been deleted !");
                        break;
                    case 5:
                        System.out.println("Enter search value :");
                        System.out.println("Location of Search Value is : "+L2.search(S.nextInt()));
                        break;
                    case 6:
                        System.out.println("Displaying list values ....");
                        L2.display();
                        break;
                    case 7:
                        System.out.println("Enter value to be removed : ");
                        L2.removeElement(S.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter element to be replaced : ");
                        int x1=S.nextInt();
                        System.out.println("Enter new value : ");
                        int y1=S.nextInt();
                        L2.replace(x1,y1);
                        L2.display();
                        break;
                    case 9:
                        L2.minMax();
                        break;
                    case 10:
                        L2.removeDuplicates();
                        break;
                    case 11:
                        System.out.println("Exit Prompt!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }
            }
            while(ch!=11);
            Node temp1=this.head;
            Node temp2=L2.head;
            while(temp1!=null)
            {
                while(temp2!=null)
                {
                    if(temp2.data<temp1.data)
                    {
                        int t=temp1.data;
                        temp1.data=temp2.data;
                        temp1.next.data=t;
                    }
                    temp2=temp2.next;
                }
                temp1=temp1.next;
            }
        }
    }

    int noe()
    {
        Node temp=this.head;
        int i=1;
        while(temp.next!=null)
        {
            i++;
            temp=temp.next;
        }
        return i;
    }

    void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {

            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }
}