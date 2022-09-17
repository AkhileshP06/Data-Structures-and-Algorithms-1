class Node
{
    int data;
    Node next;
    Node()
    { 
        data=-1;
        next=null;
    }

    Node(int a)
    {
        data=a;
        next=null;
    }

    Node(int a, Node n)
    { 
        data=a;
        next=n;
    }
}
