import java.util.Scanner;
public class dllAPP
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int ch=0;
		DLL L=new DLL();
		do
		{
			System.out.println("1.insertFront");
            System.out.println("2.insertBack");
            System.out.println("3.deleteFront");
            System.out.println("4.deleteLast");
            System.out.println("5.Search");
            System.out.println("6.Display");
            System.out.println("7.reverse Display");
            System.out.println("8.Replace Element");
            System.out.println("9.Min_Max");
            System.out.println("10.Remove Duplicates");
            System.out.println("11.Concatenate ");
            System.out.println("12.Split");
            System.out.println("13.Merge");
            System.out.println("14.Exit");
            ch=S.nextInt();
            switch(ch)
            {
            case 1:
            	System.out.println("Enter value to insert : ");
            	L.insertFront(S.nextInt());
            	break;
            case 2:
            	System.out.println("Enter value to insert : ");
            	L.insertLast(S.nextInt());
            	break;
            case 3:
            	System.out.println("Value deleted is : "+L.peekFront());
            	L.deleteFront();
            	break;
            case 4:
            	System.out.println("Value deleted is : "+L.peekLast());
            	L.deleteLast();
            	break;
            case 5:
            	System.out.println("Enter value to Search : ");
            	System.out.println("Value found at location : "+L.search(S.nextInt()));
            	break;
            case 6:
            	System.out.println("Displaying list values .....");
            	L.display();
            	break;
            case 7:
            	System.out.println("Displaying List values in reverse order .....");
            	L.revDisplay();
            	break;
            case 8:
            	System.out.println("Enter the element to be replaced : ");
            	int x=S.nextInt();
            	System.out.println("Enter the value to replace with : ");
            	L.replace(x,S.nextInt());
            	break;
            case 9:
            	L.minMax();
            	break;
            case 10:
            	L.removeDuplicates();
            	break;
            case 11:
            	L.concatenate();
            	break;
            default :
            	System.out.println("Invalid Input!");
            	break;
            	
            	
            }
		}while(ch!=14);
	}
}