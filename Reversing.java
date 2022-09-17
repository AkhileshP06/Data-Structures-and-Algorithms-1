import java.util.Scanner;
public class Reversing
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S=Sc.nextLine();
        Stack <Character> Stk = new <Character> Stack();
        for(int i=0;i<S.length();i++)
        {
            Stk.push(S.charAt(i));
        }
        Stk.display();
        String reverse="";
        while(!Stk.isEmpty())
        {
            reverse+=Stk.pop();
        }
        System.out.println("Reversed String : "+reverse);
    }
}