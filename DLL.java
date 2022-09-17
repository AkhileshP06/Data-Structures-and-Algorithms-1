import java.util.Scanner;
public class DLL
{
    Node1 head=null;
    void insertFront(int x)
    {
        if(head==null)
        {
            head=new Node1(x);
        }
        else
        {
            Node1 temp=new Node1(x);
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    void insertLast(int x)
    {
        if(head==null)
        {
            head=new Node1(x);
        }
        else
        {
            Node1 temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            Node1 t1=new Node1(x);
            temp.next=t1;
            t1.prev=temp;
        }
    }
    int peekFront()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty! ignore returned value");
    		return -1;
    	}
    	else
    	{
    		return head.data;
    	}
    }
    int peekLast()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty! ignore returned value");
    		return -1;
    	}
    	else
    	{
    		Node1 temp=head;
    		while(temp.next!=null)
    		{
    			temp=temp.next;
    		}
    		return temp.data;
    	}
    }
    void deleteFront()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty! no element found to delete");
    	}
    		
    	else
    	{
    		head.next.prev=null;
    		head=head.next;
    	}
    }
    void deleteLast()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty!");
    	}
    	else
    	{
    		Node1 temp=head;
    		while(temp.next!=null)
    		{
    			temp=temp.next;
    		}
    		temp.prev.next=null;
    	}
    }
    int search(int x)
    {
    	Node1 temp=head;
    	int s=1;
    	if(head==null)
    	{
    		System.out.println("List is empty!");
    		return -1;
    	}
    	else
    	{
    		while(temp.next!=null)
        	{
        		if(temp.data==x)
        		{
        			return s;
        		}
        		else 
        		{
        			temp=temp.next;
        			s++;
        		}
        	}
    	}
    	return -1;
    }
    void replace(int x,int y)
    {
    	if(search(x)==-1)
    	{
    		System.out.println("Element not found in list!");
    		return;
    	}
    	else
    	{
    		int i=1;
    		Node1 temp=head;
    		while(i<=search(x))
    		{
    			temp=temp.next;
    		}
    		temp.data=y;
    	}
    }
    void minMax()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty!");
    	}
    	else
    	{
    		int min=head.data;
    		int max=0;
    		Node1 temp=head;
    		while(temp.next!=null)
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
    		System.out.println("Minimum value in list is : "+min);
        	System.out.println("Maximum value in list is : "+max);
    	}
    }
    void removeDuplicates()
    {
    	Node1 ptr1 = head, ptr2 = null;
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
    void concatenate()
    {
    	Scanner S=new Scanner(System.in);
    	if(head==null)
    	{
    		System.out.println("List 1 is empty!");
    		return;
    	}
    	System.out.println("Enter new list to concatenate....");
    	DLL L2=new DLL();
    	int ch=0;
    	do
    	{
    		System.out.println("1 Insert front");
    		System.out.println("2 Insert last");
    		System.out.println("3 Delete front");
    		System.out.println("4 Delete last");
    		System.out.println("5 exit");
    		ch=S.nextInt();
    		switch(ch)
    		{
    		case 1:
    			System.out.println("Enter value to insert : ");
    			L2.insertFront(S.nextInt());
    			break;
    		case 2:
    			System.out.println("Enter value to insert : ");
    			L2.insertLast(S.nextInt());
    			break;
    		case 3:
    			System.out.println("Element deleted is "+L2.peekFront());
    			L2.deleteFront();
    			break;
    		case 4:
    			System.out.println("ELement deleted is "+L2.peekLast());
    			L2.deleteLast();
    			break;
    		case 5:
    			System.out.println("Exit prompt!");
    			break;
    		default:
    			System.out.println("Invalid Input!");
    			break;
    		}
    	}while(ch!=5);
    	
    	Node1 temp=head;
    	while(temp.next!=null)
    	{
    		temp=temp.next;
    	}
    	temp.next=L2.head;
    	L2.head.prev=temp;
    	
    }
    void display()
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void revDisplay()
    {
        Node1 temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node1 t=temp;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.prev;
        }
    }
    void insertAfter(int ele,int val)
    {
        Node1 temp=head;
        while(temp.data!=ele)
        {
            temp=temp.next;
        }
        Node1 t1=new Node1(val);
        t1.next=temp.next;
        temp.next.prev=t1;
        t1.prev=temp;
        temp.next=t1;
    }
    void insertBefore(int ele,int val)
    {
        Node1 temp=head;
        while(temp.next.data!=ele)
        {
            temp=temp.next;
        }
        Node1 t1=new Node1(val);
        t1.next=temp.next;
        temp.next.prev=t1;
        t1.prev=temp;
        temp.next=t1;
    }
    void insertPosition(int pos,int val)
    {
        int i=1;
        Node1 temp=head;
        while(temp!=null)
        {
        	i++;
        	temp=temp.next;
        }
        if(pos>i)
        {
        	System.out.println("Error");
        }
        else
        {
        	i=1;
        	while(i<=pos)
        	{
        		temp=temp.next;
        		i++;
        	}
        	temp.data=val;
        	}
        }
        
    }
