import java.util.Scanner;
public class SLlistApp
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int ch=0;
        SLL L1=new SLL();
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
            System.out.println("11.Concatenate ");
            System.out.println("12.Split");
            System.out.println("13.Merge");
            System.out.println("14.Exit");
            ch=S.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the value to insert :");
                    L1.insertFront(S.nextInt());
                    System.out.println("Value has been inserted !");
                    break;
                case 2:
                    System.out.println("Enter the value to be inserted :");
                    L1.insertBack(S.nextInt());
                    System.out.println("Value has been inserted !");
                    break;
                case 3:
                    L1.deleteFront();
                    System.out.println("Value has been deleted !");
                    break;
                case 4:
                    L1.deleteBack();
                    System.out.println("Value has been deleted !");
                    break;
                case 5:
                    System.out.println("Enter search value :");
                    System.out.println("Location of Search Value is : "+L1.search(S.nextInt()));
                    break;
                case 6:
                    System.out.println("Displaying list values ....");
                    L1.display();
                    break;
                case 7:
                    System.out.println("Enter value to be removed : ");
                    L1.removeElement(S.nextInt());
                    break;
                case 8:
                    System.out.println("Enter element to be replaced : ");
                    int x=S.nextInt();
                    System.out.println("Enter new value : ");
                    int y=S.nextInt();
                    L1.replace(x,y);
                    L1.display();
                    break;
                case 9:
                    L1.minMax();
                    break;
                case 10:
                    L1.removeDuplicates();
                    break;
                case 11:
                    L1.concatenate();
                    break;
                case 12:
                    L1.split(L1);
                    break;
                case 13:
                    L1.merge();
                    break;
                case 14:
                    System.out.println("Exit prompt!");
                    break;
                default :
                    System.out.println("Invalid input !");
                    break;
            }
        }
        while(ch!=14);
    }
}