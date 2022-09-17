import java.util.Scanner;
public class DQapp
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter size of Dequeue : ");
        Deque <Integer> Dq=new <Integer> Deque(S.nextInt());
        int c=0;
        do
        {
            System.out.println("1.InsertFront");
            System.out.println("2.InsertBack");
            System.out.println("3.PeekFront");
            System.out.println("4.PeekRear");
            System.out.println("5.DeleteFront");
            System.out.println("6.DeleteRear");
            System.out.println("7.is empty");
            System.out.println("8.display");
            System.out.println("9.exit");
            c=S.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter value to insert : ");
                    Dq.insertFront(S.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value to insert : ");
                    Dq.insertRear(S.nextInt());
                    break;
                case 3:
                    System.out.println("Value in front is : "+Dq.peekFront());
                    break;
                case 4:
                    System.out.println("Value in rear is : "+Dq.peekRear());
                    break;
                case 5:
                    Dq.deleteFront();
                    break;
                case 6:
                    Dq.deleteRear();
                    break;
                case 7:
                    System.out.println(Dq.isEmpty());
                    break;
                case 8:
                    System.out.println("Displaying values.....");
                    Dq.display();
                    break;
                case 9:
                    System.out.println("Exit Prompt!");
                    break;
                default:
                    System.out.println("invalid input!");
                    break;
            }
        }
        while(c!=9);
    }
}