import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        int n;
        Scanner S=new Scanner(System.in);
        Stack <Integer> Stk=new <Integer> Stack();
        System.out.println("Enter -1 to exit !");
        do
        {
            System.out.println("Enter a number : ");
            n=S.nextInt();
            if(n==-1)
            {
                System.out.println("Exit Prompt!");
                break;
            }
            Stk.push(1);
            for(int i=2;i<=n;++i)
            {
                Stk.push(Stk.pop()*i);
            }
            System.out.println("Factorial of "+n+" = "+Stk.pop());
        }
        while(n!=-1);
    }
}