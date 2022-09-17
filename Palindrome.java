import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        Stack <Character> Stk=new <Character> Stack();
        System.out.println("Enter the String : ");
        String S=Sc.nextLine();
        S=S.toLowerCase();
        for(int i=0;i<S.length();i++)
        {
            Stk.push(S.charAt(i));
        }
        boolean palindrome=false;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=Stk.pop())
            {
                palindrome=false;
                break;
            }
            else
            {
                palindrome=true;
            }
        }
        if(palindrome)
        {
            System.out.println("String is a palindrome ! ");
        }
        else 
        {
            System.out.println("String is not a palindrome ! ");
        }
    }
}